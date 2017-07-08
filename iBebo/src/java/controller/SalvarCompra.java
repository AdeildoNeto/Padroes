/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cerveja;
import model.Produto;
import model.Tipo;
import model.Vinho;
import model.Vodca;
import model.Whisky;

/**
 *
 * @author aldo_neto
 */
public class SalvarCompra extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    List lista = new ArrayList();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        lista = (List) request.getSession().getAttribute("lista_produto");
        
        Produto prod = (Produto) lista.get(0);
        
        Tipo tipoProd = prod.getIdTipoProduto();
          
        int idTipoProd = tipoProd.getIdTipo();
        
        switch(idTipoProd)
        {
            case 1:
                Cerveja cerveja = new Cerveja(tipoProd);
             break;
             
            case 2:
                Vinho vinho = new Vinho(tipoProd);
                break;
            case 3:
                Vodca vodca = new Vodca(tipoProd);
                   
                break;
            case 4:
                Whisky whisky = new Whisky(tipoProd);
                break;
                
              
        }
       //  RequestDispatcher rd = null;
       // rd = request.getRequestDispatcher("WEB-INF/view/pedidos.jsp");
       //  rd.forward(request, response);
       response.sendRedirect("Menu?acao=meus_pedidos");
        
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
