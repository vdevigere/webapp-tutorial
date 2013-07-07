<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Menu Component [Region: LEFT]</h3>

<c:forEach var="menuItem" items="${menuBO.mainMenu }">
	<h4>
		<a href="${ menuItem.link}">${menuItem.value }</a>
	</h4>
</c:forEach>
