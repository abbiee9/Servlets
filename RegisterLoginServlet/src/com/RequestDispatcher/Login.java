package com.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet 
{
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pwd1=request.getParameter("password");
		try
		{
			ServletConfig scg=getServletConfig();
			String drv=scg.getInitParameter("driver");
			Class.forName(drv);
			
			
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abu","qwerty12345");
			
			PreparedStatement ps=conn.prepareStatement("select * from registration where uname=? and pwd=? ");
			
			ps.setString(1,user);
			ps.setString(2,pwd1);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				RequestDispatcher rd=request.getRequestDispatcher("Home.html");
				rd.forward(request, response);
				out.println("Login success Mr: "+user);
			}
		
			else 
				{
				RequestDispatcher rd=request.getRequestDispatcher("Regsiter.html");
				rd.include(request, response);
				out.println("Please Enter Valid Username and Password");
				out.println("Please Register First");
				
				}
		}	
		catch(Exception e)
			{
				out.println(e);
			}
	
	}
}
