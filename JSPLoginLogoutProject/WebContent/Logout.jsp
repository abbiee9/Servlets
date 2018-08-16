<%


response.setContentType("text/html");

request.getRequestDispatcher("link.html").include(request, response);

session.getAttribute(");
session.invalidate();//to remove the memory space


out.println("you are successfully logged out!");




%>