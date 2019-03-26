<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

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
<meta name="description" content="Ventas Online">
<meta name="author" content="Romario Medina">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">
<title> Innovatek </title>
<link rel="icon" href="${images}/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link href="${css}/navbar.css" rel="stylesheet">
<link href="${css}/reload.css" rel="stylesheet">
<link href="${css}/categoria.css" rel="stylesheet">
<link href="${css}/login.css" rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}'
</script>
<script src="${js}/modernizr.custom.17475.js"></script>
<script src="${js}/jquery.min.js"></script>
<script src="${js}/jquery-migrate-1.2.1.min.js"></script>
</head>
<body>
	<div class="wrapper">
 	<div class="rd-navbar-wrap rd-navbar-transparent">
          <nav data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-device-layout="rd-navbar-static" data-stick-up-clone="true" data-md-stick-up-offset="50px" data-lg-stick-up-offset="150px" class="rd-navbar">
            <div class="rd-navbar-inner">
              <div class="rd-navbar-panel">
                <button data-rd-navbar-toggle=".rd-navbar-nav-wrap" class="rd-navbar-toggle"><span></span></button>
                <!-- RD Navbar Brand--><a href="${flowExecutionUrl}&_eventId=home" class="rd-navbar-brand"><img src="${images}/logo.png" alt="" width="40" height="20"/></a>
              </div>
              <div class="rd-navbar-nav-wrap">
                <!-- RD Navbar Nav-->
                <ul class="rd-navbar-nav navbar-left">
                  <li class="active" id="home"><a href="${contextRoot}/home">Home</a></li>
<%--                   <li id="about"><a href="${contextRoot}/about">About</a></li> --%>
<%--                   <li id="contact"><a href="${contextRoot}/contact">Contact</a></li> --%>
<%--                   <li id="gallery"><a href="${contextRoot}/gallery">Gallery</a></li> --%>
<%--                   <li id="listaProducto"><a href="${contextRoot}/show/all/productos">Productos</a></li> --%>
                </ul>
                <ul class="nav navbar-nav navbar-right" style="margin-left: 50px;">
					<security:authorize access="isAnonymous()">
                  		<li id="signup"><a href="${contextRoot}/membership">Sign Up</a></li>
                  		<li id="login"><a href="${contextRoot}/login">Login</a></li>
                	</security:authorize>
                </ul>
              </div>
            </div>
          </nav>
        </div>
<!-- Se cargará aqui Signup-Personal -->
<!-- Se cargará aqui Signup-Billing -->
<!-- Se cargará aqui Signup-Confirm -->
<!-- Se cargará aqui Signup-Success -->