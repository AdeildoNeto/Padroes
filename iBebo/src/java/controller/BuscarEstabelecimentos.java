/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnderecoDAO;
import DAO.EstabelecimentoDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Estabelecimento;
import model.Usuario;

/**
 *
 * @author carlo
 */
public class BuscarEstabelecimentos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cep = request.getParameter("cep");

        EnderecoDAO enderecoDao = new EnderecoDAO();
        EstabelecimentoDAO estabelecimentoDao = new EstabelecimentoDAO();
        Endereco endereco = new Endereco();
        Usuario usuario = null;
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Estabelecimento estabelecimento = new Estabelecimento();
        String dType = "Estabelecimento";

        List listaEndereco = enderecoDao.listaCep(cep);
        List<Estabelecimento> listaEstabelecimento = new ArrayList();

        if (listaEndereco.get(0)!= null) {
            
            for (int i = 0; i < listaEndereco.size(); i++) {
                
                endereco = (Endereco) listaEndereco.get(i);
                
                estabelecimento = estabelecimentoDao.SingleEnd(endereco);
                String dType_estabelecimento = estabelecimento.getDtype();
                if (!dType_estabelecimento.equals(dType)) 
                {
                    estabelecimento = null;
                    
                }
                else{
                   
                    listaEstabelecimento.add(estabelecimento);
                }
            }
        }
        else
        {
            response.sendRedirect("WEB-INF/view/erro.jsp");
        }
        if(listaEstabelecimento.get(0)!= null){
            
         request.getSession().setAttribute ("lista", listaEstabelecimento);
         response.sendRedirect("Menu?acao=estabelecimentos");
        }
        else{
         response.sendRedirect("WEB-INF/view/erro.jsp");
           }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
