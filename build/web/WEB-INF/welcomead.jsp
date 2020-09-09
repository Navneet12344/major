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
        <title></title>
    </head>
    <body>
        <h1 style="text-align: center; background-color: #A28089;" class="mb-0">Welcome <%= request.getSession(false).getAttribute("adname")%></h1> 
        
    </body>
</html>
