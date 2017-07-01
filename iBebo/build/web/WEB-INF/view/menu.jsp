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
        <title>Menu</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <script> 
             function myMap() {
                var mapOptions = {
                    center: new google.maps.LatLng(51.5, -0.12),
                    zoom: 10,
                    mapTypeId: google.maps.MapTypeId.HYBRID
                }
                var map = new google.maps.Map(document.getElementById("map"), mapOptions);
            }
   
            </script>
        
      
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">iBebo</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">Pedidos</a></li>
                    <li><a href="#">Promoçoes</a></li>
                    <li><a href="#">Gerenciar conta</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Sair</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="jumbotron">
                <h1>Bem vindo ${sessionScope.usuarioLogado.nomeUsuario}!</h1>      
                <p>O iBebo é um serviço de entrega de bebidas que facilita o planejamento 
                    de sua festa o churrasco! A cerveja acabou? Não precisa mandar seu
                    sobrinho ir comprar! É só entrar no iBebo, procurar o bar ou
                    depósito mais próximo e pedir sua bebida gelada!</p>
            </div>

            Bares próximos: 
            <div id="map" style="width:400px;height:400px;background:yellow"></div>


            <div class="container">


                <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">Realizar Pedido</button>
                <div id="demo" class="collapse">
                    <br>
                    <form action="/action_page.php">
                        <input type="checkbox" name="cerveja" value="Bike"> Cerveja
                        <input type="text" name="qtdCerveja" placeholder="Quantidade de cerveja">
                        <br><br>
                        <input type="checkbox" name="vinho" value="Bike"> vinho
                        <input type="text" name="qtdVinho" placeholder="Quantidade de vinho">
                        <br><br>
                        <input type="checkbox" name="vodca" value="Bike"> Vodca
                        <input type="text" name="qtdVodca" placeholder="Quantidade de vodca">
                        <br><br>
                        <input type="checkbox" name="whisky" value="Bike"> Whisky
                        <input type="text" name="qtdWhisky" placeholder="Quantidade de Whisky">
                        <br>
                        <input type="submit">
                    </form>
                </div>
            </div>


        </div>







    </body>
    <script src="https://maps.googleapis.com/maps/api/js?callback=myMap">
      

       
        
    </script>

    
</html>
