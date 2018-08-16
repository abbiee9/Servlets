

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddItem extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String itemname=request.getParameter("item");
		String itemquantity=request.getParameter("quan");
		
		HttpSession hs=request.getSession(true);
		 hs.setAttribute(itemname, itemquantity);
		 
		 pw.println("<center>");
		 pw.println("<h1>Item Added</h1>");
		 pw.println("<h5>click here to add more</h5>");
		 pw.println("<a href='index.html'>Add More</a>");
		 pw.println("</center>");
		 
		
	}


}
