<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%          //scriplet tag to add java code in jsp
    response.setHeader("Pragma", "no-store,no-cache");
    response.setHeader("Cache-Control", "no-store,no-cache");
    if (request.getSession(false) == null) {
        response.sendRedirect("admin.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>JSP Page</title>
        <style>
            *{
			margin: 0;
			padding:0;
		}
            form input{
                display:block;
            }
            form textarea{
                display:block;
            }
            form{
		padding: 50px;
                border: 3px solid #f1f1f1; width: 40%;margin-right: auto; margin-left: auto;
            }
            label{
                margin-top: 5px;
            }
        </style>
    </head>
    <body>
        <header id="nav-bar">
        <nav class="navbar navbar-expand-sm bg-light navbar-light">
            <!--<i class="fa fa-backward" aria-hidden="true"></i>-->
                <i class="fa fa-backward mr-1" aria-hidden="true" style="font-size: 30px; color: red;"></i>
                <a class="navbar-brand text-danger mr-3" href="index.jsp">Back to Home</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> 
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                   <ul class="navbar-nav">
		      <li class="nav-item">
		        <a class="nav-link" href="#create">Create <span class="sr-only">(current)</span></a>
		      </li>
<!--		      <li class="nav-item">
		        <a class="nav-link" href="#remove">Remove</a>
		      </li>-->
		      <li class="nav-item">
		        <a class="nav-link" href="#update">Update</a>
		      </li>
		   </ul>
                  <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                      <a class="navbar-brand text-danger" href="logoutad"><i class="fa fa-sign-out mr-3" style="font-size: 30px; color:red;" aria-hidden="true"></i>Logout</a>
                    </li>
                  </ul>

                </div>
        </nav>
        </header>
    <section id="create">
        <h1 class="text-center text-warning">Add Hotel</h1>
        <form action="create" method="post" class="ml-auto" enctype="multipart/form-data">
            <label for="hname">Hotel name:</label>
            <input type="text" class="form-control" placeholder="Enter Hotel Name" name="hname" id="hname" autocomplete="off" required>
            <label for="rate">Ratings:</label>
            <input type="text" class="form-control" placeholder="Enter Ratings" name="rate" id="rate" autocomplete="off" required>
            <label for="address">Address:</label>
            <input type="text" class="form-control" placeholder="Enter Address" name="addr" id="address" autocomplete="off" required>
            <label for="about">About:</label>
            <textarea id="about" name="abt" rows="5" class="form-control"></textarea>
            <label for="mbno">Contact details:</label>
            <input type="tel" class="form-control" placeholder="Enter Contact no." name="mbno" id="mbno" autocomplete="off" pattern="[0-9]{10,11}" required>
            <label for="img">Add image:</label>
            <input type="file" class="form-control" name="img" id="img" autocomplete="off" accept="image/*" required>
            <label for="price">Price:</label>
            <input type="number" class="form-control" name="price" id="price" min="100" autocomplete="off"  required>
            <input type="submit" class="form-control mt-3 btn btn-success" value="Submit">
        </form>
    </section>  
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
