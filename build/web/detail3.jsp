<!DOCTYPE html>
<html>
<head>
	<title> </title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
	<style type="text/css">
		.container img{
			border-radius: 10px;
		}
	</style>

</head>
<body>
	<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
   <a class="navbar-brand text-white" href="hospital.jsp">HOSPITALS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
</nav>
<div class="container py-5 my-3 border">
  <div class="row">
    <div class="col-lg-8 col-md-8 col-12">
        <h2> Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital Pvt Ltd   </h2>
        <h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
          </svg>+(91)-9152491758</h4>
        </div>
        <div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
          <input type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal" value="Book Appoitment">
        </div>
        <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Fill this form for more information on <p class="text-warning">"Hospitals"</p></h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
                <div class="modal-body">
          <form action="BookAppointment" method="post">
          <input type="hidden" name="doctorid" value="00NMB">
          
		  <div class="form-group">
		    <label for="name">Your Name *</label>
		    <input type="text" class="form-control" placeholder="Enter name" id="name" autocomplete="off" name="name" value = '<%= session.getAttribute("name")== null ? "":session.getAttribute("name") %>' >
		  </div>
		  <div class="form-group">
		    <label for="mobile">Your Mobile No. *</label>
		    <input type="number" class="form-control" placeholder="Enter your number" id="mobile" name="mobile" autocomplete="off"  value = '<%= session.getAttribute("mobile") %>' >
		  </div>
		  <div class="form-group">
		    <label for="email">Your Email ID (Optional)</label>
		    <input type="email" class="form-control" placeholder="Enter email id" id="email" name="email" autocomplete="off"  value = '<%= session.getAttribute("email") == null ? "":session.getAttribute("email") %>' >
		  </div>
		  
		
    	 <div class="form-group">
			 <label for="date">Appointment Date *</label>
			 <input type="text" class="form-control" placeholder="Enter Date"  name="date" autocomplete="off" id="datepicker">
 		</div>

		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
        </div>
      </div>
    </div>
  </div>
      </div>
</div>
</header>
<section>
  <div class="container border pb-5">
    <div class="p-3 mb-2 bg-light text-muted"><h4>Business Information</h4></div>
    <h3 class="text-muted">Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital in Sardarpura, Jodhpur</h3>
    <hr class="w-5 pt-10">
    <br>
    <h3 class="text-muted">About Hospital</h3>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">Our Team At Mirdha Dental Hospital Is Having A Team Of Highly Skilled And Reputed Dental Surgeons On Their Panel. All Of Us Provide An Array Of Dental Procedures, All Performed Under One Roof.</h6>
    <h6 class="text-muted">Mirdha Dental Hospital Is Only Hospital Of Western Rajasthan Which Is Equipped With Dental Operating Microscope And Dental Laser.</h6>

    <h6 class="text-muted">Our Whole Dental Team Is Dedicated To Provide You The Best In All Aspects Of Dental Care Within A Friendly And Caring Environment. We Place A High Emphasis On Prevention And Patient Education. We Work With You To Help You Achieve Optimum Dental Health.</h6>

    <h6 class="text-muted">We Have Been Providing High Quality, Comfortable Solutions To Countless Number Of Clients At The Most Affordable Prices In Our Zone.</h6>

    <h6 class="text-muted">Dr. Nitin Mirdha And His Team Of Experts Will Provide You The Best Possible Quality Of Dental Care.</h6><br>
    <h4 class="text-muted"> Overview:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">One among the most popular dentists in the city is Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital in Sardarpura, Jodhpur. Understanding that tooth related issues can be scary for many, this dentist has a very calm approach when treating patients which helps keep them calm. The dental facility stands located in Sardarpura which makes it hassle-free for people from near and far alike to visit and consult the dentist. It occupies a strategic location at 1st D Road, Near Nehru Park which makes it easy to locate the dentist's centre. The doctor holds specialization in Dentist. With an experience of 8 years in dentistry, the doctor is well suited to look into various dental complications. The dentist is a revered member of Indian Dental Association which speaks highly of the doctor's credibility.</h6><br>
    <br>
    <h4>Contact number and Address :</h4>
    <hr class="w-5 pt-10">
    <h5 class="text-muted"> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
        </svg> +(91)-9152491758</h5><br>
        <h5 class="text-muted">House No 1016, 1st D Road,Sardarpura,<br>Jodhour-342003,Near Nehru Park
         </h5>
        <br>

    <h4 class="text-dark">Services offered:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital in Sardarpura, Jodhpur holds immense popularity in the city for being a dental facility equipped with advanced dental equipment for better treatment of patients. Right from regular dental check-ups and cleaning to more serious dental procedures, this dentist ensures every single issue is tackled with care and in a way that the patient feels at ease. There is a waiting area and a dedicated consultation area which ensures the patients feel at ease. Apart from the tooth and gum issues, the suggestions given by the dentist for maintaining proper dental health prove to be quite effective. Post-treatment care and prevention are given equal importance as that given to the procedures. The dentist offers medical services like Dental Surgeon, Endosurgery, Laser Dentistry, Dental Examination, Metal Braces Fixing, Fixed Prosthodontics, Scraping Periodontal to name a few. Payments can be made via various modes like Cash. The dental clinic is operational between 11:00 - 20:00.</h6>
	<br>
    <div class="p-3 mb-2 bg-light text-muted"><h4>Frequently Asked Question</h4></div>
    <h5>1. What are the various mode of payment accepted here ?</h5>
    <h6 class="text-muted">You can make payment Via Cash.</h6><br>
    <h5>2. Which is the nearest landmark ?</h5>
    <h6 class="text-muted">You can easily locate the establishment as it is in close proximity to Near Nehru Park</h6><br>
    <h5>2. What are its hours of operation ?</h5>
    <h6 class="text-muted">The establishment is functional on<br>
          Monday:- 11:00 Am - 8:00 Pm<br>
          Tuesday:-11:00 Am - 8:00 Pm<br>
          Wednesday:- 11:00 Am - 8:00 Pm<br>
          Thursday:- 11:00 Am - 8:00 Pm<br>
          Friday:- 11:00 Am - 8:00 Pm<br>
          Saturday:- 11:00 Am - 8:00 Pm<br>
          Sunday:- 11:00 Am - 3:00 Pm</h6>
  </div>
</section>

<section class="py-2 pb-3">
  <div class="container border">

        <h1 class="text-center pt-5 text-muted"> Hospital Photos</h1>
        <hr class="w-25 mx-auto pt-5">
        <div class="row pb-5">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/dn.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/dn4.jpg" class="img-fluid">
        </div>
       <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/dn2.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/dn5.jpg" class="img-fluid">
        </div>
        </div>
       </div>

  </div>
 </section>
	<section class="py-5">
      <div class=" container border">
        <h2 class="pt-5 text-muted">Hospital Location in Map</h2>
        <hr class="w-5 pt-10">
        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14310.191538731398!2d73.0132307!3d26.2763331!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x41d102dd4e33f960!2sMIRDHA%20DENTAL%20HOSPITAL!5e0!3m2!1sen!2sin!4v1598449434214!5m2!1sen!2sin" width=100% height="500" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
      </div>
</section>


  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 
</body>
</html>