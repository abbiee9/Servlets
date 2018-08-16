

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet 
{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 String name=request.getParameter("username");
	 
	 ServletContext context=request.getServletContext();
	 
	 context.setAttribute("hello", "abu123");
	 out.println(context.getAttribute("hello"));
	 context.setAttribute("hello", "abu");
	 out.println(context.getAttribute("hello"));
	 context.removeAttribute("hello");
	 out.println(context.getAttribute("hello"));
	 
	 out.println(name);
	 
	}
}
