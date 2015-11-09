'use strict';
var app = angular.module('app', ['ngRoute']);
app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {templateUrl: '../views/chenmanman.html', controller: 'PostController'})
        .otherwise({redirectTo: '/'});
}]);



