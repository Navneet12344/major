package com.hospital.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hospital.util.DatabaseConnectionUtil;
import com.mysql.jdbc.StringUtils;

/**
 * Servlet implementation class AddHostelUser
 */
@WebServlet("/UserSignup")
public class UserSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(StringUtils.isEmptyOrWhitespaceOnly(mobile) || StringUtils.isEmptyOrWhitespaceOnly(name) ||  
				StringUtils.isEmptyOrWhitespaceOnly(password)) {
			pout.println("<script type=\"text/javascript\">");
			pout.println("alert('Mandatory Fields Are Missing !!!');");
			pout.println("location='hospital.jsp';");
			pout.println("</script>");
			return;
		}
		
	
		
		String sqlQuery = "select * from Users where Mobile = '"+mobile+"'";
		boolean flag01 =  DatabaseConnectionUtil.isDataExist(sqlQuery);
		
		if(!flag01)
		{
		
			String query = "insert into Users (mobile,name,email,password) values('"+mobile+"', '"+name+"', '"
				+email+ "','"+password+"')";
		
			System.out.println("query is :::: "+query);
			int flag = DatabaseConnectionUtil.save(query);
		
			if(flag == 1)
			{
				pout.println("<script type=\"text/javascript\">");
				pout.println("alert('You Are Registered successfully');");
				pout.println("location='hospital.jsp';");
				pout.println("</script>");
				request.getSession().setAttribute("message", "record inserted ......");
			}
			else 
			{
				pout.println("<script type=\"text/javascript\">");
				pout.println("alert('Something went wrong.Please Try Again');");
				pout.println("location='hospital.jsp';");
				pout.println("</script>");
			}
		}
		else {
			pout.println("<script type=\"text/javascript\">");
			pout.println("alert('Your Mobile Number Already Registered');");
			pout.println("location='hospital.jsp';");
			pout.println("</script>");
			
		}
		
		
	}

}
