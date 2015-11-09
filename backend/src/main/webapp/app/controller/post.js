
'use strict';

function PostController($scope,$http,$window){
	
    $scope.zz = {//显示出来的文章内容
            name:'',
            content:'1'
        };
    
    $http({
		method : 'get',
		url : '/GetMemberName',
		cache : 'true',
	}).success(function(data) {
		 console.log(data);
		 $scope.zz.name=data;
	});
    
    

}


//
