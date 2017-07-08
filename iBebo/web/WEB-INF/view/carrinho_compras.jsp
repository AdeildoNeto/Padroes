<%-- 
    Document   : carrinho_compras
    Created on : 05/07/2017, 00:23:04
    Author     : carlo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta charset="utf-8">-->
        <meta name="robots" content="all,follow">
        <meta name="googlebot" content="index,follow,snippet,archive">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>IBebo - Entrega de bebida online</title>

        <meta name="keywords" content="">

        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,500,700,800' rel='stylesheet' type='text/css'>

        <!-- Bootstrap and Font Awesome css -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Css animations  -->
        <link href="css/animate.css" rel="stylesheet">

        <!-- Theme stylesheet, if possible do not edit this stylesheet -->
        <link href="css/style.default.css" rel="stylesheet" id="theme-stylesheet">

        <!-- Custom stylesheet - for your changes -->
        <link href="css/custom.css" rel="stylesheet">

        <!-- Responsivity for older IE -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

        <!-- Favicon and apple touch icons-->
        <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
        <link rel="apple-touch-icon" href="img/apple-touch-icon.png" />
        <link rel="apple-touch-icon" sizes="57x57" href="img/apple-touch-icon-57x57.png" />
        <link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72.png" />
        <link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png" />
        <link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114.png" />
        <link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png" />
        <link rel="apple-touch-icon" sizes="144x144" href="img/apple-touch-icon-144x144.png" />
        <link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png" />
        <!-- owl carousel css -->

        <link href="css/owl.carousel.css" rel="stylesheet">
        <link href="css/owl.theme.css" rel="stylesheet">
    </head>

    <body>

        <div id="all">

            <header>

                <!-- *** TOP ***
    _________________________________________________________ -->
                <div id="top">
                    <div class="container">
                        <div class="row">
                            <div class="col-xs-5 contact">
                                <p class="hidden-sm hidden-xs">Padrões de Projeto de Software Orientados a Objetos</p>
                                <p class="hidden-md hidden-lg"><a href="#" data-animate-hover="pulse"><i class="fa fa-phone"></i></a>  <a href="#" data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
                                </p>
                            </div>
                            <div class="col-xs-7">
                                <div class="social">
                                    <a href="#" class="external facebook" data-animate-hover="pulse"><i class="fa fa-facebook"></i></a>
                                    <a href="#" class="external gplus" data-animate-hover="pulse"><i class="fa fa-google-plus"></i></a>
                                    <a href="#" class="external twitter" data-animate-hover="pulse"><i class="fa fa-twitter"></i></a>
                                    <a href="#" class="email" data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
                                </div>

                                <div class="login">
                                    <c:choose>
                                        <c:when test = "${sessionScope.usuarioLogado != null }">
                                            <a href="Menu?acao=minha_conta"><i class="fa fa-user"></i> <span class="hidden-xs text-uppercase">${sessionScope.usuarioLogado.nomeUsuario}</span></a>
                                            <a href="Menu?acao=meus_pedidos"><i class="fa fa-cart-arrow-down"></i> <span class="hidden-xs text-uppercase">Meus pedidos</span></a>
                                            <a href="LogoutServlet"><i class="fa fa-close"></i> <span class="hidden-xs text-uppercase">Sair</span></a>
                                        </c:when>
                                        <c:otherwise>
                                            <a href="#" data-toggle="modal" data-target="#login-modal"><i class="fa fa-sign-in"></i> <span class="hidden-xs text-uppercase">Login</span></a>
                                            <a href="Menu?acao=Cadastrar_usuario"><i class="fa fa-user"></i> <span class="hidden-xs text-uppercase">Cadastre-se</span></a>
                                        </c:otherwise>
                                    </c:choose>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>

                <!-- *** TOP END *** -->

                <!-- *** NAVBAR ***
        _________________________________________________________ -->

                <div class="navbar-affixed-top" data-spy="affix" data-offset-top="200">

                    <div class="navbar navbar-default yamm" role="navigation" id="navbar">

                        <div class="container">
                            <div class="navbar-header">

                                <a class="navbar-brand home" href="index.jsp">
                                    <img src="img/logo2.png" alt="Ibebo logo" class="hidden-xs hidden-sm">
                                    <img src="img/logo-small2.png" alt="Ibebo logo" class="visible-xs visible-sm"><span class="sr-only">IBebo - página inicial</span>
                                </a>
                                <div class="navbar-buttons">
                                    <button type="button" class="navbar-toggle btn-template-main" data-toggle="collapse" data-target="#navigation">
                                        <span class="sr-only">Toggle navigation</span>
                                        <i class="fa fa-align-justify"></i>
                                    </button>
                                </div>
                            </div>
                            <!--/.navbar-header -->

                            <div class="navbar-collapse collapse" id="navigation">

                                <ul class="nav navbar-nav navbar-right">

                                    <!-- ========== FULL WIDTH MEGAMENU ================== -->

                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Sobre <b class="caret"></b></a>

                                        <ul class="dropdown-menu">
                                            <li>
                                                <div class="yamm-content">
                                                    <div class="row">
                                                        <div class="col-sm-6">
                                                            <img src="img/template-homepage.png" class="img-responsive hidden-xs" alt="">
                                                        </div>
                                                        <div class="col-sm-3">

                                                            <ul>
                                                                <li><a href="index.html">Quem Somos</a>
                                                                </li>
                                                                <li><a href="index2.html">Equipe</a>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-- /.yamm-content -->
                                            </li>
                                        </ul>
                                    </li>


                                    <!-- ========== FULL WIDTH MEGAMENU END ================== -->

                                    <li class="dropdown">
                                        <a href="Menu?acao=contato">Contato <b class="caret"></b></a> 
                                    </li>
                                </ul>

                            </div>
                            <!--/.nav-collapse -->



                            <div class="collapse clearfix" id="search">

                                <form class="navbar-form" role="search">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="Search">
                                        <span class="input-group-btn">

                                            <button type="submit" class="btn btn-template-main"><i class="fa fa-search"></i></button>

                                        </span>
                                    </div>
                                </form>

                            </div>
                            <!--/.nav-collapse -->

                        </div>


                    </div>
                    <!-- /#navbar -->

                </div>

                <!-- *** NAVBAR END *** -->

            </header>

            <!-- *** LOGIN MODAL ***
    _________________________________________________________ -->

            <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true">
                <div class="modal-dialog modal-sm">

                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="Login">Login</h4>
                        </div>
                        <div class="modal-body">
                            <form action="LoginServlet" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" name="login" id="login_modal" placeholder="login">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" name="senha" id="senha_modal" placeholder="senha">
                                </div>

                                <p class="text-center">
                                    <button class="btn btn-template-main"><i class="fa fa-sign-in"></i> Entrar</button>
                                </p>

                            </form>

                            <p class="text-center text-muted">Não é cadastrado?</p>
                            <p class="text-center text-muted"><a href="Menu?acao=Cadastrar_usuario"><strong>Cadastre-se agora</strong></a>!</p>

                        </div>
                    </div>
                </div>
            </div>

            <!-- *** LOGIN MODAL END *** -->

            <div id="heading-breadcrumbs">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            <h1>Carrinho de compras</h1>
                        </div>
                        <div class="col-md-6">
                            <ul class="breadcrumb">
                                <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a>
                                </li>
                                <li>Carrinho de compras</li>
                            </ul>

                        </div>
                    </div>
                </div>
            </div>

            <div id="content">
                <div class="container">

                    <div class="row">
                        <div class="col-md-12">
                            <p class="text-muted lead">Itens atuais do carrinho.</p>
                        </div>


                        <div class="col-md-9 clearfix" id="basket">

                            <div class="box">

                                <form method="post" action="${pageContext.request.contextPath}/ConfirmarCompra">
                                   
                                        <div class="table-responsive">
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th colspan="2">Produto</th>
                                                        <th>Quantidade</th>
                                                        <th>Preço</th>                                              
                                                        <th colspan="2">Total</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="produto" items="${detalhe_prod_carrinho}" varStatus="stat">
                                                    <tr>
                                                        <td>
                                                            <a href="#">
                                                                <img src="img/detailsquare.jpg" alt="White Blouse Armani">
                                                            </a>
                                                        </td>
                                                        <td><a href="#">${produto.nomeProduto}</a>
                                                        </td>
                                                        <td>
                                                            <input name="item${stat.index}" type="hidden" value="${produto.idProduto}"/>
                                                            <input name="quantidade${stat.index}" type="number" value="1" class="form-control">
                                                        </td>
                                                        <td>R$ ${produto.precoProduto}</td>
                                                        <td>$${produto.precoProduto}</td>
                                                        
                                                        </td>
                                                    </tr>
                                                   </c:forEach>
                                                </tbody>
                                                
                                                <tfoot>
                                                    <tr>
                                                        <th colspan="5">Total</th>
                                                        <th colspan="2">$00.00</th>
                                                    </tr>
                                                </tfoot>
                                            </table>

                                        </div>
                                        <!-- /.table-responsive -->

                                        <div class="box-footer">
                                            <div class="pull-left">
                                                <a href="javascript:window.history.go(-2)" class="btn btn-default"><i class="fa fa-chevron-left"></i> Continue comprando</a>
                                            </div>
                                            <div class="pull-right">
                                                <a href="ExcluirProduto" class="btn btn-default"><i class="fa fa-trash-o"></i> Excluir carrinho</a>
                                                <button type="submit" class="btn btn-template-main">Comprar <i class="fa fa-chevron-right"></i>
                                                </button>
                                            </div>
                                        </div>
                                    
                                </form>

                            </div>
                            <!-- /.box -->



                        </div>
                        <!-- /.col-md-9 -->

                        <div class="col-md-3">
                            <div class="box" id="order-summary">
                                <div class="box-header">
                                    <h3>Resumo do pedido</h3>
                                </div>

                                <div class="table-responsive">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td>Order subtotal</td>
                                                <th>$446.00</th>
                                            </tr>
                                            <tr>
                                                <td>Shipping and handling</td>
                                                <th>$10.00</th>
                                            </tr>
                                            <tr>
                                                <td>Tax</td>
                                                <th>$0.00</th>
                                            </tr>
                                            <tr class="total">
                                                <td>Total</td>
                                                <th>$456.00</th>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>

                            </div>

                        </div>
                        <!-- /.col-md-3 -->

                    </div>

                </div>
                <!-- /.container -->
            </div>
            <!-- /#content -->


            <!-- *** GET IT ***
    _________________________________________________________ -->



            <!-- *** GET IT END *** -->


            <!-- *** FOOTER ***
    _________________________________________________________ -->

            <footer id="footer">
                <div class="container">
                    <div class="col-md-3 col-sm-6">
                        <h4>Sobre</h4>

                        <p>Empresa dedicada a melhorar o seu dia</p>

                        <hr>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">



                    </div>

                    <div class="col-md-3 col-sm-6">

                        <h4>Contato</h4>

                        <p><strong>IFPE - Campus Recife</strong>

                            <br>Recife
                            <br>Pernambuco
                            <br>Brasil
                            <br>
                            <strong>TADS</strong>
                        </p>

                        <a href="Menu?acao=contato" class="btn btn-small btn-template-main">Contato</a>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->




                    <!-- /.col-md-3 -->
                </div>
                <!-- /.container -->
            </footer>
            <!-- /#footer -->

            <!-- *** FOOTER END *** -->

            <!-- *** COPYRIGHT ***
    _________________________________________________________ -->

            <div id="copyright">
                <div class="container">
                    <div class="col-md-12">
                        <p class="pull-left">&copy; 2017. IBebo /  PPSOO</p>
                        <p class="pull-right">Template by <a href="https://bootstrapious.com">Bootstrapious</a> & <a href="https://remoteplease.com">Remote Please</a>
                            <!-- Not removing these links is part of the license conditions of the template. Thanks for understanding :) If you want to use the template without the attribution links, you can do so after supporting further themes development at https://bootstrapious.com/donate  -->
                        </p>

                    </div>
                </div>
            </div>
            <!-- /#copyright -->

            <!-- *** COPYRIGHT END *** -->



        </div>
        <!-- /#all -->

        <!-- #### JAVASCRIPT FILES ### -->

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script>
            window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')
        </script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

        <script src="js/jquery.cookie.js"></script>
        <script src="js/waypoints.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/jquery.parallax-1.1.3.js"></script>
        <script src="js/front.js"></script>



        <!-- owl carousel -->
        <script src="js/owl.carousel.min.js"></script>



    </body>

</html>
