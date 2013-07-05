<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<h1>${productInfo.title }</h1>
<select>
	<c:forEach var="option" items="${productInfo.options }">
		<option>${option }</option>
	</c:forEach>
</select>
