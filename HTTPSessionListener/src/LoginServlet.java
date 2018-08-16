

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		String name1=request.getParameter("username");
		String pass1=request.getParameter("password");
		
		if(pass1.equals("qwerty123"))
		{
			
			
			out.println("<br>Welcome, "+name1);
			
			HttpSession session=request.getSession();//true
			session.setAttribute("name", name1);
			
			
			session.setAttribute("name2", "abu123");
			out.println(session.getAttribute("name2"));// added attribute
			session.setAttribute("name2", "abu");
			out.println(session.getAttribute("name2"));//replaced  attribute
			session.removeAttribute("name2");
			out.println(session.getAttribute("name2"));//removed attribute
			
			session.setAttribute("objectvalue1", new SessionBindingListener());
			out.println(session.getAttribute("objectvalue1"));//bound the object
			
			session.removeAttribute("objectvalue1");
			out.println(session.getAttribute("objectvalue1"));//unbound the object
			
			
			
		}
		else
		{
			out.println("sorry, username or password error!");
			//response.sendRedirect("First");
			request.getRequestDispatcher("login.html").include(request, response);//using request dispatcher
		}
		out.close();
	}

}
