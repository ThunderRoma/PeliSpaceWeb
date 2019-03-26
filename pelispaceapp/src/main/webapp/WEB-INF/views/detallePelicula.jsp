
	<div class="wrapper" ng-init="pCtrl.fetchProductos()">
		<%@include file="./slider/carousel.jsp"%>
	</div>
	 	<div class="side">
			<%@include file="./shared/categoria.jsp"%>
	 	</div>
	 	<div class="main-wrap">
	 		<div class="subtituloDetalle">
				<header class="page_header2"><h1><span>Detalle</span></h1></header>
			</div>
	 		<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Peliculas</a></li>
				<li class="active">${producto.nombre}</li>
			</ol>
			
			<!-- Display the product image -->
	<div class="row">
		<div class="col-sm-3">
			<div class="thumbnail">
				<img src="${images}/productos/${producto.imagen}" class="cover"/>	
			</div>
		</div>
		
		<div class="col-sm-6">
			<div class="screen">
				<div class="sinopsisDetalle">
					<h3>${producto.nombre}</h3>
					<p>${producto.descripcion}</p>
					<h4>Calidad: <strong>${producto.calidad}</strong></h4>
					<h4>Año: <strong> S/. ${producto.anio} </strong></h4>		
				</div>
	 		</div>
	 	</div>
	 	<div class="col-sm-3">
	 	<section>
			<div class="seats">
				<div class="screen">
					<div class="console">
						<h2 class="importante">IMPORTANTE!!!</h2>
						<code>
						<p>Para el mejor uso de esta página favor de seguir las siguientes indicaciones:
						   Para poder buscar tus peliculas favoritas ya sea por el buscador o por la categoria favor de salir del detalle de la pelicula y realizar tu busqueda correspondiente. Gracias</p>     
						</code>
					</div>
				</div>
			</div>
		</section>
	 	</div>
	 	</div>
	 	<div class="row">
	 	<div class="col-sm-8">
	 		<div style="margin-top: 15px;">
		 		<div class="botton1">
					<button class="buttonVer" title="HD 1800p" rel="${producto.video1}">Opcion 1</button>
				</div>
				<div class="botton2">
					<button class="buttonVer" title="HD 1800p" rel="${producto.video2}">Opcion 2</button>
				</div>
				<div class="botton3">
					<button class="buttonVer" title="HD 1800p" rel="${producto.video3}">Opcion 3</button>
				</div>
			</div>
	 	</div>
	 	<div class="col-sm-4">
	 		<div style="margin-top: 15px;">
		 		<div class="bottontrailer1">
					<button class="buttonVer" title="HD 1800p" rel="${producto.trailer}">Trailer</button>
				</div>
				<div class="bottondescarga1">
					<a class="buttonDescargar" title="Mega" target="_blank" href="${producto.descarga}">Descargar</a>
				</div>
			</div>
	 	</div>
	 	</div>
	 	<div class="row">
	 		<div class="col-sm-12">
	 			<div style="margin-top: 15px;">
		 			<div class="embed-container">
						<iframe class="videoiframe" src="${producto.video1}" id="iframe" webkitallowfullscreen="true" mozallowfullscreen="true" allowfullscreen="true" frameborder="0" scrolling="no"></iframe>
					</div>
				</div>
			</div>
	 	</div>	
</div>