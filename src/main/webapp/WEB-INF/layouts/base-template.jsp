<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="hero-unit">
			<h1>Hello, world!</h1>
			<p>This tutorial demonstrates a simple Spring MVC Web Application that uses Tiles and Bootstrap</p>
			<p>
				<a href="#" class="btn btn-primary btn-large">Learn more »</a>
			</p>
		</div>
		<!--  Header  -->
		<div class="row-fluid">
			<div class="span12">
				<c:forEach var="componentTemplate" items="${HEADER }">
					<tiles:insertDefinition name="${componentTemplate }" />
				</c:forEach>
			</div>
		</div>
		<div class="row-fluid">
			<!-- Left Sidebar -->
			<div class="span4">
				<c:forEach var="componentTemplate" items="${LEFT }">
					<tiles:insertDefinition name="${componentTemplate }" />
				</c:forEach>
			</div>
			<!-- Main Content Area -->
			<div class="span4">
				<c:forEach var="componentTemplate" items="${MAIN }">
					<tiles:insertDefinition name="${componentTemplate }" />
				</c:forEach>
			</div>

			<!-- Right Sidebar -->
			<div class="span4">
				<c:forEach var="componentTemplate" items="${RIGHT }">
					<tiles:insertDefinition name="${componentTemplate }" />
				</c:forEach>
			</div>
		</div>
		<!-- Footer -->
		<div class="row-fluid">
			<div class="span12">
				<c:forEach var="componentTemplate" items="${FOOTER }">
					<tiles:insertDefinition name="${componentTemplate }" />
				</c:forEach>
			</div>
		</div>
	</div>
	<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
</body>
</html>