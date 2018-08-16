<%@ page import="java.sql.*" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<sql:setDataSource var="conn" password="qwerty12345" user="Abu"
driver="oracle.jdbc.driver.OracleDriver"
url="jdbc:oracle:thin:@localhost:1521:xe"
/>


<sql:query var="resultset" dataSource="${conn }">
select * from ibm
</sql:query>

<table border="2" width="100%">
<tr>
<th>username</th>
<th>password</th>
</tr>
<c:forEach var="x" items="${resultset.rows }">
<tr>
<td><c:out value="${x.eid }"></c:out></td>
<td><c:out value="${x.ename }"></c:out></td>
</tr>
</c:forEach>
</table>