'use strict';

var App = angular.module('myApp',['ui.router']);
var spy = function(strLog) {
	console.log(strLog);
}

var getKeys = function(argLog, obj) {
	// var keys = [];
	for ( var key in obj) {
		spy(argLog + " - " + key + ".value  = " + obj[key]);
	}
}
App.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){
	
	$urlRouterProvider.otherwise("/category")
	
	$stateProvider
	.state('category', {
		url: "/category",
		templateUrl: 'category',
		controller : "CategoryController as ctgController",
		resolve: {
            async: ['ItemService', function(ItemService) {
                var data =  ItemService.fetchCategoryList();
                return data ;
           	}]
        }
	})

	.state('category.list', {
		url: '/{categoryId:[A-Za-z]{0,9}}',
		templateUrl: function(params){ return 'category/' + params.categoryId; },
		controller : "ItemListController as itemListCtrl",
		resolve: {
            async: ['ItemService', '$stateParams', function(ItemService, $stateParams) {
                return ItemService.fetchAllItems($stateParams.categoryId);
           	}]
        }
	})

	.state('category.list.detail', {
		url: '/{itemId:[0-9]{1,9}}',
		templateUrl: function(params){ return 'category/' + params.categoryId +'/'+params.itemId; },
		controller : "ItemDetailsController as itemDetailsCtrl",
		resolve: {
            async: ['ItemService', '$stateParams', function(ItemService, $stateParams) {
                return ItemService.fetchSpecificItem($stateParams.categoryId, $stateParams.itemId);
           	}]
        }
	})

}]);

