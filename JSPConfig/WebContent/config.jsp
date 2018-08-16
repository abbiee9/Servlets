
<% 
String name1=request.getParameter("name");
//out.println(name1);

String com=application.getInitParameter("Companyname");
//out.println(com);

String com1=config.getInitParameter("empid");

session.setAttribute("name", "dileep");
//request.getRequestDispatcher("config1.jsp").include(request, response);


out.println("<br><br>");

out.println("My name is :"+name1+" with a ID as "+com1+"and I work for "+com);

%>
<%
out.println("<br><br>");
		%>
<a href="config1.jsp">Click here</a>

</body>
</html>