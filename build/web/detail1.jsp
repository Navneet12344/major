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
        <h1> Marwar Hospital  </h1>
        <h4> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
          </svg> +(91) -9772844440</h4>
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
          <input type="hidden" name="doctorid" value="00MRH">
          
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
    <h3 class="text-muted">Marwar Hospital in Mandore Road, Jodhpur</h3>
    <hr class="w-5 pt-10">
    <br>
    <h4>Location and Overview:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">Established in the year 2014, Marwar Hospital in Mandore Road, Jodhpur is a top player in the category Hospitals in the Jodhpur. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Jodhpur. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Jodhpur, this establishment occupies a prominent location in Mandore Road. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at , Near ONGC Office, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Hospitals, General Physician Doctors, Gynaecologist & Obstetrician Doctors, Neurologists, ENT Doctors, Paediatricians, Dentists, Public Hospitals.</h6><br>
    
    <h4>Contact number and Address :</h4>
    <hr class="w-5 pt-10">
    <h5 class="text-muted"> <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-telephone-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z"/>
        </svg> +(91) -9772844440 </h5><br>
        <h5 class="text-muted">Mandore Road,Jodhpur-342006,Near ONGC Office
         <br><br>
        Open hours: 24 hrs ( Mon-Fri )</h5>
        <br>

    <h4 class="text-dark">Products and Services offered:</h4>
    <hr class="w-5 pt-10">
    <h6 class="text-muted">Marwar Hospital in Mandore Road has a wide range of products and services to cater to the varied requirements of their customers. The staff at this establishment are courteous and prompt at providing any assistance. They readily answer any queries or questions that you may have. Pay for the product or service with ease by using any of the available modes of payment, such as Cash,Debit Card,Credit Card. This establishment is functional from 00:00 - 23:59.</h6>
	<br>
    <div class="p-3 mb-2 bg-light text-muted"><h4>Frequently Asked Question</h4></div>
    <h5>1. What are the various mode of payment accepted here ?</h5>
    <h6 class="text-muted">You can make payment Via Cash, Credit Card.</h6><br>
    <h5>2. Which is the nearest landmark ?</h5>
    <h6 class="text-muted">You can easily locate the establishment as it is in close proximity to Near ONGC Office</h6><br>
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
  <div class="container border">
        <h1 class="text-center pt-5 text-muted"> Hospital Photos</h1>
        <hr class="w-25 mx-auto pt-5">

        <div class="row">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/hospital/hospital/m.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/hospital/hospital/m1.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/hospital/hospital/m2.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/hospital/hospital/m3.jpg" class="img-fluid">
        </div>
        </div>

        <div class="row py-3">
          <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/hospital/hospital/m4.jpg" class="img-fluid">
        </div>
        <div class=" col-lg-3 col-md-3 col-12 ">
          <img src="images/hospital/hospital/hospital/m5.jpg" class="img-fluid">
        </div>
        </div>

  </div>
 </section>
	<section class="py-5">
      <div class=" container border">
        <h2 class="pt-5 text-muted">Hospital Location in Map</h2>
        <hr class="w-5 pt-10">
        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14301.753824758209!2d73.0385299!3d26.344677!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x127df7e8f986b080!2sMarwar%20Hospital%20Jodhpur!5e0!3m2!1sen!2sin!4v1598449621046!5m2!1sen!2sin" width=100% height="500" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
      </div>
</section>


	  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 
</body>
</html>