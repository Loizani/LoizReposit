'use strict';

var App = angular.module('myApp',['ui.router']);

App.config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider,$locationProvider){
	
//	$locationProvider.hashPrefix('');
//	$urlRouterProvider.otherwise("/user")
	
		$stateProvider.state(
								'userState',
								{
									url : '/userState',
									templateUrl : '/WEB-INF/views/AngularUserManagement.jsp',								
									controller : 'UserController'
								})

}]);

