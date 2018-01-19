(function(){
	'use strict';
	angular
		.module('venp')
		.controller('InstitucionController', InstitucionController);

		InstitucionController.$inject = ['$scope','InstitucionService'];

		function InstitucionController($scope,InstitucionService){
			var self = this;
			self.institucion = {id:null,nombre:'',tipo:'',ruc:'',direccion:'',tlfnoPrincipal:'',tlfnoAlterno:'',correo:'',logo:null};
			self.instituciones = [];
                        
			self.fetchAll = fetchAll;
			self.get = get;
			self.save = save;
			self.remove = remove;	
			self.reset = reset;
                        
                        self.fetchAll();

			function fetchAll(){
                            InstitucionService.fetchAll()
                                .then(
                                    function(data){
                                        self.instituciones = data;
                                    },
                                    function(error){
                                        console.log(error);
                                    }
                                )
			}

			function get(){

			}

			function save(){

			}

			function remove(){

			}

			function reset(){
				self.institucion = {id:null,nombre:'',tipo:'',ruc:'',direccion:'',tlfnoPrincipal:'',tlfnoAlterno:'',correo:'',logo:null};
				$scope.institucionForm.$setPristine();
			}			
		}

})();