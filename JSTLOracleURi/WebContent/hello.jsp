<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<sql:setDataSource var="driver" password="qwerty12345" user="Abu"
driver="oracle.jdbc.driver.OracleDriver"
url="jdbc:oracle:thin:@localhost:1521:xe"
/>

<sql:update var="anything" dataSource="${driver }">
insert into ibm values('459','salman')
</sql:update>

<sql:update var="hello" dataSource="${driver }">
create table lenovo2(eid number(10), ename varchar2(20))
</sql:update>

<c:out value="${hello }"/>
<c:out value="${anything }"/>
