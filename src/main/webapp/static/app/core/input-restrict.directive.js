(function(){
	'use strict';
	angular
		.module('venp')
		.directive('venpRestrict', inputRestrict);

		function inputRestrict(){			
			
			var REGEXP = {
				names: /[^a-z A-Z ñÑáéíóúÁÉÍÓÚ]/g,
				numbers: /[^0-9]/g
			};

			var directive = {
				link: link,
				require: 'ngModel',
				restric: 'A'
			}

			return directive;

			function link(scope, element, attrs, ngModelCtrl){
				var pattern = attrs.venpRestrict;
				if(!REGEXP.hasOwnProperty(pattern)) pattern = null;				
				ngModelCtrl.$parsers.push(function(inputValue){
					if(inputValue == undefined) return '';
					var transformedInput = inputValue.replace(REGEXP[pattern],'');
					if(transformedInput !== inputValue){
						ngModelCtrl.$setViewValue(transformedInput);
						ngModelCtrl.$render();
					}
					return transformedInput;
				});	

			}
		}			
		
})();