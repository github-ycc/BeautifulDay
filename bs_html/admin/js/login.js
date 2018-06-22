var app = angular.module('modul',[]);
app.controller("mycontl",["$scope","$http",function($scope,$http){

    $scope.login=function(){
        var _data={
            "admin_name":$scope.admin_name||'',
            "admin_pwd":$scope.admin_pwd||''
        }

        $http({
            method: "POST",
            dataType: "JSON",
            contentType: "application/json; charset=UTF-8",
            url:"/ssm/admins/login",
            headers: {},
            data: _data

        })
            .success(function (data) {
                alert('3333');
                $scope.backdate=data;
                alert(backdate.admin_pwd);
            })
            .error(function (e, code) {
                    alert('失败');
            })



    }

}])

