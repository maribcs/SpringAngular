<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/lib/bootstrap-3.3.7-dist/css/bootstrap.min.css' />">           
        <script type="text/javascript">
            var BASE_URL = '${pageContext.request.contextPath}';
        </script>
    </head>
    <body ng-app="venp">
	<header>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
			    <div class="navbar-header">
			    	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				        <span class="sr-only">Toggle navigation</span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
			    	</button>
			    	<a class="navbar-brand" href="#">VENP</a>
			    </div>
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">			    	
				    <ul class="nav navbar-nav navbar-right">				        
				        <li class="dropdown">				        	
				          	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
					          	<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
					          	OPERADOREXT1
					          	<span class="caret"></span>
				          	</a>
				          	<ul class="dropdown-menu">
					            <li><a href="#">Datos Personales</a></li>
					            <li role="separator" class="divider"></li>
					            <li><a href="#">Cerrar Sesión</a></li>
				          	</ul>
				        </li>
				    </ul>
			    </div>	    
		  	</div>
		</nav>		
	</header>
        <section ng-controller="EntregaController">
		<div class="container">			
			<section>
				<div class="list-group">
					<a href="#" class="list-group-item">
					    <h4 class="list-group-item-heading">COLEGIO PROFESIONAL DE ARQUEÓLOGOS DEL PERÚ - COARPE</h4>
					    <p class="list-group-item-text">ELECCIONES GENERALES DEL CONSEJO DIRECTIVO NACIONAL DEL COLEGIO PROFESIONAL DE ARQUEÓLOGOS DEL PERÚ PARA EL PERIODO 2018-2019</p>
					</a>
					<a href="#" class="list-group-item">
					    <h4 class="list-group-item-heading">COLEGIO MÉDICO DEL PERÚ</h4>
					    <p class="list-group-item-text">ELECCIONES GENERALES DE DIRECTIVOS DEL COMITÉ EJECUTIVO NACIONAL Y DE LOS CONSEJOS REGIONALES DEL COLEGIO MÉDICO DEL PERÚ PARA EL PERIODO 09.01.2018 - 08.01.2020</p>
					</a>
					<a href="#" class="list-group-item">
					    <h4 class="list-group-item-heading">COLEGIO DE ABOGADOS DE LIMA</h4>
					    <p class="list-group-item-text">ELECCIÓN DE DELEGADO(A) ANTE LA ASAMBLEA GENERAL, JUNTA DIRECTIVA Y JUNTA DE VIGILANCIA, PERIODO 2018-2019</p>
					</a>
				</div>
			</section>
		</div>		
	</section>
	<footer>
		
	</footer>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript" src="<c:url value='/static/lib/bootstrap-3.3.7-dist/js/bootstrap.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/lib/angular/angular.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/app/app.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/app/core/procesoService.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/app/entrega/entregaController.js'/>"></script>
    </body>
</html>
