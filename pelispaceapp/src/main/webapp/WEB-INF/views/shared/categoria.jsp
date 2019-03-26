
	<div class="menucat">
    	<ol class="filter">
        	<li>
        		<c:forEach items="${categorias}" var="categoria">
                	<a href="${contextRoot}/categoria/${categoria.id}/productos" id="a_${categoria.nombre}">${categoria.nombre}</a>
            	</c:forEach>
            </li>
    	</ol>
	</div>
