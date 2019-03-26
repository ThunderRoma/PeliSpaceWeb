<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Venta Online de Calzados">
<meta name="author" content="Romario Medina">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">
<title> ${titleHead} </title>
<link rel="icon" href="${images}/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link href="${css}/navbar.css" rel="stylesheet">
<link href="${css}/reload.css" rel="stylesheet">
<link href="${css}/login.css" rel="stylesheet">
<link href="${css}/categoria.css" rel="stylesheet">
<link href="${css}/style.css" rel="stylesheet">
<link href="${css}/button.css" rel="stylesheet">
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>

<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}'
</script>
<script src="${js}/modernizr.custom.17475.js"></script>
<script src="${js}/jquery.min.js"></script>
<script src="${js}/jquery-migrate-1.2.1.min.js"></script>
<script src="${js}/angular.js"></script>
<script src="${js}/app.js"></script>
<script src="${js}/myapp.js"></script>
</head>
<body ng-app="App" ng-controller="ControllerApp as pCtrl">
<div class="se-pre-con"></div>
<div class="wrapper">
	<%@include file="./shared/navbar.jsp"%>
	<div class="content">
			
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${userClickGallery == true }">
				<%@include file="gallery.jsp"%>
			</c:if>	
			
			<c:if test="${userClickLogin == true}">
				<%@include file="login.jsp"%>
			</c:if>		
			
			<c:if test="${userClickCategoryProducts == true}">
        		<%@include file="home.jsp" %>
        	</c:if>
        	
			<c:if test="${userClickShowProduct == true}">
				<%@include file="detallePelicula.jsp"%>
			</c:if>				

		</div>
		<%@include file="./shared/footer.jsp"%>
		
	</div>
	
	<script src="${js}/core.min.js"></script>
	<script src="${js}/mijs.js"></script>
	<script src="${js}/script.js"></script>
<%-- 	<script src="${js}/home.js"></script> --%>
	<script src="${js}/login.js"></script>
	<script src="${js}/prefixfree.min.js"></script>
	<script src="${js}/jquery.dataTables.js"></script>
	<script src="${js}/dataTables.bootstrap.js"></script>
	
</body>
</html>
