	<script src="${js}/angular.js"></script>
	<script src="${js}/app.js"></script>
   <div class="subtituloHeader1">
		<header class="page_header1"><h1><span>Estrenos</span></h1></header>
	</div>
    
	 <div class="container11" ng-app="App">
	  <div class="slideshow11" ng-controller="ControllerApp as pCtrl">
	    <div class="carrousel11">
	      	<figure class="shadow11" ng-repeat="productos in pCtrl.mvProductos"><a ng-href="${contextRoot}/ver/{{productos.id}}/pelicula"><img src="${images}/productos/{{productos.imagen}}"/></a></figure>
		</div>
	  </div>
	</div>