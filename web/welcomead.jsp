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

    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
			cursor: pointer;
			font-weight: bold;
		}
                #right{
                    float: right;
                }
        </style>
    </head>
    
        <h1 style="text-align: center; background-color: #A28089;" class="mb-0">Welcome <%= request.getSession(false).getAttribute("adname")%></h1> 
        <i class="fa fa-backward mr-1" aria-hidden="true" style="font-size: 30px; color: red;"></i>
        <a class="navbar-brand text-danger mr-3" href="index.jsp">Back to Home</a>
        <a href="adminform.jsp" class="btn btn-primary" id="right">Make Changes</a>
        <% List<Hotel> list=Database.getHotelRecords();
             out.print("<h1>Hotel Details</h1>");
             out.print("<table border='1' cellpadding='4' width='70%'>");
             out.print("<tr><th>Hid</th><th>HName</th><th>Rating</th><th>Address</th><th>About</th><th>Contact No.</th><th>Price</th><th>Remove</th></tr>");
             for(Hotel h:list){
                   out.print("<tr><td>"+h.getHotelid()+"</td><td>"+h.getHotelname()+"</td><td>"+h.getRating()+"</td><td>"+h.getAddress()+"</td><td>"+h.getAbout()+"</td><td>"+h.getContact_No()+"</td>"
                           + "<td>"+h.getPrice()+"</td><td>");
                   %>
                   
                   
                   <a href="delete?id=<%=h.getHotelid()%>"><i class="fa fa-trash" aria-hidden="true"></i></a>
                   <%
                   out.print("</td></tr>");
             }
            out.print("</table>");
         %>
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    

