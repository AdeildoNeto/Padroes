<%-- 
    Document   : cadastrar_usuario
    Created on : 27/06/2017, 14:22:32
    Author     : joselima
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
                    <div class="col-md-7">
                        <h1>Novo cadastro / Login</h1>
                    </div>
                    <div class="col-md-5">
                        <ul class="breadcrumb">
                            <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a>
                            </li>
                            <li>Novo cadastro / Login</li>
                        </ul>

                    </div>
                </div>
            </div>
        </div>

        <div id="content">
            <div class="container">

                <div class="row">
                    <div class="col-md-6">
                        <div class="box">
                            <h2 class="text-uppercase">Novo cadastro</h2>
                            <hr>

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
                                <div class="text-center">
                                    <button type="submit" class="btn btn-template-main"><i class="fa fa-user-md"></i> Cadastrar</button>
                                    <button type="reset" class="btn btn-template-main"><i class="fa fa-user-md"></i> Limpar</button>
                                </div>
                        </form>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="box">
                            <h2 class="text-uppercase">Login</h2>

                            <hr>

                            <form action="LoginServlet" method="post">
                                <div class="form-group">
                                    <label for="login">Login</label>
                                    <input type="text" class="form-control" name="login" id="login_modal" placeholder="login">
                                </div>
                                <div class="form-group">
                                    <label for="senha">Senha</label>
                                    <input type="password" class="form-control" name="senha" id="senha_modal" placeholder="senha">
                                </div>

                                <div class="text-center">
                                    <button class="btn btn-template-main"><i class="fa fa-sign-in"></i> Entrar</button>
                                </div>

                            </form>
                        </div>
                    </div>

                </div>
                <!-- /.row -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** GET IT ***
_________________________________________________________ -->

       


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
