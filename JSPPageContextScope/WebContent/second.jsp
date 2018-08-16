



<%


out.println(pageContext.getAttribute("user")); /* by default page scope  */
out.println("<br><br>");
out.println(pageContext.getAttribute("user", PageContext.REQUEST_SCOPE));
out.println("<br><br>");
out.println(pageContext.getAttribute("user", PageContext.SESSION_SCOPE));
out.println("<br><br>");
out.println(pageContext.getAttribute("user", PageContext.APPLICATION_SCOPE));
out.println("<br><br>");




%>