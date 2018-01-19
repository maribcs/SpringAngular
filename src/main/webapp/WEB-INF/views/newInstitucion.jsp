<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/lib/bootstrap-4.0.0-alpha.6-dist/css/bootstrap.min.css' />">
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/lib/icomoon/style.css' />">
        <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/style.css' />">
	<style type="text/css">
		input[type="file"]:before{
			content: "";
			display: inline-block;
		}
	</style>
</head>
<body ng-app="venp">
	<header>
		<nav class="navbar bg-faded">
			<h1 class="navbar-brand">VENP</h1>
		</nav>
	</header>
	<div class="container" ng-controller="InstitucionController as instVm">
		<h4 style="margin-bottom: 20px;"><span ng-bind="!instVm.institucion.id ? 'CREAR INSTITUCI&Oacute;N' : 'EDITAR INSTITUCI&Oacute;N'"></span></h4>
		<div>
			<form name="institucionForm" ng-submit="instVm.save()" novalidate>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nombre</label>
					<div class="col-sm-10">
						<input type="text" name="nombre" class="form-control" required
								ng-model="instVm.institucion.nombre" venp-restrict="names" venp-change-case="upper">
						<div ng-show="institucionForm.$submitted || institucionForm.nombre.$touched">
					    	<div ng-show="institucionForm.nombre.$error.required" class="text-danger">Se requiere este campo</div>
					    </div>
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Tipo</label>
					<div class="col-sm-10">
						<select name="tipo" class="custom-select form-control"
							ng-model="instVm.institucion.tipo" required>
							<option value="">--- SELECCIONE ---</option>
							<option value="AT">ASISTENCIA T&Eacute;CNICA</option>
							<option value="N">NACI&Oacute;N</option>
						</select>
						<div ng-show="institucionForm.$submitted || institucionForm.tipo.$touched">
					    	<div ng-show="institucionForm.tipo.$error.required" class="text-danger">Se requiere este campo</div>
					    </div>
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">RUC</label>
					<div class="col-sm-10">
						<input type="text" name="ruc" class="form-control" required
							ng-model="instVm.institucion.ruc" venp-restrict="numbers" venp-change-case="upper">
						<div ng-show="institucionForm.$submitted || institucionForm.ruc.$touched">
					    	<div ng-show="institucionForm.ruc.$error.required" class="text-danger">Se requiere este campo</div>
					    </div>
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Direcci&oacute;n</label>
					<div class="col-sm-10">
						<input name="direccion" type="text" class="form-control" required 
							ng-model="instVm.institucion.direccion" venp-change-case="upper">
						<div ng-show="institucionForm.$submitted || institucionForm.direccion.$touched">
					    	<div ng-show="institucionForm.direccion.$error.required" class="text-danger">Se requiere este campo</div>
					    </div>
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Tel&eacute;fono principal</label>
					<div class="col-sm-10">
						<input name="tlfnoPrincipal" type="text" class="form-control" required 
							ng-model="instVm.institucion.tlfnoPrincipal" venp-restrict="numbers">
						<div ng-show="institucionForm.$submitted || institucionForm.tlfnoPrincipal.$touched">
					    	<div ng-show="institucionForm.tlfnoPrincipal.$error.required" class="text-danger">Se requiere este campo</div>
					    </div>
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Tel&eacute;fono alterno</label>
					<div class="col-sm-10">
						<input name="tlfnoAlterno" type="text" class="form-control" 
							ng-model="instVm.institucion.tlfnoAlterno" venp-restrict="numbers">
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Correo Electr&oacute;nico</label>
					<div class="col-sm-10">
						<input name="correo" type="email" class="form-control" required 
							ng-model="instVm.institucion.correo" venp-change-case="upper">
						<div ng-show="institucionForm.$submitted || institucionForm.correo.$touched">
					    	<div ng-show="institucionForm.correo.$error.required" class="text-danger">Se requiere este campo</div>
					    </div>
					</div>	
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Logo</label>
					<div class="col-sm-10">						
						<input name="logo" type="file" id="file" class="form-control" 
							ng-model="instVm.institucion.logo" >						  
					</div>	
				</div>
				<div class="form-group row">
			    	<div class="offset-sm-2 col-sm-10">
			        	<button type="submit" class="btn btn-primary"
			        			ng-disabled="institucionForm.$invalid">ACEPTAR</button>
			        	<button type="button" class="btn btn-primary"
			        			ng-click="instVm.reset()">CANCELAR</button>
			      	</div>
			    </div>
			</form>
		</div>
	</div>
	<footer>
		
	</footer>	
        
        <script type="text/javascript" src="<c:url value='/static/lib/angular/angular.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/app/app.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/static/app/preelectoral/institucionController.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/static/app/preelectoral/institucionService.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/static/app/core/input-restrict.directive.js' />"></script>
	<script type="text/javascript" src="<c:url value='/static/app/input-case.directive.js' />"></script>
</body>
</html>