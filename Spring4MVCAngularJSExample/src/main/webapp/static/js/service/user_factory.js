'use strict';

angular.module('myApp', []).factory('UserFactory',['$http','$q',UserFactory]) ;	

function UserFactory($http,$q){		

    var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/user/';
    var REST_SERVICE_DELETE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/deleteuser/';
    
    
    //function factFetchAllUsers($http, $q) {
    function localfactFetchAllUsers() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI) 
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    };
    
    var spy = function(strLog){
    	console.log(strLog);
    }

    var getKeys = function(obj){
    	   //var keys = [];
    	   for(var key in obj){
    	      spy(key + ".value  = " + obj[key]);	      
    	   }	  
    	}
    
    function localfactNonExistingURL() {
        var deferred = $q.defer();
        $http.get("'http://localhost:8080/Spring4MVCAngularJSExample/toto") 
            .then(
            function (response) {
            	console.log("UserFactory > localfactNonExistingURL() >  response : " + response);
                deferred.resolve(response.data);
            }
            
//            ,
//            function(errResponse){
//            	console.log("UserFactory > localfactNonExistingURL() >  errResponse : " + errResponse);
//                console.error('Error while fetching Users');
//                deferred.reject(errResponse);
//            }
            
        )
        .catch(
                function(error)  {
                    console.log("UserFactory > localfactNonExistingURL() > $http.catch(function(error) > error = "+ error);                    
                    if(typeof error === 'object')
                    		getKeys(error);
                    });
        
        return deferred.promise;
    };
    
/*    function  localfactNonExistingURL() {
    	var deferred = $q.defer();
        $http.get("http://127.0.0.1/server/hello_endpoint")
             .then(
                      function(response)  {
          console.log("UserFactory > localfactNonExistingURL() >  $http.then(function(response)");
          return response.data;})
             .catch(
         function(error)  {
          console.log("UserFactory > localfactNonExistingURL() > $http.catch(function(error) > error = "+ error);})
             .finally(
         function()  {
          console.log("UserFactory > localfactNonExistingURL() > $http.finally > traitement exécuté toute façon");});
        return deferred.promise;
   }*/
    
    
    function localfactCreateUser(user) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, user)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function localfactUpdateUser(user, id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+id, user)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while updating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function localfactDeleteUser(id) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_DELETE_URI+id)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while deleting User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    var factory = {
    	localfactNonExistingURL:localfactNonExistingURL,
        factoryFetchAllUsers: localfactFetchAllUsers,
        factoryCreateUser: localfactCreateUser,
        factoryUpdateUser:localfactUpdateUser,
        factoryDeleteUser:localfactDeleteUser
    };

    return factory;
} 
