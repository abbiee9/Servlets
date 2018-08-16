

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirstValidation implements Filter 
{

    
	public void destroy()
	{
		System.out.println("filter removed from the server");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out=response.getWriter();
		String name=request.getParameter("sname");
		String email=request.getParameter("email");
		int marks = 0;
		try
		{
			marks=Integer.parseInt(request.getParameter("marks"));
		}
		catch(Exception e)
		{
			System.out.println("please enter only numeric value");
		}
		
		if(name.equals(""))
		{
			out.println("name is required");
		}
		if(email.equals(""))
		{
			out.println("email is required");
		}
		if(marks==0)
		{
			out.println("marks required");
		}
		else
		{
			out.println("<pre>");
			
			chain.doFilter(request, response);
			
			out.println("  </pre> ");
			out.println("<body bgcolor='green'>");
			out.println("  <h1> after servlet execution</h1> ");
			out.println("  </body> ");
		}	
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("filter initialized");
	}
}
