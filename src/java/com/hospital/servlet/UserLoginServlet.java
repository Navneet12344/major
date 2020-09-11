package com.hospital.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hospital.util.DatabaseConnectionUtil;
import com.hospital.vo.UserVO;

/**
 * Servlet implementation class AddHostelUser
 */
@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		
		
		UserVO user =  DatabaseConnectionUtil.getUser(mobile, password);
		System.out.print(user.toString());
		if(user.getMobile() != null)
		{
			pout.println("<script type=\"text/javascript\">");
			pout.println("location='hospital.jsp';");
			//add session
			
			request.getSession().setAttribute("mobile",user.getMobile()); 
			request.getSession().setAttribute("name",user.getName()); 
			request.getSession().setAttribute("email",user.getEmail()); 
			request.getSession().setAttribute("user",user); 
			pout.println("</script>");
		
		}
		else {
			pout.println("<script type=\"text/javascript\">");
			pout.println("alert('Invalid Login, Please check your credential');");
			pout.println("location='hospital.jsp';");
			pout.println("</script>");
			
		}
		
		
	}

}
