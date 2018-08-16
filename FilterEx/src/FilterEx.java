

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FilterEx implements Filter 
{

    
	public void destroy()
	{
		System.out.println("filter removed from the server");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out=response.getWriter();
		out.println("  Before servlet execution ");
		out.println("<br>");
		chain.doFilter(request, response);//because of this only filter operation takes place
		out.println("  After servlet execution ");
		out.println("<br>");
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("filter initialized");
	}

}
