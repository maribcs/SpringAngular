<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/lib/bootstrap-4.0.0-alpha.6-dist/css/bootstrap.min.css' />">
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/lib/icomoon/style.css' />">
	<style type="text/css">
		.option-action{
			padding: 3px;
		    background: #ccc;
		    color: #fff;
		    border-radius: 5px;
		    width: 30px;
		    display: inline-block;
		    text-align: center;
		    text-decoration: none;
		}
		.option-action:hover{
			color: #fff;
			text-decoration: none;
			opacity: 0.8;
		}
		.option-edit{
			background: #0077bf;
		}
		.option-remove{
			background: #f5616e;
		}
		.option-detail{
			background: #78d07c;
		}
	</style>
        <script type="text/javascript">
            var BASE_URL = '${pageContext.request.contextPath}';
        </script>
</head>
<body ng-app="venp">
	<header>
		<nav class="navbar bg-faded">
			<h1 class="navbar-brand">VENP</h1>
		</nav>
	</header>
	<div class="container" ng-controller="InstitucionController as instVm">
		<h2>INSTITUCIONES</h2>
		<div>
                    <!--<form class="form-inline">
                            <input type="text" name="search" class="form-control mb-2 mr-sm-2 mb-sm-0">
                            <button type="submit" class="btn btn-primary">Buscar</button>
                            <button type="button" class="btn btn-primary"><span class="icon-plus"></span> Nuevo</button>
                    </form>-->
                    <a type="button" class="btn btn-primary"><span class="icon-plus"></span> Nuevo</a>
		</div>
		<table class="table">
                    <thead class="thead-inverse">
                        <tr>
                            <th>#</th>
                            <th>NOMBRE</th>
                            <th>RUC</th>
                            <th>TEL&Eacute;FONO</th>
                            <th>OPCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="institucion in instVm.instituciones">
                            <td>{{$index+1}}</td>
                            <td>{{institucion.nombre}}</td>
                            <td>{{institucion.ruc}}</td>
                            <td>{{institucion.tlfnoPrincipal}}</td>
                            <td>
                                    <a href="" class="option-action option-edit" title="Editar"
                                       ng-click="instVm.goEdit(institucion.id)"><span class="icon-pencil"></span></a>
                                    <a href="" class="option-action option-remove" title="Eliminar"
                                       ng-click="instVm.remove(institucion.id)"><span class="icon-bin"></span></a>
                                    <a href="" class="option-action option-detail" title="Detalle"
                                       ng-click="instVm.goDetail(institucion.id)"><span class="icon-search"></span></a>
                            </td>
                        </tr>
                    </tbody>
		</table>
	</div>
	<footer>
		
	</footer>
        <script type="text/javascript" src="<c:url value='/static/lib/angular/angular.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/app/app.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/static/app/preelectoral/institucionController.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/static/app/preelectoral/institucionService.js'/>"></script>
</body>
</html>
