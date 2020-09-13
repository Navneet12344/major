package model;

public class Hotel {
    private String Hid;
    private String HName;
    private String Rating;
    private String Address;
    private String About;
    private String Contact_No;
    private String Price;
    private Bookings b;
    public Hotel(String Hid,String Hname, String Rating, String Address, String About, String Contact_No,String Price) {
        this.Hid = Hid;
        this.HName = Hname;
        this.Rating = Rating;
        this.Address = Address;
        this.About = About;
        this.Contact_No = Contact_No;
        this.Price = Price;
    }
    public String getHotelid() {
        return Hid;
    }
    public String getHotelname() {
        return HName;
    }

    public String getRating() {
        return Rating;
    }

    public String getAddress() {
        return Address;
    }

    public String getAbout() {
        return About;
    }

    public String getContact_No() {
        return Contact_No;
    }
    
    public String getPrice() {
        return Price;
    }
    public Bookings getBookings() {
		return b;
	}
    public void setBookings(Bookings b) {
		this.b = b;
	}
}