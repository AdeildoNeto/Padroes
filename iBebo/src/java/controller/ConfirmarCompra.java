/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnderecoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Compra;
import model.Consumidor;
import model.Endereco;
import model.Produto;
import model.Usuario;

/**
 *
 * @author aldo_neto
 */
public class ConfirmarCompra extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    List listaProduto = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //listaProduto = (List) request.getSession().getAttribute("lista_produto");
        RequestDispatcher rd = null;
        EnderecoDAO enderecoDao = new EnderecoDAO();
        Consumidor consumidor = (Consumidor) request.getSession().getAttribute("usuarioLogado");
        Produto produto = new Produto();

        if (consumidor != null) {
            listaProduto = (List) request.getSession().getAttribute("lista_produto");

            if (listaProduto.get(0) != null) {

                for (int i = 0; i < listaProduto.size(); i++) 
                {

                    produto = (Produto) listaProduto.get(i);
                    Compra compra = new Compra();
                    compra.setPagamentoCollection(listaProduto);
                    compra.setIdConsumidorCompra(consumidor);
                    compra.setIdProdutoCompra(listaProduto);
                    Compra teste = compra;

                }
            }
                Endereco endereco = consumidor.getIdEnderecoUsuario();
                request.setAttribute("endereco_confirma", enderecoDao.listSingle(endereco.getIdEndereco()));
                rd = request.getRequestDispatcher("Menu?acao=endereco");
                rd.forward(request, response);
            } else {
                rd = request.getRequestDispatcher("Menu?acao=Cadastrar_usuario");
                rd.forward(request, response);
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
