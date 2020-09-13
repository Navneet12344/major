<%@page import="model.Hotel"%>
<%@page import="model.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center;">
        <% System.out.println("hiiiiiii=000000s");
          int id=Integer.parseInt(session.getAttribute("hotelid").toString());
            Hotel h=Database.getHotelFromId(id);
        System.out.println("hiiiiiii");%>
        <h1 style="color: #007bff; font-size: 40px;">Hotel Bill</h1>
        <h4>Name : <%=session.getAttribute("uname")%></h4>
        <h4>Hotel Booked : <%=h.getHotelname()%></h4>
        <h4>Check_in : <%=session.getAttribute("cin")%></h4>
        <h4>Check_out : <%=session.getAttribute("cout")%></h4>
        <h4>Paid Amount : <%=session.getAttribute("total")%></h4>
    </body>
</html>
