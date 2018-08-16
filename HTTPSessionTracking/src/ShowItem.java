

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShowItem extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession(true);
		
		Enumeration e=hs.getAttributeNames();
		pw.println("<table border=2>");
		pw.println("<tr><th>ItemName</th><th>Quantity</tr>");
		
		if(e.hasMoreElements())
		{
			while(e.hasMoreElements())
			{
				String key=(String)e.nextElement();
				String value=(String)hs.getAttribute(key);
				
				pw.println("<tr>");
				pw.println("<td>"+key+"</td>");
				pw.println("<td>"+value+"</td>");
				pw.println("</tr>");
			
			}
		}
		else
		{
			pw.println("Add items first");
		}
		
		
		
		
	}
}
