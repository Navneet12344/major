package com.hospital.vo;

import java.util.Date;

public class AppointmentVO {

	private int appointmentId;
	private UserVO user;
	private DoctorVO doctor;
	private Date date;
	
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public UserVO getUser() {
		return user;
	}
	public void setUser(UserVO user) {
		this.user = user;
	}
	public DoctorVO getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorVO doctor) {
		this.doctor = doctor;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "AppointmentVO [appointmentId=" + appointmentId + ", doctor=" + doctor + ", date="
				+ date + "]";
	}
	
	
}
