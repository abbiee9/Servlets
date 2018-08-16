
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"  %>

<c:set var="Amount" value="786.970"></c:set>

	<fmt:parseNumber var="j" type="number" value="${Amount}" ></fmt:parseNumber>
	<p><i>Amount is : </i>
	<c:out value="${j}"></c:out> </p>
	
	<fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" ></fmt:parseNumber>
	<p><i>Amount is : </i>
	<c:out value="${j}"></c:out> </p>
	
<c:set var="Amount" value="9860.123456171865411"></c:set>

<p> Formatted Number-1: 
<fmt:formatNumber value="${Amount}" type="currency" currencySymbol="rs"></fmt:formatNumber>

<p> Formatted Number-2: 
<fmt:formatNumber  type="number" groupingUsed="true" value="${Amount}"></fmt:formatNumber>

<p> Formatted Number-3: 
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}"></fmt:formatNumber>

<p> Formatted Number-4: 
<fmt:formatNumber type="number" maxFractionDigits="1" value="${Amount}"></fmt:formatNumber>


<c:set var="date" value="02-07-2018" ></c:set>
<fmt:parseDate value="${date}" var="parsedate" pattern="MM-dd-yyyy"></fmt:parseDate>
<p><c:out value="${parsedate}"></c:out></p>

<fmt:parseDate value="${param.empDate}" var="parsedEmpDOB" pattern="yyyy-MM-dd"></fmt:parseDate>
<c:out value="${parsedEmpDOB}"></c:out>