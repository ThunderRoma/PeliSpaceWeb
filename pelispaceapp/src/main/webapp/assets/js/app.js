var app = angular.module('App', []);

app.controller('ControllerApp', function($http) {
	
	var me = this;
		
	me.mvProductos = [];
//	me.mpProductos = [];
	
	me.fetchProductos = function() {
		
		
		$http.get('/innovatekapp/json/data/mv/productos')
			.then(function(response) {
				me.mvProductos = response.data;
		});
			
			
//		$http.get('/innovatekapp/json/data/mp/productos')
//		.then(function(response) {
//			me.mpProductos = response.data;
//		});
				
	}
	
});