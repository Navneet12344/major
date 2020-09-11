package com.hospital.vo;

public class DoctorVO {

	private String doctorId;
	private String doctorName;
	private String mobile;
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "DoctorVO [doctorId=" + doctorId + ", doctorName=" + doctorName + ", mobile=" + mobile + "]";
	}
	
	
}
