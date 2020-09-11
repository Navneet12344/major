<%@page import="model.Database"%>
<%@page import="java.util.List"%>
<%@page import="model.Hotel"%>
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
			padding: 0;
			box-sizing: border-box;
		}
            tr th{
			background-color: rgba(0,0,0,0.8);
			color: white;
		}
             table,tr,th,td{
         	border: 1px solid #ccc;
		border-collapse: collapse;
		padding: 5px;
		text-align: center;
                margin-left: auto;
                margin-right: auto;
              }
              h1{
                  text-align: center;
              }
              tr:hover{
			background-color: #a9a9a9;
			cursor: pointer;
			color: white;
		}
        </style>
    </head>
    <body>
        <h1 style="text-align: center; background-color: #A28089;" class="mb-0">Welcome <%= request.getSession(false).getAttribute("adname")%></h1> 
        <a href="adminform.jsp" class="btn btn-primary ml-auto">Make Changes</a>
        <% List<Hotel> list=Database.getHotelRecords();
             out.print("<h1>Hotel Details</h1>");
             out.print("<table border='1' cellpadding='4' width='70%'>");
             out.print("<tr><th>Hid</th><th>HName</th><th>Rating</th><th>Address</th><th>About</th><th>Contact No.</th><th>Price</th>");
             for(Hotel h:list){
                   out.print("<tr><td>"+h.getHotelid()+"</td><td>"+h.getHotelname()+"</td><td>"+h.getRating()+"</td><td>"+h.getAddress()+"</td><td>"+h.getAbout()+"</td><td>"+h.getContact_No()+"</td><td>"+h.getPrice()+"</td>");
             
             }
            out.print("</table>");
         %>
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </body>
</html>
