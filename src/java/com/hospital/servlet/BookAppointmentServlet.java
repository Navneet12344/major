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
import com.hospital.vo.AppointmentVO;
import com.hospital.vo.DoctorVO;
import com.hospital.vo.UserVO;


@WebServlet("/BookAppointment")
public class BookAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		
		String doctorid = request.getParameter("doctorid");
		String mobile = request.getParameter("mobile");
		String date = request.getParameter("date");
			
		
		if(date == null || mobile == null) {
			//show error
		}
		
		String query = "insert into appointments (user_mobile, doctorid, date) VALUES  ('"+
		mobile+"','"+doctorid+"',STR_TO_DATE('"+date+"', '%m/%d/%Y'))";
		int flag = DatabaseConnectionUtil.save(query);
		
		if(flag == 1)
		{
			UserVO user = DatabaseConnectionUtil.getUserVO(mobile);
			request.getSession().setAttribute("user",user);
			pout.println("<script type=\"text/javascript\">");
			pout.println("alert('Appointment Booked');");
			pout.println("location='hospital.jsp';");
			//add session
			
			
			pout.println("</script>");
		
		}
		else {
			pout.println("<script type=\"text/javascript\">");
			pout.println("alert('Failed to Book, Please Try Again Later ');");
			pout.println("location='hospital.jsp';");
			pout.println("</script>");
			
		}
		
		
	}

}
