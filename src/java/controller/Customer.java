package controller;

import java.util.ArrayList;
import java.util.List;
import model.Bookings;

public class Customer {
        private String name;
	private String email;
	private String mobile;
	private String password;
	private List<Bookings> bookingList;
	
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
	
	public List<Bookings> getBookingList() {
		return bookingList;
	}
	public void setBookingList(List<Bookings> bookingList) {
		this.bookingList = bookingList;
	}
	
	public void addBooking(Bookings booking) {
		if(bookingList == null) {
			bookingList = new ArrayList<Bookings>();
		}
		bookingList.add(booking);		
	}
}
