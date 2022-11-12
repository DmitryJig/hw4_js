angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/products')
            .then(function (response){
                $scope.ProductsList = response.data;
            })
    }

    $scope.deleteProduct = function (productId) {
        $http({
            url: contextPath + '/products',
            method: 'DELETE',
            params: {
                id: productId
            }
        }).then(function (response){
            $scope.loadProducts()
        });
    }

    $scope.loadProducts();
});