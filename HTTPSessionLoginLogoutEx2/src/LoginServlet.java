

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
