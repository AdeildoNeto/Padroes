<%-- 
    Document   : index.jsp
    Created on : Jun 27, 2017, 2:25:03 PM
    Author     : aldo_neto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>iBebo</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">		
    </head>
    <body>
         <div class="caixa_login">
                <form method="post" action="LoginServlet">										
                    <div class="form-group">
                        <label class="control-label" id="nomeCaixa">Login:</label>
                        <input class="form-control" type="text" name="login" id="login" value="" placeholder="Insira seu login" required/>
                    </div>
                    <div class="form-group">
                        <label class="control-label" id="nomeCaixa">Senha:</label>
                        <input class="form-control" type="password" name="senha" id="senha" value="" placeholder="Insira sua senha" required/>
                    </div>
                    <div class="form-group">
                        <input href="#" class="form-control btn btn-default" type="submit" name="btn_login" value="Entrar"/>	
                    </div>
                </form>
            </div>
            <a href="Menu?acao=Cadastrar_usuario" id="">Cadastrar Usuário</a>
    </body>
</html>
