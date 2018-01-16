(function(){
	'use strict';
	angular
		.module('venp')
		.directive('venpChangeCase', changeCase);

		function changeCase(){
			
			var OPTION = {
				lower: 'lower',
				upper: 'upper'
			}

			var directive = {
				link: link,
				require: 'ngModel',
				restric: 'A'
			}

			return directive;

			function link(scope, element, attrs, ngModelCtrl){
				var option = attrs.venpChangeCase;	
				ngModelCtrl.$parsers.push(function(inputValue){
					if(inputValue == undefined) inputValue = '';
					var transformedInput = null;
					switch(option){
						case OPTION.lower: transformedInput = inputValue.toLowerCase(); break;
						case OPTION.upper: transformedInput = inputValue.toUpperCase(); break;
						default:
						transformedInput = inputValue;
					}
					if(transformedInput !== inputValue){
						ngModelCtrl.$setViewValue(transformedInput);
						ngModelCtrl.$render();
					}
					return transformedInput
				});	
			}
		}			
		
})();