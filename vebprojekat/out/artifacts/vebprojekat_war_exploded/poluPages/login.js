vebApp.controller('loginController', ['$scope','$state', function ($scope,$state) {
    $scope.toRegister = function() {
        $state.go("register");
    }
}]);
