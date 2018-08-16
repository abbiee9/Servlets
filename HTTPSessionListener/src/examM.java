

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class examM extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		
			session.setAttribute("key", new examM3());
			
			session.setAttribute("key", new examM3());
			session.setAttribute("key", "x");
			session.removeAttribute("key");
			
			
			
			//out.println(session.getAttribute("objectvalue1"));//bound the object
			
			//session.removeAttribute("objectvalue1");
			//out.println(session.getAttribute("objectvalue1"));//unbound the object
			
			
			
		out.close();
	}

}
