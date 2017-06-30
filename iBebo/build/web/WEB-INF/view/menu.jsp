<%-- 
    Document   : Menu
    Created on : Jun 27, 2017, 3:10:31 PM
    Author     : aldo_neto
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Bem vindo ${sessionScope.usuarioLogado.nomeUsuario}! </h1>
    </body>
</html>
