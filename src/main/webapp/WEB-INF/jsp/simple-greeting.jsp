<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
	<h1>${productInfo.title }</h1>
	<select>
		<c:forEach var="option" items="${productInfo.options }">
			<option>${option }</option>
		</c:forEach>
	</select>
</body>
</html>