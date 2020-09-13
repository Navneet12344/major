package model;

import java.util.List;
import model.Hotel;

public class Bookings {
    private String Check_in;
    private String Check_out;
    private String Payment;
    private List<Hotel> hotel;
//    public Bookings(String Check_in, String Check_out,String Payment,List<Hotel> hotel){
//        this.Check_in=Check_in;
//        this.Check_out=Check_out;
//        this.Payment=Payment;
//        this.List<Hotel> hotel=hotel;
//    }
    public void setCheck_in(String Check_in){
        this.Check_in=Check_in;
    }
    public void setCheck_out(String Check_out){
        this.Check_out=Check_out;
    }
    public void setPayment(String payment){
        this.Payment=payment;
    }
    public void setHotelList(List<Hotel> hotel){
        this.hotel=hotel;
    }
    public String getCheck_in(){
        return Check_in;
    }public String getCheck_out(){
        return Check_out;
    }public String getPayment(){
         return Payment;
    }public List<Hotel> getHotelList(){
        return hotel;
    }
}

//			if(session.getAttribute("total")!= null && ((Bookings)session.getAttribute("total")).getHotelList()!= null) {
//			for(Hotel h : ((Bookings)session.getAttribute("total")).getHotelList()) {
//				
//				
//			
//				<tr>
//			      <td><%= h.getHotelname() %></td>
//                              <td><%= h.getBookings().getCheck_in() %></td>
//                              <td><%= h.getBookings().getCheck_out() %></td>
//                              <td><%= h.getContact_No() %></td>
//                              <td><%= h.getBookings().getPayment() %></td>
//			    </tr>
//				
//			}} 
