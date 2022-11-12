angular.module('app', []).controller('indexController', function ($scope, $http){
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function (){
        $http.get(contextPath + '/api/v1/products')


    }
    $scope.fillTable();
    });