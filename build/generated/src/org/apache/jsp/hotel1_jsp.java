package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hotel1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"nav-bar\">\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-light navbar-light\">\r\n");
      out.write("\t<i class=\"fa fa-h-square mr-1\" aria-hidden=\"true\" style=\"font-size: 30px; color: red;\"></i>\r\n");
      out.write("\t<a class=\"navbar-brand text-danger\" href=\"index.html\">HOTELS.com</a>\r\n");
      out.write("\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> \r\n");
      out.write("\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t</button>\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t    <li class=\"nav-item\">\r\n");
      out.write("\t      <a class=\"nav-link\" href=\"#\">Overview</a>\r\n");
      out.write("\t    </li>\r\n");
      out.write("\t    <li class=\"nav-item\">\r\n");
      out.write("\t      <a class=\"nav-link\" href=\"#location\">Location</a>\r\n");
      out.write("\t    </li>\r\n");
      out.write("\t    <li class=\"nav-item\">\r\n");
      out.write("\t      <a class=\"nav-link\" href=\"#about\">About</a>\r\n");
      out.write("\t    </li>\r\n");
      out.write("\t    <li class=\"nav-item\">\r\n");
      out.write("\t      <a class=\"nav-link\" href=\"#photos\">Photos</a>\r\n");
      out.write("\t    </li>\r\n");
      out.write("\t    <li class=\"nav-item\">\r\n");
      out.write("\t      <a class=\"nav-link\" href=\"#price\">Price</a>\r\n");
      out.write("\t    </li>\r\n");
      out.write("\t  </ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- navbar1 ends -->\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("  <!-- Indicators -->\r\n");
      out.write("  <ul class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("\r\n");
      out.write("  <!-- The slideshow -->\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img1.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img2.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img3.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img4.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img5.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img6.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img7.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img8.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t    <img src=\"images/1st hotel/img9.jpg\" alt=\"Hotel1\">\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Left and right controls -->\r\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- corousel ends -->\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"card mx-auto mt-5\">\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<h3 class=\"card-title\" style=\"color: #ff0080;\">THE UMED HOTEL <a href=\"#\" class=\"btn btn-primary float-right\">1,469</a></h3> <br>\r\n");
      out.write("                <p class=\"card-text\"> 3-star hotel<br>\r\n");
      out.write("                Near Anand Cinema, Station Rd, opp. Umaid kanya school, Jodhpur, Rajasthan 342001  0291 265 4093<br><br>\r\n");
      out.write("                <a href=\"#price\" class=\"btn btn-primary\">Book Now</a>\r\n");
      out.write("                </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-------------- about section------------->\r\n");
      out.write("<section id=\"about\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"card mx-auto mt-5 mb-5\">\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                \t<div class=\"col-lg-8 col-md-8 col-12\">\r\n");
      out.write("                \t\t<h4 class=\"card-title\">About this hotel</h4>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">This informal hotel in an area with shops is a 7-minute walk from the Jodhpur train station, 2 km from the 15th-century Mehrangarh Fort and 4 km from the stately 1943 Umaid Bhawan Palace.<span id=\"dots\">...</span><span id=\"more\">The warm, unassuming rooms and suites with simple furnishings have flat-screen TVs, and tea and coffeemaking facilities. Room service is available.<br><br>Limited parking is included. Amenities consist of a casual restaurant, and a rooftop terrace offering city views.<br><br>\r\n");
      out.write("\t\t\t\t\t\tCheck-in time: 11:00 AM<br>\r\n");
      out.write("\t\t\t\t\t\tCheck-out time: 11:00 AM</span></p>\r\n");
      out.write("                        <button id=\"button\" onclick=\"read()\">Read More</button>\r\n");
      out.write("                \t</div>\r\n");
      out.write("                \t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("                \t\t<h6 class=\"card-title mt-5\">Address and contact information</h6>\r\n");
      out.write("                \t\t<p class=\"card-text\">\r\n");
      out.write("                \t\t\t<i class=\"fa fa-map-marker mr-3\" aria-hidden=\"true\"></i>Near Anand Cinema, Station Rd, opp. Umaid kanya school, Jodhpur, Rajasthan 342001<br><br>\r\n");
      out.write("                \t\t\t<i class=\"fa fa-phone mr-3\" aria-hidden=\"true\"></i>0291 265 4093\r\n");
      out.write("                \r\n");
      out.write("                \t\t</p>\r\n");
      out.write("                \t</div>\r\n");
      out.write("                </div>\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"card mx-auto mt-5 mb-5\">\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<h3 class=\"card-title\">Amenities</h3><hr>\r\n");
      out.write("\t\t\t\t<h5 class=\"card-title mt-3\">Popular amenities</h5>\r\n");
      out.write("\t\t\t\t<p class=\"card-text\">\r\n");
      out.write("                \t<i class=\"fa fa-wifi mr-3\" aria-hidden=\"true\"></i>Wifi<span class=\"badge badge-secondary ml-3 mr-5\">free</span>\r\n");
      out.write("                \t<i class=\"fa fa-car mr-3\" aria-hidden=\"true\"></i>Parking<span class=\"badge badge-secondary ml-3 mr-5\">free</span>\r\n");
      out.write("                \t<i class=\"fa fa-snowflake-o mr-3\" aria-hidden=\"true\"></i>A.C.<span class=\"badge badge-secondary ml-3 mr-5\">free</span>\r\n");
      out.write("                \t<i class=\"fa fa-cutlery mr-3\" aria-hidden=\"true\"></i>Breakfast<span class=\"badge badge-secondary ml-3 mr-5\">extra charge</span><hr>\r\n");
      out.write("                </p>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                \t<div class=\"col-lg-6 col-md-6 col-12\">\r\n");
      out.write("                \t\t<h5 class=\"card-title\"><i class=\"fa fa-wifi mr-3 mt-3\" aria-hidden=\"true\"></i>Internet</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Wifi<span class=\"badge badge-secondary ml-2\">free</span>\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-money mr-3 mt-3\" aria-hidden=\"true\"></i>Policies and Payments</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Smoke-free Property\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-child mr-3 mt-3\" aria-hidden=\"true\"></i>Children</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Kid-Friendly\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-car mr-3 mt-3\" aria-hidden=\"true\"></i>Parking and Transportation</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Parking<span class=\"badge badge-secondary ml-2\">free</span><br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Airport Shuttle\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-bed mr-3 mt-3\" aria-hidden=\"true\"></i>Rooms</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Air-conditioning<br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tKitchen in some rooms\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("                \t</div>\r\n");
      out.write("                \t<div class=\"col-lg-6 col-md-6 col-12\">\r\n");
      out.write("                        <h5 class=\"card-title\"><i class=\"fa fa-cutlery mr-3 mt-3\" aria-hidden=\"true\"></i>Food and Drink</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Restaurant<br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tRoom Service<br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tBreakfast<span class=\"badge badge-secondary ml-3 mr-5\">free</span><br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tBreakfast-buffet\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-bell mr-3 mt-3\" aria-hidden=\"true\"></i>Services</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Front-desk<br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tFull-service laundry<span class=\"badge badge-secondary ml-3 mr-5\">24 hour</span><br>\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-tint mr-3 mt-3\" aria-hidden=\"true\"></i>Pools</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-ban ml-5 mr-3\" aria-hidden=\"true\"></i>No-pools<br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-ban ml-5 mr-3\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tNo hot tub<br>\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t                <h5 class=\"card-title\"><i class=\"fa fa-expand mr-3 mt-3\" aria-hidden=\"true\"></i>Wellness</h5><hr>\r\n");
      out.write("\t\t                <p class=\"card-text\">\r\n");
      out.write("\t\t                \t<i class=\"fa fa-check ml-5 mr-3 text-success\" aria-hidden=\"true\"></i>Fitness center<br>\r\n");
      out.write("\t\t                \t<i class=\"fa fa-ban ml-5 mr-3\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t                \tNo-spa<br>\r\n");
      out.write("\t\t                </p>\r\n");
      out.write("                \t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!--------about section ends-------->\r\n");
      out.write("\r\n");
      out.write("<!-- location section -->\r\n");
      out.write("<p id=\"location\">\r\n");
      out.write("\t<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3577.2117059317948!2d73.02211681450713!3d26.287236093064692!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39418b89a026c227%3A0x2b23d4ab9d7efc7b!2sTHE%20UMED%20HOTEL!5e0!3m2!1sen!2sin!4v1597132510280!5m2!1sen!2sin\" width=\"100%\" height=\"700\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\r\n");
      out.write("</p>\r\n");
      out.write("<!-- location section ends -->\r\n");
      out.write("\r\n");
      out.write("<!-- photos -->\r\n");
      out.write("<section id=\"photos\">\r\n");
      out.write("  <div class=\"container\" id=\"image\">\r\n");
      out.write("\t<div class=\"card mx-auto mt-5\">\r\n");
      out.write("\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t<h3>Gallery</h3><hr class=\"mx-auto\" style=\"width: 15%;\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img2.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img3.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img4.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img5.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img6.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img7.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img8.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img9.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1st hotel/img10.jpg\" alt=\"image\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- photos end -->\r\n");
      out.write("\r\n");
      out.write("<!-- price start -->\r\n");
      out.write("<section id=\"price\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t  <div class=\"card mt-5 mb-5\">\r\n");
      out.write("\t\t<div class=\"card-body mx-auto\">\r\n");
      out.write("                    <h3 style=\"text-align: center; color: brown;\">Prices</h3><hr class=\"mx-auto\" style=\"width: 15%;\">\r\n");
      out.write("\t\t    <label for=\"Check-in\">Check-in:</label>\r\n");
      out.write("                    <input type=\"date\" class=\"mr-5\" id=\"Check-in\" min=\"2018-02-01\" name=\"Check-in\">\r\n");
      out.write("\t\t    <label for=\"Check-out\">Check-out:</label>\r\n");
      out.write("\t\t    <input type=\"date\" id=\"Check-out\" name=\"Check-out\">\r\n");
      out.write("                    <input type=\"hidden\" value=\"The Umed Hotel\" id=\"hn\" name=\"hname\">\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-success\" value=\"Check Price\" onclick=\"showPrice()\">\r\n");
      out.write("                    <p class=\"mt-3\">Total price :<span id=\"addcontent\"></span></p>\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" value=\"Make Payment\">\r\n");
      out.write("                </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("   </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- price end -->\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<p class=\"p-3 mb-0 fixed-bottom\" style=\"background-color:#ececec; font-weight: bold;\">THE UMED HOTEL<a href=\"#\" class=\"btn btn-primary float-right\">1,469</a></p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- for scrolling -->\r\n");
      out.write("<script src=\"js/smooth-scroll.js\"></script>\r\n");
      out.write("<script src=\"js/common.js\"></script>\r\n");
      out.write("</body>\r\n");
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
