'use strict';

App.factory('ItemService', ['$http', '$q', function($http, $q){
	var URI_CATEGORIES = "http://localhost:8080/Spring4MVCAngularJSRoutingWithUIRouterExample/categories";
	var dataCategoryList ;
	
	var fetchCategoryList =  function() {//Fetches category list from server.
		return $http.get(URI_CATEGORIES)
		.then(
					function(response){
						dataCategoryList = response.data;
						return dataCategoryList ; 
					}, 
					function(errResponse){
						console.error('Error while fetching Items');
						return $q.reject(errResponse);
					}
			);
		} ;
		
	var getDataCategoryList = function(){return dataCategoryList};
		
	return {
		fetchCategoryList : fetchCategoryList,
		getDataCategoryList : getDataCategoryList ,
			fetchAllItems: function(category) {//Fetches list of item for a specific category.
				return $http.get('http://localhost:8080/Spring4MVCAngularJSRoutingWithUIRouterExample/item/'+category)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching Items');
										return $q.reject(errResponse);
									}
							);
			},
		    
			fetchSpecificItem: function(category,id) {//Fetches a specific item based on category and item id.
				return $http.get('http://localhost:8080/Spring4MVCAngularJSRoutingWithUIRouterExample/item/'+category+'/'+id)
						.then(
								function(response){
									return response.data;
								}, 
								function(errResponse){
									console.error('Error while fetching specific Item');
									return $q.reject(errResponse);
								}
						);
			}
	};

}]);
