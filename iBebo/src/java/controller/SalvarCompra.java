/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CompraDAO;
import DAO.PagamentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import model.Cerveja;
import model.Compra;
import model.Consumidor;
import model.Pagamento;
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
    List listaProduto = new ArrayList();
    List<Integer> lista = new ArrayList<>();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        listaProduto = (List) request.getSession().getAttribute("lista_produto");
        Consumidor consumidor = (Consumidor) request.getSession().getAttribute("usuarioLogado");
        Produto prod = (Produto) listaProduto.get(0);

        Tipo tipoProd = prod.getIdTipoProduto();

        int idTipoProd = tipoProd.getIdTipo();

        switch (idTipoProd) {
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

        for (int i = 0; i < listaProduto.size(); i++) {

                Produto produto = (Produto) listaProduto.get(i);
                
                lista.add(produto.getIdProduto());
        }
        String texto = lista.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
//List<String> lista = new ArrayList<String>(Arrays.asList(texto.split(",")));  String para list novamente
        Compra compra = new Compra();
        CompraDAO compraDao = new CompraDAO();
        Pagamento pagamento = new Pagamento();
        PagamentoDAO pagamentoDao = new PagamentoDAO();


        compra.setIdConsumidorCompra(consumidor);
        compra.setProdutosLista(texto);
        Compra compraVerifica = compraDao.inserir(compra);
        if (compraVerifica != null) {
            pagamento.setIdCompraPagamento(compraVerifica);
            pagamentoDao.inserir(pagamento);
        } else {
            response.sendRedirect("Menu?acao=confirmar_compra");
        }

        //compra.setIdProdutoCompra(listaProduto);
        //  RequestDispatcher rd = null;
        // rd = request.getRequestDispatcher("WEB-INF/view/pedidos.jsp");
        //  rd.forward(request, response);
        request.getSession().setAttribute("meus_pedidos", compraDao.listaUsuario(consumidor));
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
