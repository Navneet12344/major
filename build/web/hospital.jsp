<%@ page import="com.hospital.vo.UserVO" %>
<%@ page import="com.hospital.vo.DoctorVO" %>
<%@ page import="com.hospital.vo.AppointmentVO" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>

<head>	<title> </title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.min.css">
   
   <style>
  /* Make the image fully responsive */
  .carousel-inner img {
    width: 100%;
  }
  .container img{
  	width: 80%;
  	height: 70%;
  	border-radius: 20px;
  }
  .row{
  	height:250px;
  }

  </style>
</head>
<body class="bg">

	<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand text-white">HOSPITALS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
    
    <ul class="nav navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-toggle="modal" data-target="#myModal"><span class="fas fa-user"></span> Sign Up</a>
      </li>
      <% if( session.getAttribute("mobile") != null) { %>
      <li class="nav-item">
        
        <div class="btn-group">
  			<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    			<%= session.getAttribute("name") %>
  			</button>
  			<div class="dropdown-menu">
    			<a class="dropdown-item" href="UserLogout">Logout</a>
    			<a class="dropdown-item" data-toggle="modal" data-target="#appointmentModal">Appointments</a>
  		</div>
</div>
      </li>
      <% } else {%>
       <li class="nav-item">
        <a class="nav-link" data-toggle="modal" data-target="#loginModal"><span class="fas fa-user"></span> Login</a>
      </li>
      <% } %>
  </ul>
  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Sign Up</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <form action="UserSignup" method="post">

             <div class="form-group">
     		 <label for="name">Your Name *</label>
   			 <input type="text" class="form-control" placeholder="Enter name" id="name" name="name" autocomplete="off">
  			</div>
 			<div class="form-group">
   				 <label for="number">Your Mobile No. *</label>
   				 <input type="number" class="form-control" placeholder="Enter your number" id="mobile" name="mobile" autocomplete="off">
 			 </div>
 			 
 			
 				 <div class="form-group">
   				 <label for="password">Your Password *</label>
   				 <input type="password" class="form-control" placeholder="Enter your password" id="password" name="password" autocomplete="off">
 			 </div>
 			 
 			 	 <div class="form-group">
   				 <label for="email">Your Email </label>
   				 <input type="email" class="form-control" placeholder="Enter your email" id="email" name="email" autocomplete="off">
 			 </div>
  			
  
 		 	<button type="submit" class="btn btn-primary">Submit</button>
		</form>
        </div>
        
      </div>
    </div>
  </div>

	<div class="modal fade" id="loginModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Login</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <form action="UserLogin" method="post">

             <div class="form-group">
     		 <label for="mobile">Mobile Number *</label>
   			 <input type="number" class="form-control" placeholder="Mobile Name" id="mobile" name="mobile" autocomplete="off">
  			</div>
 				 
  			<div class="form-group">
  			  <label for="password">Password</label>
   			 <input type="password" class="form-control" placeholder="Password" id="password" name="password" autocomplete="off">
 			 </div>
  
 		 	<button type="submit" class="btn btn-primary">Submit</button>
		</form>
        </div>
        
      </div>
    </div>
  </div>
  
  
  <div class="modal fade" id="appointmentModal">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Appointments</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
         <table  class="table table-hover">
			  <thead>
			  <tr><th colspan="2"> Upcoming Appointments </th></tr>
			    <tr>
			      <th scope="col">Doctor</th>
			      <th scope="col">Appointment Date</th>
			    </tr>
			  </thead>
			  <tbody>
			<% 
			if(session.getAttribute("user")!= null && ((UserVO)session.getAttribute("user")).getAppointmentList()!= null) {
			for(AppointmentVO appointment : ((UserVO)session.getAttribute("user")).getAppointmentList()) { 
				
				if(appointment.getDate().compareTo(new Date()) >=0 ) {
			%>
				<tr>
			      <td><%= appointment.getDoctor().getDoctorName() %></td>
			      <td><%= appointment.getDate() %></td>
			    </tr>
				
			<% }}} %>
			
			
				</tbody>
			</table>
			
			<Button type="button" class="btn btn-info" data-toggle="collapse"  data-target="#demo"> Previous Appointments </button>
			<table class="table table-hover collapse in" id="demo" >
			  <thead>
			  <tr><th> Previous Appointments </th></tr>
			    <tr>
			      <th scope="col">Doctor</th>
			      <th scope="col">Appointment Date</th>
			    </tr>
			  </thead>
			  <tbody>
			<% 
			if(session.getAttribute("user")!= null && ((UserVO)session.getAttribute("user")).getAppointmentList()!= null) {
			for(AppointmentVO appointment : ((UserVO)session.getAttribute("user")).getAppointmentList()) { 
				
				if(appointment.getDate().compareTo(new Date()) < 0) {
			%>
				<tr>
			      <td><%= appointment.getDoctor().getDoctorName() %></td>
			      <td><%= appointment.getDate() %></td>
			    </tr>
				
			<% }}} %>
			
			
				</tbody>
			</table>
        </div>
        
      </div>
    </div>
  </div>
  
  
  </div>
</nav>

<div id="demo" class="carousel slide" data-ride="carousel">
  
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="images/hospital/1.jpeg"  width="1100" height="150">
      <div class="carousel-caption">
        
      </div>   
    </div>
    <div class="carousel-item">
      <img src="images/hospital/2.jpeg"  width="1100" height="150">
      <div class="carousel-caption">
        
      </div>   
    </div>
    <div class="carousel-item">
      <img src="images/hospital/3.jpeg"  width="1100" height="150">
      <div class="carousel-caption">
       
      </div>   
    </div>
    <div class="carousel-item">
      <img src="images/hospital/5.jpeg"  width="1100" height="150">
      <div class="carousel-caption">
       
      </div>   
    </div>
    <div class="carousel-item">
      <img src="images/hospital/6.jpeg"  width="1100" height="150">
      <div class="carousel-caption">
       
      </div>   
    </div>
    
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
	</header>
	<section>
		<div class="container"> 
			<h4 class="text-muted pt-2">Hospitals in Jodhpur</h4> 
			<hr class="w-10">

			<div class="row">
				<div class=" col-lg-4 col-md-4 col-12">
					<img src="images/hospital/yash.jpg" class="img-fluid">

				</div>
				<div class=" col-lg-4 col-md-4 col-12">
					<h2 >Yash Aman Hospital</h2>
					<h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
				</svg> +(91)-9152624707</h4>
					<h5> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-forward" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z"/>
				</svg> AVAILABLE NOW</h5>

				</div>
				<div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
					<input type="button" class="btn btn-success" onClick="parent.location='detail.jsp'" value="In Detail">
				</div>
			</div>
			<hr class="w-5 pt-3">
			<div class="row">
				<div class=" col-lg-4 col-md-4 col-12">
					<img src="images/hospital/m.jpg" class="img-fluid">

				</div>
				<div class=" col-lg-4 col-md-4 col-12">
					<h2 >Marwar Hospital </h2>
					<h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
				</svg> +(91) -9772844440</h4>
					<h5> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-forward" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z"/>
				</svg> AVAILABLE NOW</h5>

				</div>
				<div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
					<input type="button" class="btn btn-success" onClick="parent.location='detail1.jsp'" value="In Detail">
				</div>
			</div>
			<hr class="w-5 pt-3">
			<div class="row">
				<div class=" col-lg-4 col-md-4 col-12">
					<img src="images/hospital/g.jpg" class="img-fluid">

				</div>
				<div class=" col-lg-4 col-md-4 col-12">
					<h2 >Goyal Hospital & Research Center Pvt Ltd </h2>
					<h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
				</svg> +91-291-2432144</h4>
					<h5> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-forward" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z"/>
				</svg> AVAILABLE NOW</h5>

				</div>
				<div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
					<input type="button" class="btn btn-success" onClick="parent.location='detail2.jsp'" value="In Detail">
				</div>
			</div>
			<hr class="w-5 pt-3">
			<div class="row">
				<div class=" col-lg-4 col-md-4 col-12">
					<img src="images/hospital/dn.jpg" class="img-fluid">

				</div>
				<div class=" col-lg-4 col-md-4 col-12">
					<h2 >Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital </h2>
					<h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
				</svg> +(91)-9152491758</h4>
					<h5> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-forward" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z"/>
				</svg> AVAILABLE NOW</h5>

				</div>
				<div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
					<input type="button" class="btn btn-success" onClick="parent.location='detail3.jsp'" value="In Detail">
				</div>
			</div>
			<hr class="w-5 pt-3">
			<div class="row">
				<div class=" col-lg-4 col-md-4 col-12">
					<img src="images/hospital/vn.jpg" class="img-fluid">

				</div>
				<div class=" col-lg-4 col-md-4 col-12">
					<h2 >Vinayaka Hospital</h2>
					<h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
				</svg> +(91)-9152598987</h4>
					<h5> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-forward" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z"/>
				</svg> AVAILABLE NOW</h5>

				</div>
				<div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
					<input type="button" class="btn btn-success" onClick="parent.location='detail4.jsp'" value="In Detail">
				</div>
			</div>
			<hr class="w-5 pt-3">
			<div class="row">
				<div class=" col-lg-4 col-md-4 col-12">
					<img src="images/hospital/mdm.jpg" class="img-fluid">

				</div>
				<div class=" col-lg-4 col-md-4 col-12">
					<h2 >Mdm Hospital </h2>
					<h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
				</svg> +(91)-291-2438655</h4>
					<h5> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-forward" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z"/>
				</svg> AVAILABLE NOW</h5>

				</div>
				<div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
					<input type="button" class="btn btn-success" onClick="parent.location='detail5.jsp'" value="In Detail">
				</div>
			</div>
			<hr class="w-5 pt-3">
		</div>


	</section>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
</body>
</html>