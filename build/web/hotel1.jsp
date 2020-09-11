<%@page import="model.Database"%>
<%@page import="model.Hotel"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<header id="nav-bar">
<nav class="navbar navbar-expand-sm bg-light navbar-light">
	<i class="fa fa-h-square mr-1" aria-hidden="true" style="font-size: 30px; color: red;"></i>
	<a class="navbar-brand text-danger" href="index.html">HOTELS.com</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> 
	<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
	<ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="#">Overview</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#location">Location</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#about">About</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#photos">Photos</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#price">Price</a>
	    </li>
	  </ul>
            
	</div>
</nav>
</header>
<!-- navbar1 ends -->
<%  int hid=Integer.parseInt(request.getParameter("page"));
    Hotel h=Database.getHotelFromId(hid);
    String iname=Database.getImageName(hid);
%>
<img src="images/<%=iname%>" alt="Hotel">

<!--<section>
<div class="container-fluid">
<div id="demo" class="carousel slide" data-ride="carousel">
   Indicators 
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>

   The slideshow 
  <div class="carousel-inner">
    <div class="carousel-item active">
       <div class="row">
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img1.jpg" alt="Hotel1">
		</div>
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img2.jpg" alt="Hotel1">
		</div>
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img3.jpg" alt="Hotel1">
	    </div>
	   </div>
    </div>
    <div class="carousel-item">
      <div class="row">
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img4.jpg" alt="Hotel1">
		</div>
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img5.jpg" alt="Hotel1">
		</div>
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img6.jpg" alt="Hotel1">
	    </div>
	   </div>
    </div>
    <div class="carousel-item">
      <div class="row">
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img7.jpg" alt="Hotel1">
		</div>
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img8.jpg" alt="Hotel1">
		</div>
		<div class="col-lg-4 col-md-4 col-12">
		    <img src="images/1st hotel/img9.jpg" alt="Hotel1">
	    </div>
	   </div>
    </div>
  </div>

   Left and right controls 
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>

</div>
</div>
</section>-->
<!-- corousel ends -->

<section>
	<div class="container">
		<div class="card mx-auto mt-5">
			<div class="card-body">
				<h3 class="card-title" style="color: #ff0080;"><%=h.getHotelname()%> <a href="#" class="btn btn-primary float-right"><%=h.getPrice()%></a></h3> <br>
                <p class="card-text"> <%=h.getRating()%><br>
                <%=h.getAddress()%><br><br>
                <a href="#price" class="btn btn-primary">Book Now</a>
                </p>
			</div>
		</div>
	</div>
</section>
<!-------------- about section------------->
<section id="about">
	<div class="container">
		<div class="card mx-auto mt-5 mb-5">
			<div class="card-body">
                <div class="row">
                	<div class="col-lg-8 col-md-8 col-12">
                		<h4 class="card-title">About this hotel</h4>
						<p class="card-text"><%=h.getAbout()%></p>
                	</div>
                	<div class="col-lg-4 col-md-4 col-12">
                		<h6 class="card-title mt-5">Address and contact information</h6>
                		<p class="card-text">
                			<i class="fa fa-map-marker mr-3" aria-hidden="true"></i><%=h.getAddress()%><br><br>
                			<i class="fa fa-phone mr-3" aria-hidden="true"></i><%=h.getContact_No()%>
                
                		</p>
                	</div>
                </div>		
			</div>
		</div>
		<div class="card mx-auto mt-5 mb-5">
			<div class="card-body">
				<h3 class="card-title">Amenities</h3><hr>
				<h5 class="card-title mt-3">Popular amenities</h5>
				<p class="card-text">
                	<i class="fa fa-wifi mr-3" aria-hidden="true"></i>Wifi<span class="badge badge-secondary ml-3 mr-5">free</span>
                	<i class="fa fa-car mr-3" aria-hidden="true"></i>Parking<span class="badge badge-secondary ml-3 mr-5">free</span>
                	<!--<i class="fa fa-snowflake-o mr-3" aria-hidden="true"></i>A.C.<span class="badge badge-secondary ml-3 mr-5">free</span>-->
                	<!--<i class="fa fa-cutlery mr-3" aria-hidden="true"></i>Breakfast<span class="badge badge-secondary ml-3 mr-5">extra charge</span><hr>-->
                </p>
                <div class="row">
                	<div class="col-lg-6 col-md-6 col-12">
                		<h5 class="card-title"><i class="fa fa-wifi mr-3 mt-3" aria-hidden="true"></i>Internet</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Wifi<span class="badge badge-secondary ml-2">free</span>
		                </p>

		                <h5 class="card-title"><i class="fa fa-money mr-3 mt-3" aria-hidden="true"></i>Policies and Payments</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Smoke-free Property
		                </p>

		                <h5 class="card-title"><i class="fa fa-child mr-3 mt-3" aria-hidden="true"></i>Children</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Kid-Friendly
		                </p>

		                <h5 class="card-title"><i class="fa fa-car mr-3 mt-3" aria-hidden="true"></i>Parking and Transportation</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Parking<span class="badge badge-secondary ml-2">free</span><br>
		                	<!--<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Airport Shuttle-->
		                </p>

<!--		                <h5 class="card-title"><i class="fa fa-bed mr-3 mt-3" aria-hidden="true"></i>Rooms</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Air-conditioning<br>
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>
		                	Kitchen in some rooms
		                </p>-->
                	</div>
                	<div class="col-lg-6 col-md-6 col-12">
                        <h5 class="card-title"><i class="fa fa-cutlery mr-3 mt-3" aria-hidden="true"></i>Food and Drink</h5><hr>
		                <p class="card-text">
		                	<!--<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Restaurant<br>-->
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>
		                	Room Service<br>
<!--		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>
		                	Breakfast<span class="badge badge-secondary ml-3 mr-5">free</span><br>-->
<!--		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>
		                	Breakfast-buffet-->
		                </p>

		                <h5 class="card-title"><i class="fa fa-bell mr-3 mt-3" aria-hidden="true"></i>Services</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Front-desk<br>
<!--		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>
		                	Full-service laundry<span class="badge badge-secondary ml-3 mr-5">24 hour</span><br>-->
		                </p>


<!--		                <h5 class="card-title"><i class="fa fa-tint mr-3 mt-3" aria-hidden="true"></i>Pools</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-ban ml-5 mr-3" aria-hidden="true"></i>No-pools<br>
		                	<i class="fa fa-ban ml-5 mr-3" aria-hidden="true"></i>
		                	No hot tub<br>
		                </p>


		                <h5 class="card-title"><i class="fa fa-expand mr-3 mt-3" aria-hidden="true"></i>Wellness</h5><hr>
		                <p class="card-text">
		                	<i class="fa fa-check ml-5 mr-3 text-success" aria-hidden="true"></i>Fitness center<br>
		                	<i class="fa fa-ban ml-5 mr-3" aria-hidden="true"></i>
		                	No-spa<br>
		                </p>-->
                	</div>
                </div>
            </div>
        </div>
	</div>
</section>
<!--------about section ends-------->

<!-- location section 
<p id="location">
	<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3577.2117059317948!2d73.02211681450713!3d26.287236093064692!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39418b89a026c227%3A0x2b23d4ab9d7efc7b!2sTHE%20UMED%20HOTEL!5e0!3m2!1sen!2sin!4v1597132510280!5m2!1sen!2sin" width="100%" height="700" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
</p>-->
<!-- location section ends -->

<!-- photos -->
<!--<section id="photos">
  <div class="container" id="image">
	<div class="card mx-auto mt-5">
		<div class="card-body">
			<h3>Gallery</h3><hr class="mx-auto" style="width: 15%;">
                        <div class="row">
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img2.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img3.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img4.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img5.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img6.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img7.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img8.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img9.jpg" alt="image">
				</div>
				<div class="col-lg-4 col-md-4 col-12">
					<img src="images/1st hotel/img10.jpg" alt="image">
				</div>
			</div>
		</div>
	</div>
  </div>
</section>-->
<!-- photos end -->

<!-- price start -->
<section id="price">
	<div class="container">
	  <div class="card mt-5 mb-5">
		<div class="card-body mx-auto">
                    <h3 style="text-align: center; color: brown;">Prices</h3><hr class="mx-auto" style="width: 15%;">
		    <label for="Check-in">Check-in:</label>
                    <input type="date" class="mr-5" id="Check-in" min="2018-02-01" name="Check-in">
		    <label for="Check-out">Check-out:</label>
		    <input type="date" id="Check-out" name="Check-out">
                    <input type="hidden" value="<%=h.getHotelname()%>" id="hn" name="hname">
                    <input type="submit" class="btn btn-success" value="Check Price" onclick="showPrice()">
                    <p class="mt-3">Total price :<span id="addcontent"></span></p>
                    <input type="submit" class="btn btn-primary" value="Make Payment">
                </div>
	</div>
   </div>
</section>
<!-- price end -->

<footer>
	<p class="p-3 mb-0 fixed-bottom" style="background-color:#ececec; font-weight: bold;">THE UMED HOTEL<a href="#" class="btn btn-primary float-right">1,469</a></p>
</footer>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<!-- for scrolling -->
<script src="js/smooth-scroll.js"></script>
<script src="js/common.js"></script>
</body>
</html>
