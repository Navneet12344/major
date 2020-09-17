package model;

import controller.Customer;
import java.util.List;
import model.Hotel;

public class Bookings {
    private String Check_in;
    private String Check_out;
    private String Payment;
    private Customer customer;
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
    public String getCheck_in(){
        return Check_in;
    }public String getCheck_out(){
        return Check_out;
    }public String getPayment(){
         return Payment;
    }public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}


//<div class="modal" id="bookModel">
//    <div class="modal-dialog">
//		<div class="modal-content">
//
//		 Modal Header 
//		<div class="modal-header">
//			<h4 class="modal-title" style="font-size: 30px;">Bookings</h4>
//			<button type="button" class="close" data-dismiss="modal">&times;</button>
//		</div>
//
//		 Modal body 
//		<div class="modal-body">
//         <table  class="table table-hover">
//			  <thead>
//			    <tr>
//			      <th scope="col">Hotel Name</th>
//                              <th scope="col">Check_in</th>
//                              <th scope="col">Check_out</th>
//                              <th scope="col">Contact No.</th>
//                              <th scope="col">Payment</th>
//			    </tr>
//			  </thead>
//			  <tbody>
//		            <% 
//			if(session.getAttribute("uname")!= null && ((Customer)session.getAttribute("uname")).getBookingList()!= null) {
//			for(Bookings book: ((Customer)session.getAttribute("uname")).getBookingList()) { 
//
//			%>
//				<tr>
//                              <td><%= session.getAttribute("hotelname") %></td>
//			      <td><%= book.getCheck_in() %></td>
//			      <td><%= book.getCheck_out() %></td>
//                              <td><%= book.getPayment() %></td>
//			    </tr>
//				
//			<% }} %>     
//			 
//				</tbody>
//			</table>
//			
//
//			     Modal footer 
//			    <div class="modal-footer">
//			        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
//			    </div>
//		    </div>
//	</div>
//    </div>
//</div>
//
