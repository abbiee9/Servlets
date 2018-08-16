<%



response.setContentType("text/html");
PrintWriter out=response.getWriter();

request.getRequestDispatcher("link.html").include(request, response);
String name1=request.getParameter("username");
String pass1=request.getParameter("password");

if(pass1.equals("qwerty123"))
{
	
	
	out.println("<br>Welcome, "+name1);
	
	session.getSession(name");//true
	session.setAttribute("name", name1);
	
}
else
{
	out.println("sorry, username or password error!");
	//response.sendRedirect("First");
	request.getRequestDispatcher("login.html").include(request, response);//using request dispatcher
}
out.close();


%>


<%@ page info="" %>