import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); // informing the client that which format of data/response will be send
		PrintWriter out= response.getWriter(); 
		
		String s=request.getParameter("nam");
		
		/*request.setAttribute("hello", "abu123");
		out.println(request.getAttribute("hello"));
		request.setAttribute("hello", "abu");
		out.println(request.getAttribute("hello"));
		request.removeAttribute("hello");
		out.println(request.getAttribute("hello"));*/
		
		out.println(s);
	}	
}