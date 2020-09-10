<%@page import="java.util.List"%>
<%@page import="model.Hotel"%>
<%@page import="model.Database"%>
<!DOCTYPE html>
<html>
<head>
	<title>Hotels</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">	
</head>
<body>
<!-- navbar starts -->
<section id="nav-bar">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
          <i class="fa fa-h-square mr-1" aria-hidden="true" style="font-size: 30px; color: red;"></i>
		  <a class="navbar-brand text-danger" href="file:///E:/bootstrap%204/index.html#">HOTELS.com</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> 
		    <span class="navbar-toggler-icon"></span>
		  </button>

		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#about_i">About</a>
		      </li>
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          Menu
		        </a>
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		          <a class="dropdown-item" href="#">Your Account</a>
		          <div class="dropdown-divider"></div>
		          <a class="dropdown-item" href="logout">Logout</a>
		        </div>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#contact_us">Contact Us</a>
		      </li>
		    </ul>
		    <form class="form-inline my-2 my-lg-0">
		      <input class="form-control mr-sm-2 bg-dark text-white" type="search" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0 mr-2" type="submit">Search</button>
                    </form>
		    <ul class="navbar-nav navbar-right">
		      <li class="nav-item"><a class="nav-link" href="#" data-toggle="modal" data-target="#myModalS"><i class="fa fa-user mr-1" aria-hidden="true"></i>Sign Up</a></li>
                    
                                <% if( session.getAttribute("mail") != null) { %>
                     <li class="nav-item">
                       
                       <div class="btn-group">
             			<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                			<%= session.getAttribute("uname") %>
              			</button>
              			<div class="dropdown-menu">
                                    <a class="dropdown-item" data-toggle="modal" data-target="#appointmentModal">Bookings</a>
                		    <a class="dropdown-item" href="logout">Logout</a>
                			
              		        </div>
                      </div>
                     </li>
                    
                      <% } else{%>
		      <li class="nav-item"><a class="nav-link" href="#" data-toggle="modal" data-target="#myModalL"><i class="fa fa-sign-in mr-1" aria-hidden="true"></i>Login</a></li>
                      <%}%>
                      
                      
		    </ul>
		  </div>
		</nav>
</section>		
<!-- The Modal for login-->
<div class="modal" id="myModalL">
    <div class="modal-dialog">
		<div class="modal-content">

		<!-- Modal Header -->
		<div class="modal-header">
			<h4 class="modal-title" style="font-size: 30px;">Login</h4>
			<button type="button" class="close" data-dismiss="modal">&times;</button>
		</div>

		<!-- Modal body -->
		<div class="modal-body">
                        <form action="login" method="post">
				<div class="form-group">
					<label for="email">Email address:</label>
                                        <input type="email" class="form-control" placeholder="Enter email" name="email" id="email" autocomplete="off" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label>
				    <input type="password" class="form-control" placeholder="Enter password" name="pwd" id="pwd" autocomplete="off" required>
	   		    </div>
		   	    <div class="form-group form-check">
				    <label class="form-check-label">
			        <input class="form-check-input" type="checkbox"> Remember me
				    </label>
	  		    </div>
                                    <input type="submit" class="btn btn-success" value="Sign-in">
					</form>
			    </div>

			    <!-- Modal footer -->
			    <div class="modal-footer">
			        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
			    </div>

			    </div>
			  </div>
			</div>

<!-- The Modal for Signup-->
<div class="modal" id="myModalS">
	<div class="modal-dialog">
		<div class="modal-content">

	    <!-- Modal Header -->
        <div class="modal-header">
	        <h4 class="modal-title" style="font-size: 30px;">SignUp</h4>
		    <button type="button" class="close" data-dismiss="modal">&times;</button>
	    </div>

	    <!-- Modal body -->
	    <div class="modal-body">
                <form action="signup" method="post">
		    <div class="form-group">
                        <label for="name">Name:</label>
			    <input type="text" id="name" name="name" class="form-control" placeholder="Enter your name" >
		    </div>
		    <div class="form-group">
			    <label for="email">Email address:</label>
                            <input type="email" id="email" name="email" class="form-control" placeholder="Enter email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Format is characters@characters.domain" required>
		    </div>
		    <div class="form-group">
			    <label for="phone">Mobile no:</label>
                            <input type="tel" id="phone" name="phone" class="form-control" placeholder="Enter Mobile No." pattern="[0-9]{10,11}" required>
		    </div>
		    <div class="form-group">
			    <label for="pwd">Password:</label>
			    <input type="password" id="pwd" name="pwd" class="form-control" placeholder="Enter password">
		    </div>
			<div class="form-group form-check">
				<label class="form-check-label">
				<input class="form-check-input" type="checkbox"> Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
			</div>

			<!-- Modal footer -->
			<div class="modal-footer">
			    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>

<!-- navbar ends -->

<!-- carousel starts -->
<div id="demo" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>

  <!-- The slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="images/carousel1.jpg" alt="Hotel1"> 
    </div>
    <div class="carousel-item">
      <img src="images/carousel2.jpg" alt="Hotel2">
    </div>
    <div class="carousel-item">
      <img src="images/carousel3.jpg" alt="Hotel3">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>

</div>
<!-- carousel ends -->

<!-- hotels with images starts -->
<section>
	<div class="container-fluid">
        <h3 class="my-5 text-secondary">These top hotels are just a click away!</h3>
        
        
        <div class="row text-center">
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px;">
                            <img class="card-img-top" src="images/1st hotel/img1.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">THE UMED HOTEL</h4>
					    <p class="card-text">3-star hotel <br> 	Opp. Umaid kanya school, Jodhpur</p>
					    <a href="hotel1.jsp" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/2nd hotel/img21.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">Jodhpur Heritage Haveli </h4>
					    <p class="card-text">1-star hotel <br>Brahmin Ki Gali Umaid Chowk, Jodhpur</p>
					    <a href="hotel2.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/3rd hotel/img31.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 18825 Hotel Akshey</h4>
					    <p class="card-text">3-star hotel <br> Rai Ka Bagh, Jodhpur</p>
					    <a href="hotel3.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/4th hotel/img41.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 10422 Hotel Udai Garh Palace</h4>
					    <p class="card-text">3-star hotel <br> 	Near Shri Ram Hospital, Prem Nagar, Jodhpur</p>
					    <a href="hotel4.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/5th hotel/img51.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">Capital O 11973 Badri Palace</h4>
					    <p class="card-text">3-star hotel <br> 	Opposite Filter House, Chopasani Rd, Chopasni Housing Board, Jodhpur</p>
					    <a href="hotel5.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/6th hotel/img61.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 23571 Jai Bhawani</h4>
					    <p class="card-text">3-star hotel <br> Near DPS school, Pal Chopasani Bypass Rd, Jodhpur</p>
					    <a href="hotel6.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/7th hotel/img71.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">Hotel Omni Plaza</h4>
					    <p class="card-text">4-star hotel <br> 	Near Rajasthan Patrika Bhawan, Maan Ji Ka Hattha, Paota, Jodhpur</p>
					    <a href="hotel7.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/8th hotel/img81.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">Capital O 1623 Hotel JS Regency</h4>
					    <p class="card-text">3-star hotel <br> 	Near ST Paul School, Jaipur Bypass Road, Jhalamand, Jodhpur</p>
					    <a href="hotel8.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/9th hotel/img91.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 1195 Hotel Suncity International</h4>
					    <p class="card-text">3-star hotel <br> 	Airport Rd, Panch Batti Cir, Jagatpura, Jodhpur</p>
					    <a href="hotel9.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/10th hotel/img101.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 16577 Raj Shree Guest House</h4>
					    <p class="card-text">2-star hotel <br> Hotel Raj shree guest house, 263, B Rd, above Raj Shree Handloom, Laxmi Nagar, Jodhpur</p>
					    <a href="hotel10.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/11th hotel/img111.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 10368 Om Heritage</h4>
					    <p class="card-text">2-star hotel <br> 	 35, Juni Bagar Chowk, Near Ladnu Haveli, Gulab Sagar, Jodhpur</p>
					    <a href="hotel11.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/12th hotel/img121.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 15984 Crown Plaza Heritage</h4>
					    <p class="card-text">3-star hotel <br> Crown Plaza Hritage, 260, 1st Polo Rd, near Astha Hospital, Bhadwasiya, Paota, Jodhpur</p>
					    <a href="hotel12.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/13th hotel/img131.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">Capital O 30351 S B Excellency</h4>
					    <p class="card-text">2-star hotel <br> Near AIIMS, 1A, M.I.A. 1st Phase, Basni, Basni, Jodhpur</p>
					    <a href="hotel13.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/14th hotel/img141.jpeg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">Poonam Guest House</h4>
					    <p class="card-text">3-star hotel <br> 	4 Kuchaman House Near Panch Batti Circle, Air Force Road, Jodhpur</p>
					    <a href="hotel14.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        	<div class="col-lg-4 col-md-4 col-12">
        		<div class="card" style="width:400px">
					<img class="card-img-top" src="images/15th hotel/img151.jpg" style="height: 200px;" alt="image">
					  <div class="card-body">
					    <h4 class="card-title">OYO 27876 Hotel Preminn</h4>
					    <p class="card-text">3-star hotel <br>  Plot no -5 Hotel prem inn near mangal deep building, Pal Rd, Jodhpur</p>
					    <a href="hotel15.html" class="btn btn-primary">Visit</a>
					  </div>
			    </div>
        	</div>
        </div>
    </div>
</section>
<!-- hotels with images ends -->
<!--about us starts-->
<section id="about_i" class="mt-5">
    <div class="container">
        <h2 class="text-center text-white mb-3" style="background-color: #C38D9E;">About Us</h2>
        <p>
      Our mission at Hotels.com is to provide the best hotels at an affordable price to the client through its network. We want to provide a true discount on the true price of the hotels. The interactive and advance mobile app will make your stay pleasant and convenient.
      Have a nice stay or better to say have a "Hotels.com" stay.<br><br>

      We are Hotels.com an OTA (Online Travel Agent) and we deal with hotels by offering the best deal to join with us as a partner. We are the online partner of hotels and we collect the information about hotel service providers & make the provider our partner and then sell the provider's service under our guidelines.<br><br>

      Our goal is to "stay real, stay loyal and a happy stay with Hotels.com stay".<br><br>

      Every time we try to make a healthy or homely environment in your hotel stay. We are not only providing you a stay; we provide you with are markable feeling. We believe everyone deserves the best it's an idea of experiencing new places in real-time. Your exiting travel starts with Hotels.com stay.<br><br>
    </p>
    </div>
</section>
<!--about us ends-->

<!--contact us starts #FA8072-->
<section id="contact_us">
    <div style="background-color: black;" class="text-white text-center">
        <h2>Contact Us</h2>
        <i class="fa fa-phone mr-3" aria-hidden="true"></i>Mobile No. 7821032382
        <i class="fa fa-envelope mr-3 ml-5" aria-hidden="true"></i>Email: kaurnavneet71242@gmail.com
    </div>
</section>

<!--contact us ends-->

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script src="js/smooth-scroll.js">
    var scroll = new SmoothScroll('a[href*="#"]');
</script>
</body>
</html>

<!--  <form class="form-inline my-2 my-lg-0">
		      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form> -->