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
        <h1> MATHURA DAS MATHUR HOSPITAL (MDM),Jodhpur </h1>
        <h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
          </svg> +(91)-291-2438655</h4>
        </div>
        <div class=" col-lg-4 col-md-4 col-12 px-5 py-5">
          <input type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal" value="Book Appointment">
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
          <input type="hidden" name="doctorid" value="00MDM">
          
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
    <h3 class="text-muted">Mdm Hospital in Shastri Nagar, Jodhpur</h3>
    <hr class="w-5 pt-10">
    <br>
    <h4>Location and Overview:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">In Jodhpur, Mdm Hospital is a recognized name in patient care. It was incepted in the year 1988. They are one of the well-known Public Hospitals in Shastri Nagar. Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities, they are one of the upcoming names in the healthcare industry. Located in , this hospital is easily accessible by various means of transport. A team of well-trained medical staff, non-medical staff and experienced clinical technicians work round-the-clock to offer various services that include Opd Services 9.00 Am To 3.00 Pm, Pathology Lab , Xray , Ct Scan , Casualty , Blood Bank , I.c.c.u. , Chemist , Ambulance Service . Their professional services make them a sought after Public Hospitals in Jodhpur. A team of doctors on board, including specialists are equipped with the knowledge and expertise for handling various types of medical cases.</h6>
    <h6 class="text-muted">At Mdm Hospital in Shastri Nagar, the various modes of payment accepted are Cash. You can reach them at New Mdm Campus,3/4,Shastri Nagar-342003. The contact number of this hospital is +(91)-291-2438655. This establishment has been rated a 4.3 from a total of 60+ ratings. This listing is also listed in Public Hospitals, Hospitals.</h6><br>
    
    <h4>Contact number and Address :</h4>
    <hr class="w-5 pt-10">
    <h5 class="text-muted"> <b>Superintendent:</b> Dr. M.K. Aseri (W: 0291-2434052), Mob.: 9414200900</h5>
    <h5 class="text-muted"><b>EPBX:</b> 0291-2623139-40, 2438655-57</h5>
    <h5 class="text-muted"><b>Enquiry:</b> 0291-2432513</h5>
    <h5 class="text-muted"><b>Email:</b> supdt.mdmh.ju@gmail.com</h5><br>
        <h5 class="text-muted">3/4, Shastri Nagar, Jodhpur - 342003, New Mdm Campus 
         <br><br>
        Open hours: 24 hrs ( Mon-Fri )</h5>
        <br>

    <div class="p-3 mb-2 bg-light text-muted"><h4>Frequently Asked Question</h4></div>
    <h5>1. What are the various mode of payment accepted here ?</h5>
    <h6 class="text-muted">You can make payment Via Cash, Credit Card.</h6><br>
    <h5>2. Which is the nearest landmark ?</h5>
    <h6 class="text-muted">You can easily locate the establishment as it is in close proximity to New Mdm Campus</h6><br>
    <h5>2. What are its hours of operation ?</h5>
    <h6 class="text-muted">The establishment is functional on<br>
          Monday:- Open 24 Hrs<br>
          Tuesday:- Open 24 Hrs<br>
          Wednesday:- Open 24 Hrs<br>
          Thursday:- Open 24 Hrs<br>
          Friday:- Open 24 Hrs<br>
          Saturday:- Open 24 Hrs<br>
          Sunday:- Open 24 Hrs</h6>
  </div>
</section>

<section class="py-2 pb-3">
  <div class="container border pb-5">

        <h1 class="text-center pt-5 text-muted"> Hospital Photos</h1>
        <hr class="w-25 mx-auto pt-5">
        <div class="row">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm1.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm2.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm3.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm4.jpg" class="img-fluid">
        </div>
        </div>
        <div class="row pt-5">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm5.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm6.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm7.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/mdm8.jpg" class="img-fluid">
        </div>
        </div>

  </div>
 </section>
 <section class="py-5">
      <div class=" container border">
        <h2 class="pt-5 text-muted">Hospital Location in Map</h2>
        <hr class="w-5 pt-10">
	      <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14311.473093481596!2d73.0091252!3d26.2659383!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x4679016e36279c48!2sMathuradas%20Mathur%20Hospital!5e0!3m2!1sen!2sin!4v1598448772592!5m2!1sen!2sin" width=100% height="500" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
      </div>
</section>

  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 
</body>
</html>