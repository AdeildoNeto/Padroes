/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ConsumidorDAO;
import DAO.EnderecoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Consumidor;
import model.Endereco;

/**
 *
 * @author joselima
 */
public class Menu extends HttpServlet {

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
        RequestDispatcher rd = null;
        String acao = request.getParameter("acao");
        
        ConsumidorDAO consumidorDao = new ConsumidorDAO();
        EnderecoDAO enderecoDao = new EnderecoDAO();
                
        switch (acao) {
            
            case "Cadastrar_usuario":
                rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_usuario.jsp");
                rd.forward(request, response);

                break;
            case "Editar_cadastro":
                Consumidor consu = (Consumidor) request.getSession().getAttribute("usuarioLogado");
                Endereco endereco = (Endereco) consu.getIdEnderecoUsuario(); 
                
                request.setAttribute("consumidorEnd", enderecoDao.listSingle(endereco.getIdEndereco()));
                request.setAttribute("consumidorDados", consumidorDao.listSingle(consu.getLoginUsuario()));
                rd = request.getRequestDispatcher("WEB-INF/view/editar_usuario.jsp");
                rd.forward(request, response);
                break;
            default:
                rd = request.getRequestDispatcher("WEB-INF/view/erro.jsp");
                rd.forward(request, response);
                break;
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
