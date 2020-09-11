package com.hospital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.hospital.vo.AppointmentVO;
import com.hospital.vo.DoctorVO;
import com.hospital.vo.UserVO;


public class DatabaseConnectionUtil {

	public static Connection prepareConn() {
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			c = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/HospitalDB",
							"root", null);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return c;
	}// prepareConn

	public static void closeConn(Connection c) {
		try {
			if (c != null)
				c.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}// closeConn

	public static boolean isDataExist(String query) {
		boolean check = false;
		Connection c = null;
		
		try {
			c = prepareConn	();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next() == true) {
				check = true;
			} else {
				check = false;
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			closeConn(c);
		}
		
		return check;
	}
	
	public static UserVO getUserVO(String mobile) {
		Connection c = null;
		UserVO userVO = new UserVO();
		String query = "select * from Users where mobile='"+mobile+"' ";
		try {
			c = prepareConn();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if (rs.next()) {
				
				userVO.setMobile(rs.getString(1));
				userVO.setName(rs.getString(2));
				userVO.setEmail(rs.getString(3));
				userVO.setPassword(rs.getString(4));
				
				query = "select appointment_id,doc.doctorid,name,mobile,date from Appointments app, Doctors doc where app.user_mobile='"+mobile+"' and app.doctorid=doc.doctorid order by date DESC";
				rs = st.executeQuery(query);
				
				while(rs.next()) {
					AppointmentVO appointmentVO = new AppointmentVO();
					appointmentVO.setAppointmentId(rs.getInt(1));
					appointmentVO.setUser(userVO);
					DoctorVO doctorVO = new DoctorVO();
					doctorVO.setDoctorId(rs.getString(2));
					doctorVO.setDoctorName(rs.getString(3));
					doctorVO.setMobile(rs.getString(4));
					
					appointmentVO.setDoctor(doctorVO);
					appointmentVO.setDate(rs.getDate(5));
					userVO.addAppointment(appointmentVO);					
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		closeConn(c);
		return userVO;
	}

	public static UserVO getUser(String mobile, String password) {
	
		Connection c = null;
		UserVO userVO = new UserVO();
		String query = "select * from Users where mobile='"+mobile+"' and password = '"+password+"'";
		try {
			c = prepareConn();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if (rs.next()) {
				
				userVO.setMobile(rs.getString(1));
				userVO.setName(rs.getString(2));
				userVO.setEmail(rs.getString(3));
				userVO.setPassword(rs.getString(4));
				
				query = "select appointment_id,doc.doctorid,name,mobile,date from Appointments app, Doctors doc where app.user_mobile='"+mobile+"' and app.doctorid=doc.doctorid order by date DESC";
				rs = st.executeQuery(query);
				
				while(rs.next()) {
					AppointmentVO appointmentVO = new AppointmentVO();
					appointmentVO.setAppointmentId(rs.getInt(1));
					appointmentVO.setUser(userVO);
					DoctorVO doctorVO = new DoctorVO();
					doctorVO.setDoctorId(rs.getString(2));
					doctorVO.setDoctorName(rs.getString(3));
					doctorVO.setMobile(rs.getString(4));
					
					appointmentVO.setDoctor(doctorVO);
					appointmentVO.setDate(rs.getDate(5));
					userVO.addAppointment(appointmentVO);					
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		closeConn(c);
		return userVO;
	}
	
	public static int save(String sql) {
		int i = 0;
		System.out.println("query is ::::: "+sql.toString());
		Connection c = null;
		try {
			c = prepareConn();
			Statement st = c.createStatement();
			i = st.executeUpdate(sql);
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			closeConn(c);
		}
		
		return i;
	}//save data
	
	public static int delete(String sql) {
		int i = 0;
		Connection c = null;
		try {
			c = prepareConn();
			Statement st = c.createStatement();
			i = st.executeUpdate(sql);
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			closeConn(c);
		}
		
		return i;
	}

	
	
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostelDB", "root", "root");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from hostelentry");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
