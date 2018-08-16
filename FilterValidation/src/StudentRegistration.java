

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
public class StudentRegistration extends HttpServlet 
{
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		String name=request.getParameter("sname");
		String email=request.getParameter("email");
		int marks=Integer.parseInt(request.getParameter("marks"));
		
		out.println("Name:  "+name);
		out.println("Email:  "+email);
		out.println("Marks:  "+marks);
		
		
		
	
	}
}
