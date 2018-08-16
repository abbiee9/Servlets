

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Scope extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String s=request.getParameter("name");//request scope
		
		HttpSession session=request.getSession();//session type
		
		ServletContext context=request.getServletContext();//application scope
		
		if(s!="" && s!=null)
		{
			session.setAttribute("name1", s);
			context.setAttribute("name2", s);
		}
		out.println("Request Object value: "+s);
		out.println("<br><br>");
		out.println("Session object value: "+(String)session.getAttribute("name1"));//return type object which is get converted into string
		out.println("<br><br>");
		out.println("Application/ Context object value: "+(String)context.getAttribute("name2"));
		out.println("<br><br>");
		
	}

}
