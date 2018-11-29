'use strict';



angular.module('myApp').controller('UserController', ['$scope', 'UserFactory', function($scope, UserFactory) {
	
   var self = this;	    
    self.user={id:null,username:'',address:'',email:''};
    self.users=[];
    self.submit = submit;
    self.edit = edit;
    self.remove = remove;
    self.reset = reset;
    self.fetchAllUsers = fetchAllUsers ;
    self.NonExistingURL = NonExistingURL ;
    
    fetchAllUsers();
    
    function NonExistingURL(){
        console.log('Dans localfactNonExistingURL');
        UserFactory.localfactNonExistingURL()
             .then(
             function(reponse) {
                 console.log("localfactNonExistingURL > reponse : " + reponse);
             },
             function(errResponse){
                 console.error("localfactNonExistingURL > errResponse = " + errResponse );
             }
         );
     } ;
    
    function fetchAllUsers(){
        console.log('Dans fetchAllUsers');
        UserFactory.factoryFetchAllUsers()
             .then(
             function(d) {
                 self.users = d;
                 console.log('d : ' + d);
             },
             function(errResponse){
                 console.error('Error while fetching Users');
             }
         );
     } ;
    
    function createUser(user){
        UserFactory.factoryCreateUser(user)
            .then(  fetchAllUsers,
            		function(errResponse){
                		console.error('Error while creating User');
            		}
        );
    }
    
    function updateUser(user, id){
        UserFactory.factoryUpdateUser(user, id)
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while updating User');
            }
        );
    }
    
    function submit() {
        if(self.user.id===null){
            console.log('Saving New User', self.user);
            createUser(self.user);
        }else{
            updateUser(self.user, self.user.id);
            console.log('User updated with id ', self.user.id);
        }
        reset();
    }

    function edit(id){
        console.log('id to be edited', id);
        for(var i = 0; i < self.users.length; i++){
            if(self.users[i].id === id) {
                self.user = angular.copy(self.users[i]);
                break;
            }
        }
    }

    function deleteUser(id){
        UserFactory.factoryDeleteUser(id)
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while deleting User');
            }
        );
    }
    
    function remove(id){
        console.log('id to be deleted', id);
        if(self.user.id === id) {//clean form if the user to be deleted is shown there.
            reset();
        }
        deleteUser(id);
    }


    function reset(){
        self.user={id:null,username:'',address:'',email:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);
