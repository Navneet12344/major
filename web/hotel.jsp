<%-- 
    Document   : hotel.jsp
    Created on : Sep 14, 2020, 1:15:01 AM
    Author     : shrut
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*, com.*" %>

<!DOCTYPE html>
<html>
    <head>
       
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
         
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
$("#butto").next().hide();

  
    $("#butto").click(function(e){$(e.target).next().toggle();});
 
});
</script>
</head>
<body>

<button type="button" id="butto"class="btn btn-info" style="margin-left:1200px;margin-top:30px;">Comments</button>
<div id="myform" style="margin-left:1047px;">
<form name="myForm" id="myForm" action="hotel1review.jsp">

<textarea name="myContent" rows="10" cols="30"></textarea>
<input type="submit" value="Add Review" >
</form>

</div>

<%
String first_name= request.getParameter("myContent");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","papa");
Statement st=conn.createStatement();
     PreparedStatement pstatement = null;

     
   ResultSet rs=st.executeQuery("select * from comments");
while(rs.next())
{
String s1=rs.getString("comment"); out.println(s1);
}}
catch(SQLException e)
{
out.println(e);
}
%>
    </body>
</html>
