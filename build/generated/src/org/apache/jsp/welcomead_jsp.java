package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.HotelPage;
import model.Hotel;

public final class welcomead_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
          //scriplet tag to add java code in jsp
    response.setHeader("Pragma", "no-store,no-cache");
    response.setHeader("Cache-Control", "no-store,no-cache");
    if (request.getSession(false) == null) {
        response.sendRedirect("admin.jsp");
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <style>\r\n");
      out.write("            *{\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t\tpadding:0;\r\n");
      out.write("\t\t}\r\n");
      out.write("            form input{\r\n");
      out.write("                display:block;\r\n");
      out.write("            }\r\n");
      out.write("            form textarea{\r\n");
      out.write("                display:block;\r\n");
      out.write("            }\r\n");
      out.write("            form{\r\n");
      out.write("\t\tpadding: 50px;\r\n");
      out.write("                border: 3px solid #f1f1f1; width: 40%;margin-right: auto; margin-left: auto;\r\n");
      out.write("            }\r\n");
      out.write("            label{\r\n");
      out.write("                margin-top: 5px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 style=\"text-align: center; background-color: #A28089;\" class=\"mb-0\">Welcome ");
      out.print( request.getSession(false).getAttribute("adname"));
      out.write("</h1> \r\n");
      out.write("        <!--<input type=\"button\" value=\"Create Hotel\">-->\r\n");
      out.write("<!--        <input type=\"button\" value=\"Edit Hotel\">\r\n");
      out.write("        <input type=\"button\" value=\"Remove Hotel\">-->\r\n");
      out.write("        ");
 List<Hotel> list=HotelPage.getRecords();
             out.print("<h1>Hotel Details</h1>");
             out.print("<table border='1' width='70%'>");
             out.print("<tr><th>Hid</th><th>HName</th><th>Rating</th><th>Address</th><th>About</th><th>Contact No.</th><th>Price</th>");
             for(Hotel h:list){
                   out.print("<tr><td>"+h.getHotelid()+"</td><td>"+h.getHotelname()+"</td><td>"+h.getRating()+"</td><td>"+h.getAddress()+"</td><td>"+h.getAbout()+"</td><td>"+h.getContact_No()+"</td><td>"+h.getPrice()+"</td><td>");
             
             }
            out.print("</table>");
         
      out.write("\r\n");
      out.write("        <a href=\"logoutad\">Logout</a><br>\r\n");
      out.write("        <form action=\"create\" method=\"post\" class=\"ml-auto\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <label for=\"hname\">Hotel name:</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Hotel Name\" name=\"hname\" id=\"hname\" autocomplete=\"off\" required>\r\n");
      out.write("            <label for=\"rate\">Ratings:</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Ratings\" name=\"rate\" id=\"rate\" autocomplete=\"off\" required>\r\n");
      out.write("            <label for=\"address\">Address:</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Address\" name=\"addr\" id=\"address\" autocomplete=\"off\" required>\r\n");
      out.write("            <label for=\"about\">About:</label>\r\n");
      out.write("            <textarea id=\"about\" name=\"abt\" rows=\"5\" class=\"form-control\"></textarea>\r\n");
      out.write("            <label for=\"mbno\">Contact details:</label>\r\n");
      out.write("            <input type=\"tel\" class=\"form-control\" placeholder=\"Enter Contact no.\" name=\"mbno\" id=\"mbno\" autocomplete=\"off\" pattern=\"[0-9]{10,11}\" required>\r\n");
      out.write("            <label for=\"img\">Add image:</label>\r\n");
      out.write("            <input type=\"file\" class=\"form-control\" name=\"img\" id=\"img\" autocomplete=\"off\" accept=\"image/*\" required>\r\n");
      out.write("            <label for=\"price\">Price:</label>\r\n");
      out.write("            <input type=\"number\" class=\"form-control\" name=\"price\" id=\"price\" min=\"100\" autocomplete=\"off\"  required>\r\n");
      out.write("            <input type=\"submit\" class=\"form-control mt-3 btn btn-success\" value=\"Submit\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <!-- jQuery library -->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Popper JS -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <!-- Latest compiled JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
