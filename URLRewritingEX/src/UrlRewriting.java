

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlRewriting extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String stid=request.getParameter("sid");
		String stname=request.getParameter("sname");
		String stadd=request.getParameter("sadd");
		
		out.println("Welcome "+stname+" your id "+stid+" and your address: "+stadd);
		
		out.println("<a href='UrlRewriting2?studentname="+stname+"&id="+stid+"'>"+"Click Here</a>");
		
	}

}
