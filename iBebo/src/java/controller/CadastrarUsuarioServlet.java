/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CartaoDAO;
import DAO.ConsumidorDAO;
import DAO.EnderecoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CartaoCredito;
import model.Consumidor;
import model.Endereco;

/**
 *
 * @author joselima
 */
public class CadastrarUsuarioServlet extends HttpServlet {

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
        //Erro erros = new Erro();
        
        String nome = request.getParameter("nome");
        String data_nascimento = request.getParameter("data_nascimento");
        String endereco = request.getParameter("endereco");
        String bairro = request.getParameter("bairro");
        String complemento = request.getParameter("complemento");
        String cep = request.getParameter("cep");
        String cidade = request.getParameter("cidade");
        String numero = request.getParameter("numero");
        String UF = request.getParameter("UF");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String confirma_senha = request.getParameter("confirma_senha");
        String sexo_consumidor = request.getParameter("sexo_consumidor");
        
        ConsumidorDAO consumidorDao = new ConsumidorDAO();
        
         if (!senha.equals(confirma_senha)) {
          //  erros.add("Os campos de senha e confirmar senha estão diferentes");
          response.sendRedirect("WEB-INF/view/erro.jsp");
        }
       // if (!erros.isExisteErros()) {
            Consumidor user = consumidorDao.getSingle(login);
            if (user != null) {
              //  erros.add("Login já cadastrado");
              response.sendRedirect("WEB-INF/view/erro.jsp");
            } else {
                Consumidor consumidor_cadastro = new Consumidor();
                Endereco end = new Endereco();
                EnderecoDAO enderecoDao = new EnderecoDAO();
                
                CartaoCredito cartao = new CartaoCredito();
                CartaoDAO cartaoDao = new CartaoDAO();
                
                end.setCepEndereco(cep);
                end.setCidadeEndereco(cidade);
                end.setNumeroEndereco(numero);
                end.setLogradouroEndereco(endereco);
                end.setBairroEndereco(bairro);
                end.setComplementoEndereco(complemento);
                end.setEstadoUsuario(UF);

                cartao.setNumeroCartaoCredito("12345");
                cartao.setDataValidadeCartaoCredito("123");
                cartao.setCodigoCartaoCredito("124");

                consumidor_cadastro.setCPFconsumidor(cpf);
                consumidor_cadastro.setRGconsumidor(rg);
                consumidor_cadastro.setEmailUsuario(email);
                consumidor_cadastro.setIdEnderecoUsuario(enderecoDao.inserir(end));
                consumidor_cadastro.setNomeUsuario(nome);
                consumidor_cadastro.setTelefoneUsuario(telefone);
                
                consumidor_cadastro.setIdCartaoConsumidor(cartaoDao.inserir(cartao));
                consumidor_cadastro.setLoginUsuario(login);
                consumidor_cadastro.setSenhaUsuario(senha);
                consumidor_cadastro.setDataNascimentoConsumidor(data_nascimento);
                consumidor_cadastro.setSexoConsumidor(sexo_consumidor);
                consumidor_cadastro.setDtype("Consumidor");
                consumidorDao.inserir(consumidor_cadastro);
             //   erros.add("Usuário Cadastrado");

            }
        
        //request.getSession().setAttribute ("mensagens", erros);
        response.sendRedirect("Menu?acao=index");
       
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
