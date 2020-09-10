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
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
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
        <h1 style="text-align: center; background-color: #A28089;" class="mb-0">Welcome <%= request.getSession(false).getAttribute("adname")%></h1> 
        <!--<input type="button" value="Create Hotel">-->
<!--        <input type="button" value="Edit Hotel">
        <input type="button" value="Remove Hotel">-->
        <a href="logoutad">Logout</a><br>
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
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </body>
</html>
