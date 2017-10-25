/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;




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
import DAO.ConsumidorDAO;
import DAO.EnderecoDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import model.Usuario;

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
        String bairro = request.getParameter("bairro");
        String UF = request.getParameter("UF");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
      //  String cpf = request.getParameter("cpf");
       // String rg = request.getParameter("rg");
        //String login = request.getParameter("login");
        String complemento = request.getParameter("complemento");
        
        String id_sexo = request.getParameter("id_sexo");
        
        ConsumidorDAO consumidorDao = new ConsumidorDAO();
        Consumidor consumidorSessao = (Consumidor) request.getSession().getAttribute("usuarioLogado");
        Endereco enderecoSessao = consumidorSessao.getIdEnderecoUsuario();
        
    
       
       // if (!erros.isExisteErros()) {
           // Consumidor user = consumidor.getSingle(login);
                Consumidor consumidor_cadastro = new Consumidor();
                Endereco end = new Endereco();
                EnderecoDAO enderecoDao = new EnderecoDAO();

                end.setCepEndereco(cep);
                end.setCidadeEndereco(cidade);
                end.setNumeroEndereco(numero);
                end.setLogradouroEndereco(endereco);
                end.setEstadoUsuario(UF);
                end.setBairroEndereco(bairro);
                end.setComplementoEndereco(complemento);
                end.setIdEndereco(enderecoSessao.getIdEndereco());
                
                consumidor_cadastro.setDtype(consumidorSessao.getDtype());
                consumidor_cadastro.setIdUsuario(consumidorSessao.getIdUsuario());
                consumidor_cadastro.setCPFconsumidor(consumidorSessao.getCPFconsumidor());
                consumidor_cadastro.setRGconsumidor(consumidorSessao.getRGconsumidor());
                consumidor_cadastro.setEmailUsuario(email);
                consumidor_cadastro.setIdEnderecoUsuario(enderecoDao.atualizar(end));
                consumidor_cadastro.setNomeUsuario(nome);
                consumidor_cadastro.setTelefoneUsuario(telefone);

                consumidor_cadastro.setLoginUsuario(consumidorSessao.getLoginUsuario());
                //consumidor_cadastro.setSenhaUsuario(senha);
              //  consumidor_cadastro.setTipousuarios(2);
                consumidor_cadastro.setDataNascimentoConsumidor(data_nascimento);
                consumidor_cadastro.setSexoConsumidor(id_sexo);

                consumidorDao.atualizar(consumidor_cadastro);
                //erros.add("Cadastro atualizado");
               /* Consumidor consumidor = consumidorDao.getSingle(consumidorSessao.getLoginUsuario());
                HttpSession session = request.getSession();
                session.setAttribute("usuarioLogado", consumidor);*/
            
        
      //  request.getSession().setAttribute ("mensagens", erros);
        response.sendRedirect("Menu?acao=minha_conta");
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
