<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<h3>Product Component [Region: MAIN]</h3>
<h4>${productInfo.title }</h4>
<select>
	<c:forEach var="option" items="${productInfo.options }">
		<option>${option }</option>
	</c:forEach>
</select>