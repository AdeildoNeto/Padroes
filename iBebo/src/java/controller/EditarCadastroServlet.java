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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joselima
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consumidor;
import model.Endereco;

/**
 *
 * @author joselima
 */
public class EditarCadastroServlet extends HttpServlet {

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
        String cep = request.getParameter("cep");
        String cidade = request.getParameter("cidade");
        String numero = request.getParameter("numero");
        String UF = request.getParameter("UF");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
       // String cpf = request.getParameter("cpf");
        //String rg = request.getParameter("rg");
        //String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String confirma_senha = request.getParameter("confirma_senha");
        String id_sexo = request.getParameter("id_sexo");
        
        ConsumidorDAO consumidor = new ConsumidorDAO();
        
         if (!senha.equals(confirma_senha)) {
          //  erros.add("Os campos de senha e confirmar senha estão diferentes");
        }
       // if (!erros.isExisteErros()) {
           // Consumidor user = consumidor.getSingle(login);
                Consumidor consumidor_cadastro = new Consumidor();
                Endereco end = new Endereco();
                EnderecoDAO enderecoDao = new EnderecoDAO();

                end.setCep(cep);
                end.setCidade(cidade);
                end.setNumero(numero);
                end.setRua(endereco);
                end.setUf(UF);

               // consumidor_cadastro.setCpf(cpf);
              //  consumidor_cadastro.setRg(rg);
                consumidor_cadastro.setEmail(email);
                consumidor_cadastro.setEnderecoIdendereco(enderecoDao.inserir(end));
                consumidor_cadastro.setNomecompleto(nome);
                consumidor_cadastro.setTelefone(telefone);

             //   consumidor_cadastro.setLogin(login);
                consumidor_cadastro.setSenha(senha);
                consumidor_cadastro.setTipousuarios(2);
                consumidor_cadastro.setDataNascimento(data_nascimento);
                consumidor_cadastro.setSexo(id_sexo);

                consumidor.inserir(consumidor_cadastro);
                //erros.add("Cadastro atualizado");

            
        
      //  request.getSession().setAttribute ("mensagens", erros);
        response.sendRedirect("Menu?acao=Editar_usuario");
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
