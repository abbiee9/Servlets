

<%
String name1=request.getParameter("name");
out.println(name1);

pageContext.setAttribute("user", name1, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("user", name1, PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("user", name1, PageContext.SESSION_SCOPE);
pageContext.setAttribute("user", name1, PageContext.PAGE_SCOPE);//if we use request dispatcher we will not get value 

%>

<a href="second.jsp">Second Jsp Page</a>