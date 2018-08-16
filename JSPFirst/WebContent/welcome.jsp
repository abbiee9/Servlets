<%@ page trimDirectiveWhitespaces="false" %>

<%
String user=request.getParameter("username");
String pwd=request.getParameter("password");

if(pwd.equals("qwerty123"))
{
	request.getRequestDispatcher("index.jsp").include(request, response);
	
}
else
{
	//request.getRequestDispatcher("index.html").include(request, response);
	response.sendRedirect("index.html");
	%>
	<%="please enter valid password" %>
	
	<%
	
}

%>
