<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>AngularJS $http Example</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.7.5/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/1.0.20/angular-ui-router.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.7.5/angular-route.js"></script>
<script src="resources/js/app.js"></script>
<script src="resources/js/service/user_factory.js"></script>
<script src="resources/js/controller/user_controller.js"></script>
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/app.css" ></link>
</head>
<body ng-app="myApp" class="ng-cloak">
<body>
 <table>
   <caption>
      <strong>Tab1. Liste de prix des livres</strong> Ce tableau liste l'ensemble de notre catalogue de livres et renseigne les prix 2014 hors frais de port  ainsi que sa disponibilité en version numérique
   </caption>
   <thead>
     <tr>
       <th>Titre livre</th>
       <th>Téléchargeable</th>
       <th>Prix TTC</th>
     </tr>
   </thead>
</table>  
	<div class="generic-container" ng-controller="UserController as ctrl">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span class="lead">User Registration Form </span>
			</div>
			<div class="formcontainer">
				<form ng-submit="ctrl.submit()" name="myForm"
					class="form-horizontal">
					<input type="hidden" ng-model="ctrl.user.id" />
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="file">Name</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.user.username" name="uname"
									class="username form-control input-sm"
									placeholder="Enter your name" required ng-minlength="3" />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.uname.$error.required">This is a
										required field</span> <span ng-show="myForm.uname.$error.minlength">Minimum
										length required is 3</span> <span ng-show="myForm.uname.$invalid">This
										field is invalid </span>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="file">Address</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.user.address"
									class="form-control input-sm"
									placeholder="Enter your Address. [This field is validation free]" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="file">Email</label>
							<div class="col-md-7">
								<input type="email" ng-model="ctrl.user.email" name="email"
									class="email form-control input-sm"
									placeholder="Enter your Email" required />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.email.$error.required">This is a
										required field</span> <span ng-show="myForm.email.$invalid">This
										field is invalid </span>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-actions floatRight">
							<input type="submit" value="{{!ctrl.user.id ? 'Add' : 'Update'}}"
								class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
							<button type="button" ng-click="ctrl.reset()"
								class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset
								Form</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">
				<span class="lead">List of Users </span>
				<span ng-click="ctrl.NonExistingURL()" class="btn-success">
					Lister	les Users
				</span>
				<span ng-click="ctrl.gotoUserState()" class="btn-success">
					vers userState
				</span>
			</div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID.</th>
							<th>Name</th>
							<th>Address</th>
							<th>Email</th>
							<th width="20%"></th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="u in ctrl.users">
							<td><span ng-bind="u.id"></span></td>
							<td><span ng-bind="u.username"></span></td>
							<td><span ng-bind="u.address"></span></td>
							<td><span ng-bind="u.email"></span></td>
							<td>
								<button type="button" ng-click="ctrl.edit(u.id)"
									class="btn btn-success custom-width">Edit</button>
								<button type="button" ng-click="ctrl.remove(u.id)"
									class="btn btn-danger custom-width">Remove</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>


</body>
</html>