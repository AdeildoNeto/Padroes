/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import DAO.TipoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import model.Endereco;
import model.Tipo;
import model.Usuario;

/**
 *
 * @author carlo
 */
public class CarrinhoCompras extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    List lista;
    List lista_produtos = new ArrayList();
    List lista_teste = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       

        RequestDispatcher rd = null;
        ProdutoDAO produtoDao = new ProdutoDAO();
        Integer id_produto_carrinho = (Integer) request.getSession().getAttribute("id_produto");
        if (id_produto_carrinho != null) {
            lista = produtoDao.getSingle(id_produto_carrinho);
            Object produto = lista.get(0);
            lista_produtos.add(produto);
            request.getSession().setAttribute("lista_produto", lista_produtos);
            request.setAttribute("detalhe_prod_carrinho", lista_produtos);
            request.getSession().setAttribute("id_produto", null);

        } else {

            lista_teste = (List) request.getSession().getAttribute("lista_produto");
            request.setAttribute("detalhe_prod_carrinho", lista_teste);
        }
        rd = request.getRequestDispatcher("WEB-INF/view/carrinho_compras.jsp");
        rd.forward(request, response);

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
