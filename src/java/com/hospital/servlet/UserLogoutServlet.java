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
@WebServlet("/UserLogout")
public class UserLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		
			pout.println("<script type=\"text/javascript\">");
			pout.println("location='hospital.jsp';");
			//add session
			
			request.getSession().removeAttribute("mobile");
			request.getSession().removeAttribute("name");
	        
			pout.println("</script>");
		
		
		
		
	}

}
