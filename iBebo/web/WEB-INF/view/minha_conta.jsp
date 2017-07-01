<%-- 
    Document   : minha_conta
    Created on : 01/07/2017, 01:22:54
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

        <title>IBEBO - Entrega de bebida online</title>

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
                                    <a href="#" data-toggle="modal" data-target="#login-modal"><i class="fa fa-sign-in"></i> <span class="hidden-xs text-uppercase">Login</span></a>
                                    <a href="Menu?acao=Cadastrar_usuario"><i class="fa fa-user"></i> <span class="hidden-xs text-uppercase">Cadastre-se</span></a>
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
                                    <img src="img/logo.png" alt="Ibebo logo" class="hidden-xs hidden-sm">
                                    <img src="img/logo-small.png" alt="Ibebo logo" class="visible-xs visible-sm"><span class="sr-only">IBebo - página inicial</span>
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
                        <div class="col-md-7">
                            <h1>Minha conta</h1>
                        </div>
                        <div class="col-md-5">
                            <ul class="breadcrumb">

                                <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a>
                                </li>
                                <li>Minha conta</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <div id="content" class="clearfix">

                <div class="container">

                    <div class="row">

                        <!-- *** LEFT COLUMN ***
                             _________________________________________________________ -->

                        <div class="col-md-9 clearfix" id="customer-account">

                            <p class="lead">Altere seus dados pessoais</p>
                            <p class="text-muted">${sessionScope.usuarioLogado.nomeUsuario}</p>

                            <div class="box">

                                <div class="heading">
                                    <h3 class="text-uppercase">Alterar senha</h3>
                                </div>

                                <form>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="password_old">Old password</label>
                                                <input type="password" class="form-control" id="password_old">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="password_1">New password</label>
                                                <input type="password" class="form-control" id="password_1">
                                            </div>
                                        </div>
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="password_2">Retype new password</label>
                                                <input type="password" class="form-control" id="password_2">
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.row -->

                                    <div class="text-center">
                                        <button type="submit" class="btn btn-template-main"><i class="fa fa-save"></i> Save new password</button>
                                    </div>
                                </form>

                            </div>
                            <!-- /.box -->


                            <div class="box clearfix">
                                <div class="heading">
                                    <h3 class="text-uppercase">Detalhes Pessoais</h3>
                                </div>

                                <form method="post" action="${pageContext.request.contextPath}/EditarCadastroServlet">
                                    <c:forEach var="consumidor" items="${consumidorDados}">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="nome">Nome:</label>
                                                    <input type="text" class="form-control" name="nome" id="nome_usuario" value="${consumidor.nomeUsuario}" placeholder="Digite o nome" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="data_nascimento">Data de nascimento:</label>
                                                    <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_usuario" value="${consumidor.dataNascimentoConsumidor}" placeholder="Digite a data de nascimento" required>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- /.row -->
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="telefone">Telefone:</label>
                                                    <input type="tel" class="form-control" name="telefone" id="telefone_usuario" value="${consumidor.telefoneUsuario}" placeholder="Digite o telefone" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="email">Email:</label>
                                                    <input type="email" class="form-control" name="email" id="email_usuario" value="${consumidor.emailUsuario}" placeholder="Digite o email" required>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- /.row -->
                                        <div class="row">
                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="cpf">CPF:</label>
                                                    <input type="text" class="form-control" name="cpf" id="cpf_usuario" value="${consumidor.CPFconsumidor}" placeholder="Digite o CPF" disabled>
                                                </div>
                                            </div>
                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="rg">RG:</label>
                                                    <input type="text" class="form-control" name="rg" id="rg_usuario" value="${consumidor.RGconsumidor}" placeholder="Digite o RG" disabled>
                                                </div>
                                            </div>
                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="login">Login:</label>
                                                    <input type="text" class="form-control" name="login" id="login_usuario" value="${consumidor.loginUsuario}" placeholder="Digite o Login" disabled>
                                                </div>
                                            </div>
                                            <div class="col-sm-6 col-md-3">
                                                 <div class="form-group">
                                                    <label for="select_sexo">Sexo:</label>
                                                    <select class="form-control" name="id_sexo">
                                                        <option></option>
                                                        <option value="Feminino">Feminino</option>
                                                        <option value="Masculino">Masculino</option>
                                                    </select>
                                                </div>
                                            </div>

                                        </div>
                                    </c:forEach>

                                    <c:forEach var="end" items="${consumidorEnd}">
                                        <div class="row">
                                            
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <label for="endereco">Endereço:</label>
                                                    <input type="text" class="form-control" name="endereco" id="endereco_usuario" value="${end.logradouroEndereco}" placeholder="Digite o endereço" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="cidade">Cidade:</label>
                                                    <input type="text" class="form-control" name="cidade" id="cidade_usuario" value="${end.cidadeEndereco}" placeholder="Digite a cidade" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label for="bairro">Bairro:</label>
                                                    <input type="text" class="form-control" name="bairro" id="bairro_usuario" value="${end.bairroEndereco}" placeholder="Digite o bairro" required>
                                                </div>
                                            </div>

                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="UF">UF:</label>
                                                    <input type="text" class="form-control" name="UF" id="UF_usuario" value="${end.estadoUsuario}" placeholder="Digite a UF" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="numero">Número:</label>
                                                    <input type="text" class="form-control" name="numero" id="numero_usuario" value="${end.numeroEndereco}" placeholder="Digite o numero" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="complemento">Complemento:</label>
                                                    <input type="text" class="form-control" name="complemento" id="complemento_usuario" value="${end.complementoEndereco}" placeholder="Digite o complemento" required>
                                                </div>
                                            </div>
                                            <div class="col-sm-6 col-md-3">
                                                <div class="form-group">
                                                    <label for="cep">CEP:</label>
                                                    <input type="text" class="form-control" name="cep" id="cep_usuario" value="${end.cepEndereco}" placeholder="Digite o cep" required>
                                                </div>
                                            </div>


                                        </div>
                                    </c:forEach>

                                    <div class="col-sm-12 text-center">
                                        <button type="submit" class="btn btn-template-main"><i class="fa fa-save"></i> Salvar alterações</button>
                                    </div>
                                </form>

                            </div>
                        </div>
                        <!-- /.col-md-9 -->

                        <!-- *** LEFT COLUMN END *** -->

                        <!-- *** RIGHT COLUMN ***
                             _________________________________________________________ -->

                        <div class="col-md-3">
                            <!-- *** CUSTOMER MENU ***
     _________________________________________________________ -->
                            <div class="panel panel-default sidebar-menu">

                                <div class="panel-heading">
                                    <h3 class="panel-title">Customer section</h3>
                                </div>

                                <div class="panel-body">

                                    <ul class="nav nav-pills nav-stacked">
                                        <li class="active">
                                            <a href="customer-orders.html"><i class="fa fa-list"></i> My orders</a>
                                        </li>
                                        <li>
                                            <a href="customer-wishlist.html"><i class="fa fa-heart"></i> My wishlist</a>
                                        </li>
                                        <li>
                                            <a href="customer-account.html"><i class="fa fa-user"></i> My account</a>
                                        </li>
                                        <li>
                                            <a href="index.html"><i class="fa fa-sign-out"></i> Logout</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                            <!-- /.col-md-3 -->

                            <!-- *** CUSTOMER MENU END *** -->
                        </div>

                        <!-- *** RIGHT COLUMN END *** -->

                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.container -->
            </div>
            <!-- /#content -->


            <!-- *** GET IT ***
    _________________________________________________________ -->

            <div id="get-it">
                <div class="container">
                    <div class="col-md-8 col-sm-12">
                        <h3>Do you want cool website like this one?</h3>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <a href="#" class="btn btn-template-transparent-primary">Buy this template now</a>
                    </div>
                </div>
            </div>


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