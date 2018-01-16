(function(){
	'use strict';
	angular
		.module('venp')
		.factory('InstitucionService',InstitucionService);

		function InstitucionService($http, $q){
			var REST_SERVICE = BASE_URL + '/institucion/';

			var factory = {				
				fetchAll:fetchAll,
				get:get,
				create: create,
				edit: edit,
				remove: remove
			}

			return factory;

			function fetchAll(){
				var deferred = $q.defer();
				$http.get(REST_SERVICE)
					.then(
						function(response){
							deferred.resolve(response.data);
						},
						function(errResponse){
							console.log('Error: Service')
							deferred.reject(errResponse);
						}
					);
				return deferred.promise;
			}

			function get(id){
				var deferred = $q.defer();
				$http.get(REST_SERVICE+id)
					.then(
						function(response){
							deferred.resolve(response.data);
						},
						function(errResponse){
							console.log('Error: Service')
							deferred.reject(errResponse);
						}
					);
				return deferred.promise;
			}

			function create(institucion){
				var deferred = $q.defer();
				$http.post(REST_SERVICE,institucion)
					.then(
						function(response){
							deferred.resolve(response.data);
						},
						function(errResponse){
							console.log('Error: Service')
							deferred.reject(errResponse);
						}
					);
				return deferred.promise;
			}

			function edit(institucion){
				var deferred = $q.defer();
				$http.put(REST_SERVICE,institucion)
					.then(
						function(response){
							deferred.resolve(response.data);
						},
						function(errResponse){
							console.log('Error: Service')
							deferred.reject(errResponse);
						}
					);
				return deferred.promise;
			}

			function remove(id){
				var deferred = $q.defer();
				$http.delete(REST_SERVICE+id)
					.then(
						function(response){
							deferred.resolve(response.data);
						},
						function(errResponse){
							console.log('Error: Service')
							deferred.reject(errResponse);
						}
					);
				return deferred.promise;
			}		

		}

		InstitucionService.$inject = ['$http','$q'];

})();