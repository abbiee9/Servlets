

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		
		PrintWriter out=response.getWriter();
		
		String a1=request.getParameter("val1");
		//out.println(a1);
		String b1=request.getParameter("val2");
		//.println(b1);
		//a=(int)a1;
		Integer a=Integer.valueOf(a1);
		Integer b=Integer.valueOf(b1);
		
		out.println(c);
		
		
	}	
}
