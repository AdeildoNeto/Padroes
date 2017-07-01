/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ConsumidorDAO;
import DAO.EnderecoDAO;
import DAO.EstabelecimentoDAO;
import DAO.ProdutoDAO;
import DAO.TipoDAO;
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
        ProdutoDAO produtoDao = new ProdutoDAO();
        TipoDAO tipoDao = new TipoDAO();
        EstabelecimentoDAO estabelecimentoDao = new EstabelecimentoDAO();
                
        switch (acao) {
            
            case "Cadastrar_usuario":
                rd = request.getRequestDispatcher("WEB-INF/view/cadastrar_usuario.jsp");
                rd.forward(request, response);

                break;
            case "minha_conta":
                Consumidor consu = (Consumidor) request.getSession().getAttribute("usuarioLogado");
                Endereco endereco = (Endereco) consu.getIdEnderecoUsuario(); 
                
                request.setAttribute("consumidorEnd", enderecoDao.listSingle(endereco.getIdEndereco()));
                request.setAttribute("consumidorDados", consumidorDao.listSingle(consu.getLoginUsuario()));
                rd = request.getRequestDispatcher("WEB-INF/view/minha_conta.jsp");
                rd.forward(request, response);
                break;
            case "index":
                rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
                break;
            case "contato":
                rd = request.getRequestDispatcher("WEB-INF/view/contato.jsp");
                rd.forward(request, response);
                break;
            case "estabelecimentos":
                Object lista_estabelecimento = request.getSession().getAttribute("lista");
                request.setAttribute("lista_estab", lista_estabelecimento);
                rd = request.getRequestDispatcher("WEB-INF/view/estabelecimentos.jsp");
                rd.forward(request, response);
                break;
            case "menu_produtos":
                Integer id_estabelecimento = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("lista_tipo", tipoDao.listar());
                request.setAttribute("lista_prod", produtoDao.listaEstab(estabelecimentoDao.Single(id_estabelecimento)));
                rd = request.getRequestDispatcher("WEB-INF/view/menu_produtos.jsp");
                rd.forward(request, response);
                break;
            case "detalhe_produto":
                Integer id_produto = Integer.parseInt( request.getParameter("id"));
                request.setAttribute("lista_tipo_detalhe", tipoDao.listar());
                request.setAttribute("lista_detalhe_prod", produtoDao.getSingle(id_produto));
                rd = request.getRequestDispatcher("WEB-INF/view/detalhe_produto.jsp");
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
