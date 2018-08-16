<%
response.setContentType("text/html");


request.getRequestDispatcher("link.html").include(request, response);


session.getSession(false);//check for old session if iot is not there returns null
if(session!=null)
{
	String name1=(String)session.getAttribute("name");
	
		out.println("<b>Welcome to Profile</b>");
		out.println("<br>Welcome, "+name1);
	
}
else
{
	out.println("please login first");
	request.getRequestDispatcher("login.html").include(request, response);
}

%>