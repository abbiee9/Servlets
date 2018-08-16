
<h1>JSP PAGES</h1>


<%
int a=20;
int b=30;
int c=a+b;
out.println("welcome to java server page");

%>
<br>
<%= "addition of two numbers "+c %>

<%!
int a;
%>

<%!
int b;//global variable
%>

<%-- <%@ page info="test page", session="false"%>
<%@ page session="false"%> --%>



