

<!-- Object creation using jsp action elements-->
<jsp:useBean id="wel" class="com.wel.Welcome"></jsp:useBean>



<!--  Calling Setters method using jsp action tag-->
<!-- to get user value we use param indirectly same as servlets request object -->
<jsp:setProperty property="username" name="wel" value="${ param.uname}"/>
<jsp:setProperty property="password" name="wel" value="${ param.pwd}"/>


<!-- calling getters method using jsp action tag -->
Welcome:<jsp:getProperty property="username" name="wel"/>
Password:<jsp:getProperty property="password" name="wel"/>



<!--  -->
<jsp:forward page="index1.jsp">
<jsp:param value="${ param.uname}" name="wel"/>
</jsp:forward>

<%-- <jsp:fallback></jsp:fallback> --%>



