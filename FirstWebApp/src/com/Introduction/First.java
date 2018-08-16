package com.Introduction;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First implements Servlet
{
	
	public void init(ServletConfig arg0) throws ServletException
	{
		System.out.println("project deploy(placed) in server");
	}

	
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		System.out.println("business logic");

	}
	
	public void destroy()
	{
		System.out.println("project un-deployed(removed) from server");
		
	}

	public ServletConfig getServletConfig()
	{
		
		return null;
	}

	
	public String getServletInfo()
	{
		
		return null;
	}

	
	

}
