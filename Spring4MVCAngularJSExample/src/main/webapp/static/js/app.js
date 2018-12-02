( function(angular) {
	'use strict';  //oblige à declarer les variables
     var App = angular.module('myApp',['ui.router']);	 

     App.config(['$stateProvider', 'UserFactory', 'UserController' ,
    	 function( $stateProvider, UserFactory, UserController ) {

    	

		  //Fin app.config 
	 
	 			$stateProvider.state(
								'userState',
								{
									url : '/userState',
									templateUrl : '/WEB-INF/views/AngularUserManagement.jsp',								
									controller : 'UserController'
								})
     }])

	 })(window.angular);	 
