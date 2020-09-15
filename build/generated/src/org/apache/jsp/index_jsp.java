package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Bookings;
import java.util.List;
import model.Hotel;
import model.Database;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Hotels</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- navbar starts -->\n");
      out.write("<section id=\"nav-bar\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("          <i class=\"fa fa-h-square mr-1\" aria-hidden=\"true\" style=\"font-size: 30px; color: red;\"></i>\n");
      out.write("\t\t  <a class=\"navbar-brand text-danger\" href=\"file:///E:/bootstrap%204/index.html#\">HOTELS.com</a>\n");
      out.write("\t\t  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> \n");
      out.write("\t\t    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t  </button>\n");
      out.write("\n");
      out.write("\t\t  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t\t      <li class=\"nav-item\">\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("\t\t      </li>\n");
      out.write("\t\t      <li class=\"nav-item\">\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#about_i\">About</a>\n");
      out.write("\t\t      </li>\n");
      out.write("\t\t      <li class=\"nav-item\">\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#contact_us\">Contact Us</a>\n");
      out.write("\t\t      </li>\n");
      out.write("\t\t    </ul>\n");
      out.write("\t\t    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\t\t      <input class=\"form-control mr-sm-2 bg-dark text-white\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("\t\t      <button class=\"btn btn-outline-success my-2 my-sm-0 mr-2\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("\t\t    <ul class=\"navbar-nav navbar-right\">\n");
      out.write("\t\t      <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModalS\"><i class=\"fa fa-user mr-1\" aria-hidden=\"true\"></i>Sign Up</a></li>\n");
      out.write("                    \n");
      out.write("                                ");
 if( session.getAttribute("mail") != null) { 
      out.write("\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                       \n");
      out.write("                       <div class=\"btn-group\">\n");
      out.write("             \t\t\t<button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                \t\t\t");
      out.print( session.getAttribute("uname") );
      out.write("\n");
      out.write("              \t\t\t</button>\n");
      out.write("<!--              \t\t\t<div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#bookModel\">Bookings</a>\n");
      out.write("                \t\t    <a class=\"dropdown-item\" href=\"logout\">Logout</a>\n");
      out.write("                \t\t\t\n");
      out.write("              \t\t        </div>-->\n");
      out.write("                      </div>\n");
      out.write("                     </li>\n");
      out.write("                    \n");
      out.write("                      ");
 } else{
      out.write("\n");
      out.write("\t\t      <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModalL\"><i class=\"fa fa-sign-in mr-1\" aria-hidden=\"true\"></i>Login</a></li>\n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("\t\t    </ul>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</nav>\n");
      out.write("</section>\n");
      out.write("<!--model for bookings-->\n");
      out.write("<!--<div class=\"modal\" id=\"bookModel\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("\t\t Modal Header \n");
      out.write("\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t<h4 class=\"modal-title\" style=\"font-size: 30px;\">Bookings</h4>\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t Modal body \n");
      out.write("\t\t<div class=\"modal-body\">\n");
      out.write("         <table  class=\"table table-hover\">\n");
      out.write("\t\t\t  <thead>\n");
      out.write("\t\t\t    <tr>\n");
      out.write("\t\t\t      <th scope=\"col\">Hotel Name</th>\n");
      out.write("                              <th scope=\"col\">Check_in</th>\n");
      out.write("                              <th scope=\"col\">Check_out</th>\n");
      out.write("                              <th scope=\"col\">Contact No.</th>\n");
      out.write("                              <th scope=\"col\">Payment</th>\n");
      out.write("\t\t\t    </tr>\n");
      out.write("\t\t\t  </thead>\n");
      out.write("\t\t\t  <tbody>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t     Modal footer \n");
      out.write("\t\t\t    <div class=\"modal-footer\">\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("</div>-->\n");
      out.write("<!--model for bookings-->\n");
      out.write("<!-- The Modal for login-->\n");
      out.write("<div class=\"modal\" id=\"myModalL\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("\t\t<!-- Modal Header -->\n");
      out.write("\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t<h4 class=\"modal-title\" style=\"font-size: 30px;\">Login</h4>\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Modal body -->\n");
      out.write("\t\t<div class=\"modal-body\">\n");
      out.write("                        <form action=\"login\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email address:</label>\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" placeholder=\"Enter email\" name=\"email\" id=\"email\" autocomplete=\"off\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"pwd\">Password:</label>\n");
      out.write("\t\t\t\t    <input type=\"password\" class=\"form-control\" placeholder=\"Enter password\" name=\"pwd\" id=\"pwd\" autocomplete=\"off\" required>\n");
      out.write("\t   \t\t    </div>\n");
      out.write("\t\t   \t    <div class=\"form-group form-check\">\n");
      out.write("\t\t\t\t    <label class=\"form-check-label\">\n");
      out.write("\t\t\t        <input class=\"form-check-input\" type=\"checkbox\"> Remember me\n");
      out.write("\t\t\t\t    </label>\n");
      out.write("\t  \t\t    </div>\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-success\" value=\"Sign-in\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t    <!-- Modal footer -->\n");
      out.write("\t\t\t    <div class=\"modal-footer\">\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("<!-- The Modal for Signup-->\n");
      out.write("<div class=\"modal\" id=\"myModalS\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("\t    <!-- Modal Header -->\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("\t        <h4 class=\"modal-title\" style=\"font-size: 30px;\">SignUp</h4>\n");
      out.write("\t\t    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t    </div>\n");
      out.write("\n");
      out.write("\t    <!-- Modal body -->\n");
      out.write("\t    <div class=\"modal-body\">\n");
      out.write("                <form action=\"signup\" method=\"post\">\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\">Name:</label>\n");
      out.write("\t\t\t    <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Enter your name\" >\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"email\">Email address:</label>\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Enter email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" title=\"Format is characters@characters.domain\" required>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"phone\">Mobile no:</label>\n");
      out.write("                            <input type=\"tel\" id=\"phone\" name=\"phone\" class=\"form-control\" placeholder=\"Enter Mobile No.\" pattern=\"[0-9]{10,11}\" required>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"pwd\">Password:</label>\n");
      out.write("\t\t\t    <input type=\"password\" id=\"pwd\" name=\"pwd\" class=\"form-control\" placeholder=\"Enter password\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t\t<div class=\"form-group form-check\">\n");
      out.write("\t\t\t\t<label class=\"form-check-label\">\n");
      out.write("\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\"> Remember me\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Modal footer -->\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t    <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- navbar ends -->\n");
      out.write("\n");
      out.write("<!-- carousel starts -->\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("  <!-- The slideshow -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"images/carousel1.jpg\" alt=\"Hotel1\"> \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"images/carousel2.jpg\" alt=\"Hotel2\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"images/carousel3.jpg\" alt=\"Hotel3\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- carousel ends -->\n");
      out.write("\n");
      out.write("<!-- hotels with images starts -->\n");
      out.write("<section>\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("        <h3 class=\"my-5 text-secondary\">These top hotels are just a click away!</h3>\n");
      out.write("        <div class=\"row text-center\">  \n");
      out.write("        ");
List<Hotel> list=Database.getHotelRecords();
            for(Hotel h:list){
                int hid=Integer.parseInt(h.getHotelid());    
                String iname=Database.getImageName(hid);
            
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px;\">\n");
      out.write("                            \n");
      out.write("                            <img class=\"card-img-top\" src=\"images/");
      out.print(iname);
      out.write("\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("         \t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t    <h4 class=\"card-title\">");
      out.print(h.getHotelname());
      out.write("</h4>\n");
      out.write("\t\t\t\t    <p class=\"card-text\">");
      out.print(h.getRating());
      out.write(" <br> ");
      out.print(h.getAddress());
      out.write("</p>\n");
      out.write("                                    \n");
      out.write("\t\t\t            <a href=\"hotel1.jsp?page=");
      out.print(hid);
      out.write("\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("         </div>\n");
      out.write("<!--        <div class=\"row text-center\">\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px;\">\n");
      out.write("                            <img class=\"card-img-top\" src=\"images/1st hotel/img1.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">THE UMED HOTEL</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> \tOpp. Umaid kanya school, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel1.jsp\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/2nd hotel/img21.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">Jodhpur Heritage Haveli </h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">1-star hotel <br>Brahmin Ki Gali Umaid Chowk, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel2.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/3rd hotel/img31.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 18825 Hotel Akshey</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> Rai Ka Bagh, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel3.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/4th hotel/img41.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 10422 Hotel Udai Garh Palace</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> \tNear Shri Ram Hospital, Prem Nagar, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel4.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/5th hotel/img51.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">Capital O 11973 Badri Palace</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> \tOpposite Filter House, Chopasani Rd, Chopasni Housing Board, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel5.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/6th hotel/img61.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 23571 Jai Bhawani</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> Near DPS school, Pal Chopasani Bypass Rd, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel6.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/7th hotel/img71.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">Hotel Omni Plaza</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">4-star hotel <br> \tNear Rajasthan Patrika Bhawan, Maan Ji Ka Hattha, Paota, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel7.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/8th hotel/img81.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">Capital O 1623 Hotel JS Regency</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> \tNear ST Paul School, Jaipur Bypass Road, Jhalamand, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel8.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/9th hotel/img91.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 1195 Hotel Suncity International</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> \tAirport Rd, Panch Batti Cir, Jagatpura, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel9.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/10th hotel/img101.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 16577 Raj Shree Guest House</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">2-star hotel <br> Hotel Raj shree guest house, 263, B Rd, above Raj Shree Handloom, Laxmi Nagar, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel10.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/11th hotel/img111.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 10368 Om Heritage</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">2-star hotel <br> \t 35, Juni Bagar Chowk, Near Ladnu Haveli, Gulab Sagar, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel11.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/12th hotel/img121.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 15984 Crown Plaza Heritage</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> Crown Plaza Hritage, 260, 1st Polo Rd, near Astha Hospital, Bhadwasiya, Paota, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel12.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/13th hotel/img131.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">Capital O 30351 S B Excellency</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">2-star hotel <br> Near AIIMS, 1A, M.I.A. 1st Phase, Basni, Basni, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel13.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/14th hotel/img141.jpeg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">Poonam Guest House</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br> \t4 Kuchaman House Near Panch Batti Circle, Air Force Road, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel14.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        \t<div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("        \t\t<div class=\"card\" style=\"width:400px\">\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"images/15th hotel/img151.jpg\" style=\"height: 200px;\" alt=\"image\">\n");
      out.write("\t\t\t\t\t  <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t    <h4 class=\"card-title\">OYO 27876 Hotel Preminn</h4>\n");
      out.write("\t\t\t\t\t    <p class=\"card-text\">3-star hotel <br>  Plot no -5 Hotel prem inn near mangal deep building, Pal Rd, Jodhpur</p>\n");
      out.write("\t\t\t\t\t    <a href=\"hotel15.html\" class=\"btn btn-primary\">Visit</a>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("        \t</div>\n");
      out.write("        </div>-->\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!-- hotels with images ends -->\n");
      out.write("<!--about us starts-->\n");
      out.write("<section id=\"about_i\" class=\"mt-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center text-white mb-3\" style=\"background-color: #C38D9E;\">About Us</h2>\n");
      out.write("        <p>\n");
      out.write("      Our mission at Hotels.com is to provide the best hotels at an affordable price to the client through its network. We want to provide a true discount on the true price of the hotels. The interactive and advance mobile app will make your stay pleasant and convenient.\n");
      out.write("      Have a nice stay or better to say have a \"Hotels.com\" stay.<br><br>\n");
      out.write("\n");
      out.write("      We are Hotels.com an OTA (Online Travel Agent) and we deal with hotels by offering the best deal to join with us as a partner. We are the online partner of hotels and we collect the information about hotel service providers & make the provider our partner and then sell the provider's service under our guidelines.<br><br>\n");
      out.write("\n");
      out.write("      Our goal is to \"stay real, stay loyal and a happy stay with Hotels.com stay\".<br><br>\n");
      out.write("\n");
      out.write("      Every time we try to make a healthy or homely environment in your hotel stay. We are not only providing you a stay; we provide you with are markable feeling. We believe everyone deserves the best it's an idea of experiencing new places in real-time. Your exiting travel starts with Hotels.com stay.<br><br>\n");
      out.write("    </p>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!--about us ends-->\n");
      out.write("\n");
      out.write("<!--contact us starts #FA8072-->\n");
      out.write("<section id=\"contact_us\">\n");
      out.write("    <div style=\"background-color: black;\" class=\"text-white text-center\">\n");
      out.write("        <h2>Contact Us</h2>\n");
      out.write("        <i class=\"fa fa-phone mr-3\" aria-hidden=\"true\"></i>Mobile No. 7821032382\n");
      out.write("        <i class=\"fa fa-envelope mr-3 ml-5\" aria-hidden=\"true\"></i>Email: kaurnavneet71242@gmail.com\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--contact us ends-->\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<!-- Popper JS -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/smooth-scroll.js\">\n");
      out.write("    var scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--  <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\t\t      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("\t\t      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("</form> -->");
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
