package com.RealTimeEX;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abu","qwerty12345");
			
			PreparedStatement ps=conn.prepareStatement("select * from registration where uname=? and pwd=? ");
			
			ps.setString(1,user);
			ps.setString(2,pwd1);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				out.println("login success");
				out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
		
			else 
				{
					out.println("failed");
				}
		}	
		catch(Exception e)
			{
				out.println(e);
			}
	
	}
}
