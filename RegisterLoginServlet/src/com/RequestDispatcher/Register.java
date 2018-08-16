package com.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Register extends HttpServlet 
{
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pwd1=request.getParameter("password1");
		String gen=request.getParameter("gender");
		String add=request.getParameter("address");
		String dob=request.getParameter("dob");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abu","qwerty12345");
			
			PreparedStatement ps=conn.prepareStatement("insert into registration values(?,?,?,?,?) ");
			
			ps.setString(1,user);
			ps.setString(2,pwd1);
			ps.setString(3,gen);
			ps.setString(4,add);
			ps.setString(5,dob);
			
			int rs=ps.executeUpdate();
			if(rs>0) {
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
				out.println("Registration successfull");
				//RequestDispatcher rd1=request.getRequestDispatcher("Login.java");
				//rd1.include(request, response);
			}else
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("Regsiter.html");
				rd.include(request, response);
				out.println("Registration Failed");
			}
				
			
		}	
		catch(Exception e)
			{
				out.println(e);
			}
	
	}
}
