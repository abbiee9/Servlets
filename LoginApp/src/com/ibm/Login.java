package com.ibm;

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
		
		String user=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		
		
		
		if(user.equals("abu")&& pwd.equals("qwerty123"))
		{
			out.println("LOGIN SUCCESS: "+user);
			out.println(pwd);
		}
		else
			out.println("please enter valid username and password");
		
	}	
}
