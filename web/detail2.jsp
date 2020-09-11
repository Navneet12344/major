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
        <h1> Goyal Hospital & Research Center <br>Pvt Ltd   </h1>
        <h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
          </svg> +91-291-2432144</h4>
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
          <input type="hidden" name="doctorid" value="00GHR">
          
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
    <h3 class="text-muted">Goyal Hospital & Research Center Pvt Ltd in Residency Road, Jodhpur</h3>
    <hr class="w-5 pt-10">
    <br>
    <h3 class="text-muted">About Our Hospital</h3>
    <hr class="w-5 pt-10">
    <img src="images/hospital/g1.jpg" class="img-fluid"><br><br>
    <h6 class="text-muted">Goyal Hospital and Research Centre Pvt. Ltd. was established in 1989 by Dr. Anand Goyal with a vision to provide many different facilities under one roof. Goyal Hospital is a unique example of a Multi Super Speciality Medical Institution of modern times. Goyal Hospital provides comprehensive care to patients from all over Western Rajasthan. The Hospital believes in the policy of ploughing back its earnings for further improvements of hospital services. Adhering to its promise, it is constantly upgrading its facilities. Following its core philosophy of valuing human life above all, Goyal Hospital continuously strives to provide newer standards of medicine with a human touch. It's no wonder then that today the name Goyal Hospital is synonymous with care. The right doctors make a great hospital, for they are the ones who set the direction, bring in the skills and expertise and ultimately heal the patients. Then there are the visionaries who take a hospital to the new medical frontiers - in terms and technology, procedures and therapy. At Goyal Hospital, there is a happy mix of both expertise and vision. </h6><br>
    <h4 class="text-muted"> Overview:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">Regarded as one of the best healthcare providers, Goyal Hospital & Research Center Pvt Ltd, Residency Road has been providing a remarkable service ever since its inception. Equipped with advanced medical equipment and technologies, it has been constantly achieving milestones in the medical field. It is because of the untiring efforts of the dedicated stalwarts of this healthcare facility such as the doctors, nurses and the support staff that it has been able to grow and make new advancements every day. The ultimate objective of this healthcare centre stands to be better patient care. The establishment enjoys a good connectivity with the rest of the city because of its prominent location.</h6><br>
    <br>
    <h4>Contact number and Address :</h4>
    <hr class="w-5 pt-10">
    <h5 class="text-muted"> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
        </svg> +91-291-2432144, 2434144, 2625933 <br> Fax: +91-291-2624820 <br>For Appointments: +91- 8769707913<br>Ambulance: +91-9829027144</h5><br>
        <h5 class="text-muted"> <b>General Enquiry & Appointment:</b> info@goyalhospital.org</h5><br>
        <h5 class="text-muted"> 961/3, Residency Road, Opp. Rotary Hall,<br>
      Jodhpur - 342003, Rajasthan, INDIA
         <br><br>
        Open hours: 24 hrs ( Mon-Fri )</h5>
        <br>

    <h4 class="text-dark">Products and Services offered:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">As the whole world grapples with coronavirus, Goyal Hospital & Research Center Pvt Ltd, has come up to join the rest to fight the virus and eradicate it wholly. It has created additional facilities to accommodate the novel Coronavirus suspects. Isolation wards with adequate medical facilities have been formed so that there is no room for treatment delays in this time of emergency. Sufficient medical facilities are available for the patients who are tested positive. This establishment is fully prepared to create more isolation wards if need be. The doctors and medical staff are strictly abiding by the directions laid down by the Indian Council of Medical Research (ICMR) for diagnosing and treating the <b>COVID-19</b> patients. It is being touted as one of the best <b>Coronavirus testing centres in India </b> owing to its prompt service delivery. It has procured sufficient number of N95 masks and other essential equipment. It has also taken stern measures so that no one other than the doctors and nurses can enter the isolation ward.</h6>
	<br>
    <div class="p-3 mb-2 bg-light text-muted"><h4>Frequently Asked Question</h4></div>
    <h5>1. What are the various mode of payment accepted here ?</h5>
    <h6 class="text-muted">You can make payment Via Cash, Credit Card.</h6><br>
    <h5>2. Which is the nearest landmark ?</h5>
    <h6 class="text-muted">You can easily locate the establishment as it is in close proximity to Opposite Rotary Hall</h6><br>
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
  <div class="container pb-5">
  <h1 class="text-center pt-5 text-muted">Doctor's Message</h1>
        <hr class="w-25 mx-auto pt-5">

          <div class="row Center">
          <div class=" col-lg-12 col-md-12 col-12 ">
          <img src="images/hospital/gd1.jpg" class="img-fluid">
        </div>
        <h6 class="text-muted pt-5">The aim of Goyal hospital & Research center is to deliver world-class health care with a service focus by creating an institution committed to the highest
      standard of health care excellence in patient care and scientific knowledge & medical education</h6>
      <h6 class="text-muted pt-2">From last twenty five years. GHRC is consistently growing and this success is due to the comprehensive care that is provided to patients from all over Western Rajasthan.</h6>

      </div>
    </div>
</section>

<section class="py-2 pb-3">
  <div class="container border">

        <h1 class="text-center pt-5 text-muted"> Hospital Photos</h1>
        <hr class="w-25 mx-auto pt-5">
        <div class="row">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/m.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/m1.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/m2.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/m3.jpg" class="img-fluid">
        </div>
        </div>

        <div class="row py-3">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/m4.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/m5.jpg" class="img-fluid">
        </div>
        </div>

  </div>
 </section>
 <section class="py-5">
      <div class=" container border">
        <h2 class="pt-5 text-muted">Hospital Location in Map</h2>
        <hr class="w-5 pt-10">
        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14310.627464205108!2d73.0084662!3d26.2727977!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xd98f730ae41514ee!2sGoyal%20Hospital!5e0!3m2!1sen!2sin!4v1598449531852!5m2!1sen!2sin" width=100% height="500" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
      </div>
</section>
	


  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 
</body>
</html>