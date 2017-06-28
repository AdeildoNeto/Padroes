<%-- 
    Document   : cadastrar_usuario
    Created on : 27/06/2017, 14:22:32
    Author     : joselima
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>IBebo - cadastro</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">


    </head>
    <body>
        <div id="wrapper" class="">
            <div id="logo" class="">
                <!--  <img id="imagem_titulo" alt="logo IBebo" src="imagens/LOGO1.png" > -->
                <h1 id="titulo_login">IBebo</h1>
                <p id="titulo_login">PPSOO</p>
            </div>

            <div class="container-fluid">
                <div class="row">
                    <div id="caixa_conteudo">
                        <h3>Cadastro</h3>
                        <div id="mensagem" style="height: 50px;">
                            <c:if test="${mensagens.existeErros}">
                                <div id="erro" class="alert">
                                    <ul  id="ul_erro">
                                        <c:forEach var="erro" items="${mensagens.erros}">
                                            <li> ${erro} </li>
                                            </c:forEach>
                                    </ul>
                                </div>
                            </c:if>
                        </div>
                        <form method="post" action="${pageContext.request.contextPath}/CadastrarUsuarioServlet">

                            <div class="form-group">
                                <label for="nome">Nome:</label>
                                <input type="text" class="form-control" name="nome" id="nome_usuario" value="" placeholder="Digite o nome" required>
                            </div>
                            <div class="form-group">
                                <label for="data_nascimento">Data de nascimento:</label>
                                <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_usuario" value="" placeholder="Digite a data de nascimento" required>
                            </div>
                            <div class="form-group">
                                <label for="endereco">Endereço:</label>
                                <input type="text" class="form-control" name="endereco" id="endereco_usuario" value="" placeholder="Digite o endereço" required>
                            </div>
                            <div class="form-group">
                                <label for="bairro">Bairro:</label>
                                <input type="text" class="form-control" name="bairro" id="bairro_usuario" value="" placeholder="Digite o bairro" required>
                            </div>
                            <div class="form-group">
                                <label for="cep">CEP:</label>
                                <input type="text" class="form-control" name="cep" id="cep_usuario" value="" placeholder="Digite o cep" required>
                            </div>
                            <div class="form-group">
                                <label for="cidade">Cidade:</label>
                                <input type="text" class="form-control" name="cidade" id="cidade_usuario" value="" placeholder="Digite a cidade" required>
                            </div>
                            <div class="form-group">
                                <label for="numero">Número:</label>
                                <input type="text" class="form-control" name="numero" id="numero_usuario" value="" placeholder="Digite o numero" required>
                            </div>
                            <div class="form-group">
                                <label for="UF">UF:</label>
                                <input type="text" class="form-control" name="UF" id="UF_usuario" value="" placeholder="Digite a UF" required>
                            </div>
                            <div class="form-group">
                                <label for="complemento">Complemento:</label>
                                <input type="text" class="form-control" name="complemento" id="complemento_usuario" value="" placeholder="Digite o complemento" required>
                            </div>
                            <div class="form-group">
                                <label for="telefone">Telefone:</label>
                                <input type="tel" class="form-control" name="telefone" id="telefone_usuario" value="" placeholder="Digite o telefone" required>
                            </div>
                            <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="email" class="form-control" name="email" id="email_usuario" value="" placeholder="Digite o email" required>
                            </div>
                            <div class="form-group">
                                <label for="cpf">CPF:</label>
                                <input type="text" class="form-control" name="cpf" id="cpf_usuario" value="" placeholder="Digite o CPF" required>
                            </div>
                            <div class="form-group">
                                <label for="rg">RG:</label>
                                <input type="text" class="form-control" name="rg" id="rg_usuario" value="" placeholder="Digite o RG" required>
                            </div>
                            <div class="form-group">
                                <label for="login">Login:</label>
                                <input type="text" class="form-control" name="login" id="login_usuario" value="" placeholder="Digite o Login" required>
                            </div>
                            <div class="form-group">
                                <label for="senha">Senha:</label>
                                <input type="password" class="form-control" name="senha" id="senha_usuario" value="" placeholder="Digite a senha" required>
                            </div>
                            <div class="form-group">
                                <label for="confirma_senha">Confirmar senha:</label>
                                <input type="password" class="form-control" name="confirma_senha" id="confirma_senha_usuario" value="" placeholder="Confirme a senha" required>
                            </div>
                            <div class="form-group">
                                <label for="select_sexo">Sexo:</label>
                                <select class="form-control" name="sexo_consumidor">
                                    <option></option>
                                    <option value="Feminino">Feminino</option>
                                    <option value="Masculino">Masculino</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <input href="#" type="submit" class="btn btn-default" name="btn_cadastro_usuario" value="Cadastrar"/>
                                <input href="#" type="reset" class="btn btn-default" name="btn_limpar_cadastro" value="Limpar"/>
                                <!-- btn btn-success btn-block -->
                            </div>
                        </form>
                    </div>
                </div>	

            </div>          
            <footer id="footer" class="">
                <div class="inner">
                    <p id=info><span ></span>&copy; IBebo. All rights reserved.</p>
                    <p id=info><span ></span>PPSOO</p>
                </div>
            </footer>
        </div>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    </body>
</html>
