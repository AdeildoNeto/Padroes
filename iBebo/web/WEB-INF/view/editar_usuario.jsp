<%-- 
    Document   : editar_usuario
    Created on : 27/06/2017, 15:58:00
    Author     : joselima
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                        <h3>Editar Cadastro</h3>
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
                        
                            
                        <form method="post" action="${pageContext.request.contextPath}/EditarCadastroServlet">
                        <c:forEach var="consumidor" items="${consumidorDados}">
                            
                            
                            
                            
                            
                            
                            
                             
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            </c:forEach>
                            
                            <c:forEach var="end" items="${consumidorEnd}">
                           
                            
                            
                            
                            
                            
                            <div class="form-group">
                                <label for="UF">UF:</label>
                                <input type="text" class="form-control" name="UF" id="UF_usuario" value="${end.estadoUsuario}" placeholder="Digite a UF" required>
                            </div>
                            
                            </c:forEach>
                            
                            <div class="form-group">
                                <input href="Cadastro_Usuario" type="submit" class="btn btn-default" name="btn_cadastro_usuario" value="Cadastrar"/>
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
