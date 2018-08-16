

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name1=request.getParameter("username");
	
		
		out.println("<form action='Second'>");
		out.println("<input type='hidden' name='username1' value='"+name1+"'>");
		out.println("<input type='submit'  value='submit'>");
		out.println("</form>");
	}

}
