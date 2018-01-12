(function(){
   'use strict';
    angular
        .module('demoApp')
        .factory('ProcesoService', ProcesoService);
    
    function ProcesoService($http, $q){
        
        var REST_SERVICE_URI = BASE_URL + '/entrega/proceso';
        
        var factory = {
            listProceso: listProceso,
        }
        
        return factory;
        
        function listProceso(){
            var deferred = $q.defer();
            $http.get(REST_SERVICE_URI)
                .then(
                    function(response){
                        deferred.resolve(response.data); 
                    },
                    function(error){
                        deferred.reject(error);
                    }
                )
            return deferred.promise;
        }
    }   
    
    ProcesoService.$inject = ['$http','$q'];
})();