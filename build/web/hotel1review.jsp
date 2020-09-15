<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>


<%
String first_name= request.getParameter("myContent");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","papa");
Statement st=conn.createStatement();
     PreparedStatement pstatement = null;

 String queryString = "INSERT INTO comments(comment) VALUES (?)";
pstatement = conn.prepareStatement(queryString);
pstatement.setString(1,first_name);             
pstatement.executeUpdate();  
response.sendRedirect("hotel.jsp");
  }
catch(SQLException e)
{
out.println(e);
}


%>