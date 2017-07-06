/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ConsumidorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consumidor;

/**
 *
 * @author aldo_neto
 */
public class AlterarSenhaServlet extends HttpServlet {

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

        String senhaAntiga = request.getParameter("senha_antiga");
        String novaSenha = request.getParameter("nova_senha");
        String confirmaSenha = request.getParameter("confirma_senha");

        ConsumidorDAO consumidorDao = new ConsumidorDAO();
        Consumidor consumidorSessao = (Consumidor) request.getSession().getAttribute("usuarioLogado");
        
        String teste = consumidorSessao.getSenhaUsuario();
        
        if (consumidorSessao.getSenhaUsuario().equals(senhaAntiga)) {
            if (novaSenha.equals(confirmaSenha)) {
                consumidorSessao.setSenhaUsuario(novaSenha);
                consumidorDao.atualizar(consumidorSessao);
                
                response.sendRedirect("Menu?acao=minha_conta");
            } else {
                response.sendRedirect("WEB-INF/view/erro.jsp");
            }
        } else {
            response.sendRedirect("WEB-INF/view/erro.jsp");
        }

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
