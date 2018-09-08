var vebApp = angular.module('vebApp',['ui.router','ngMaterial', 'jkAngularRatingStars'])

vebApp.config(['$urlRouterProvider','$stateProvider',function($urlRouterProvider, $stateProvider) {
    $urlRouterProvider.otherwise('/login');
    $stateProvider
        .state('login',{
            url:'/login',
            controller: 'loginController',
            templateUrl:'poluPages/login.html'

        })/*
        .state('noviPopustTreca',{
            url:'/noviPopustTreca/:id',
            controller: 'noviPopustTrecaController',
            templateUrl:'poluPages/noviPopustTreca.html'
        })*/
}]);