<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%          //scriplet tag to add java code in jsp
    response.setHeader("Pragma", "no-store,no-cache");
    response.setHeader("Cache-Control", "no-store,no-cache");
    if (request.getSession(false) == null) {
        response.sendRedirect("index.html");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div>      
            <h1 style="text-align: center; background-color: #A28089;" class="mb-0">Welcome <%= request.getSession(false).getAttribute("uname")%></h1> 
        </div>     
        <%@include file="index.html"%>    
    </body>
</html>
