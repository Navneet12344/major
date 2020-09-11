package com.hospital.vo;

import java.util.ArrayList;
import java.util.List;

public class UserVO {

	private String name;
	private String password;
	private String mobile;
	private String email;
	private List<AppointmentVO> appointmentList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<AppointmentVO> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<AppointmentVO> appointmentList) {
		this.appointmentList = appointmentList;
	}
	
	public void addAppointment(AppointmentVO appointment) {
		if(appointmentList == null) {
			appointmentList = new ArrayList<AppointmentVO>();
		}
		appointmentList.add(appointment);		
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", password=" + password + ", mobile=" + mobile + ", email=" + email
				+ ", appointmentList=" + appointmentList + "]";
	}
	
	
}
