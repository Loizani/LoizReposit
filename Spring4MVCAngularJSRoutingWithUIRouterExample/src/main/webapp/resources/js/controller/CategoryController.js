'use strict';
 
App.controller('CategoryController', [ 'async', '$scope', '$state',
		'appFactory', function(async, $scope, $state, appFactory) {
			
			var spy = function(strLog) {
				console.log(strLog);
			}

			var getKeys = function(obj) {
				// var keys = [];
				for ( var key in obj) {
					spy(key + ".value  = " + obj[key]);
				}
			}

			var vm = this;
			vm.asyncCategories = async;
			vm.categories = async;
			vm.fetchall = function() {
				//console.log("Dans fetchall");
				var result = appFactory.getDataCategoryList();
				console.log("fetchall() > data = '" + result + "'");
				return (result);
			};
			var datafechCatFactory ;
			function fechCatFactory () {
				console.log("Dans fechCatFactory");
                var opbjData =  appFactory.fetchCategoryList();
                getKeys(opbjData);
                datafechCatFactory = opbjData ;
                return opbjData ;
           	};
			
           	vm.CatFactory = fechCatFactory();
           	
			
		} ]);
