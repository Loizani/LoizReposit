'use strict';

App.controller('CategoryController', [ 'async', '$scope', '$state',
		'ItemService', function(async, $scope, $state, ItemService) {
			
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
			vm.categories = async;
			vm.fetchall = function() {
				//console.log("Dans fetchall");
				var result = ItemService.getDataCategoryList();
				console.log("fetchall() > data = '" + data + "'");
				return (result);
			};
			var datafechCatFactory ;
			function fechCatFactory () {
				console.log("Dans fechCatFactory");
                var data =  ItemService.fetchCategoryList();
                datafechCatFactory = data ;
                return data ;
           	};
			
           	vm.CatFactory = fechCatFactory();
           	
			
		} ]);
