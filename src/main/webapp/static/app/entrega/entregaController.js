(function(){
    'use strict';
    angular
        .module('demoApp')
        .controller('EntregaController',EntregaController);    
    
    function EntregaController($scope, ProcesoService){
        var self = this;
        self.lstProceso = [];
        
        listProceso();
        function listProceso(){
            ProcesoService.listProceso()
                    .then(
                        function(data){
                            self.lstProceso = data;
                        },
                        function(error){
                            console.log('No se encontraron los datos solicitados');
                        }
                    )
        }        
    }
    
    EntregaController.$inject = ['$scope','ProcesoService'];
})();

