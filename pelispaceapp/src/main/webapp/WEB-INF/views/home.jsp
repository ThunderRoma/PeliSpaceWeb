	<div class="wrapper" ng-init="pCtrl.fetchProductos()">
		<%@include file="./slider/carousel.jsp"%>
	<div class="wrapper">
		<div class="subtituloHeader2">
			<header class="page_header2"><h1><span>Peliculas</span></h1></header>
		</div>
		<div class="side">
			<%@include file="./shared/categoria.jsp"%>
		</div>
		<div class="main-wrap">
			<div class="subtituloHeader3">
			</div>
			<script>
				window.categoriaId = '';
			</script>
			<c:if test="${userClickCategoryProducts == true}">
				<script>
					window.categoriaId = '${categoria.id}';
				</script>
							
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a></li>
					<li class="active">Categoria</li>
					<li class="active">${categoria.nombre}</li>
				</ol>
			</c:if>
			<table id="listaProductoTabla"></table>
		</div>
</div>
</div>