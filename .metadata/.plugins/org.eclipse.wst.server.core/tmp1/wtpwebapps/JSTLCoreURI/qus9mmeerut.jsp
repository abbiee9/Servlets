<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="item" value="2"/>
<c:forEach var="item" begin="0" end="0" step="2">
<c:out value="${item}" default="abc"/>
</c:forEach>