package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hospital.vo.UserVO;
import com.hospital.vo.DoctorVO;
import com.hospital.vo.AppointmentVO;
import java.util.Date;

public final class hospital_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\t<title> </title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("   \r\n");
      out.write("   <style>\r\n");
      out.write("  /* Make the image fully responsive */\r\n");
      out.write("  .carousel-inner img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  .container img{\r\n");
      out.write("  \twidth: 80%;\r\n");
      out.write("  \theight: 70%;\r\n");
      out.write("  \tborder-radius: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .row{\r\n");
      out.write("  \theight:250px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg\">\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("  <a class=\"navbar-brand text-white\">HOSPITALS</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"fas fa-user\"></span> Sign Up</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
 if( session.getAttribute("mobile") != null) { 
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"btn-group\">\r\n");
      out.write("  \t\t\t<button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("    \t\t\t");
      out.print( session.getAttribute("name") );
      out.write("\r\n");
      out.write("  \t\t\t</button>\r\n");
      out.write("  \t\t\t<div class=\"dropdown-menu\">\r\n");
      out.write("    \t\t\t<a class=\"dropdown-item\" href=\"UserLogout\">Logout</a>\r\n");
      out.write("    \t\t\t<a class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#appointmentModal\">Appointments</a>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
 } else {
      out.write("\r\n");
      out.write("       <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#loginModal\"><span class=\"fas fa-user\"></span> Login</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("  </ul>\r\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("      \r\n");
      out.write("        <!-- Modal Header -->\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h4 class=\"modal-title\">Sign Up</h4>\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Modal body -->\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <form action=\"UserSignup\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("     \t\t <label for=\"name\">Your Name *</label>\r\n");
      out.write("   \t\t\t <input type=\"text\" class=\"form-control\" placeholder=\"Enter name\" id=\"name\" name=\"name\" autocomplete=\"off\">\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write(" \t\t\t<div class=\"form-group\">\r\n");
      out.write("   \t\t\t\t <label for=\"number\">Your Mobile No. *</label>\r\n");
      out.write("   \t\t\t\t <input type=\"number\" class=\"form-control\" placeholder=\"Enter your number\" id=\"mobile\" name=\"mobile\" autocomplete=\"off\">\r\n");
      out.write(" \t\t\t </div>\r\n");
      out.write(" \t\t\t \r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t\t <div class=\"form-group\">\r\n");
      out.write("   \t\t\t\t <label for=\"password\">Your Password *</label>\r\n");
      out.write("   \t\t\t\t <input type=\"password\" class=\"form-control\" placeholder=\"Enter your password\" id=\"password\" name=\"password\" autocomplete=\"off\">\r\n");
      out.write(" \t\t\t </div>\r\n");
      out.write(" \t\t\t \r\n");
      out.write(" \t\t\t \t <div class=\"form-group\">\r\n");
      out.write("   \t\t\t\t <label for=\"email\">Your Email </label>\r\n");
      out.write("   \t\t\t\t <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\" id=\"email\" name=\"email\" autocomplete=\"off\">\r\n");
      out.write(" \t\t\t </div>\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \r\n");
      out.write(" \t\t \t<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"modal fade\" id=\"loginModal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("      \r\n");
      out.write("        <!-- Modal Header -->\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h4 class=\"modal-title\">Login</h4>\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Modal body -->\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <form action=\"UserLogin\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("     \t\t <label for=\"mobile\">Mobile Number *</label>\r\n");
      out.write("   \t\t\t <input type=\"number\" class=\"form-control\" placeholder=\"Mobile Name\" id=\"mobile\" name=\"mobile\" autocomplete=\"off\">\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write(" \t\t\t\t \r\n");
      out.write("  \t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t  <label for=\"password\">Password</label>\r\n");
      out.write("   \t\t\t <input type=\"password\" class=\"form-control\" placeholder=\"Password\" id=\"password\" name=\"password\" autocomplete=\"off\">\r\n");
      out.write(" \t\t\t </div>\r\n");
      out.write("  \r\n");
      out.write(" \t\t \t<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"modal fade\" id=\"appointmentModal\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("      \r\n");
      out.write("        <!-- Modal Header -->\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h4 class=\"modal-title\">Appointments</h4>\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Modal body -->\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("         <table  class=\"table table-hover\">\r\n");
      out.write("\t\t\t  <thead>\r\n");
      out.write("\t\t\t  <tr><th colspan=\"2\"> Upcoming Appointments </th></tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Doctor</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Appointment Date</th>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t  </thead>\r\n");
      out.write("\t\t\t  <tbody>\r\n");
      out.write("\t\t\t");
 
			if(session.getAttribute("user")!= null && ((UserVO)session.getAttribute("user")).getAppointmentList()!= null) {
			for(AppointmentVO appointment : ((UserVO)session.getAttribute("user")).getAppointmentList()) { 
				
				if(appointment.getDate().compareTo(new Date()) >=0 ) {
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t      <td>");
      out.print( appointment.getDoctor().getDoctorName() );
      out.write("</td>\r\n");
      out.write("\t\t\t      <td>");
      out.print( appointment.getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
 }}} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<Button type=\"button\" class=\"btn btn-info\" data-toggle=\"collapse\"  data-target=\"#demo\"> Previous Appointments </button>\r\n");
      out.write("\t\t\t<table class=\"table table-hover collapse in\" id=\"demo\" >\r\n");
      out.write("\t\t\t  <thead>\r\n");
      out.write("\t\t\t  <tr><th> Previous Appointments </th></tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Doctor</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Appointment Date</th>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t  </thead>\r\n");
      out.write("\t\t\t  <tbody>\r\n");
      out.write("\t\t\t");
 
			if(session.getAttribute("user")!= null && ((UserVO)session.getAttribute("user")).getAppointmentList()!= null) {
			for(AppointmentVO appointment : ((UserVO)session.getAttribute("user")).getAppointmentList()) { 
				
				if(appointment.getDate().compareTo(new Date()) < 0) {
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t      <td>");
      out.print( appointment.getDoctor().getDoctorName() );
      out.write("</td>\r\n");
      out.write("\t\t\t      <td>");
      out.print( appointment.getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
 }}} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("      <img src=\"images/hospital/1.jpeg\"  width=\"1100\" height=\"150\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        \r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"images/hospital/2.jpeg\"  width=\"1100\" height=\"150\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        \r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"images/hospital/3.jpeg\"  width=\"1100\" height=\"150\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("       \r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"images/hospital/5.jpeg\"  width=\"1100\" height=\"150\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("       \r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"images/hospital/6.jpeg\"  width=\"1100\" height=\"150\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("       \r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t<div class=\"container\"> \r\n");
      out.write("\t\t\t<h4 class=\"text-muted pt-2\">Hospitals in Jodhpur</h4> \r\n");
      out.write("\t\t\t<hr class=\"w-10\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/hospital/yash.jpg\" class=\"img-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<h2 >Yash Aman Hospital</h2>\r\n");
      out.write("\t\t\t\t\t<h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("\t\t\t\t</svg> +(91)-9152624707</h4>\r\n");
      out.write("\t\t\t\t\t<h5> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-forward\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z\"/>\r\n");
      out.write("\t\t\t\t</svg> AVAILABLE NOW</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" onClick=\"parent.location='detail.jsp'\" value=\"In Detail\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr class=\"w-5 pt-3\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/hospital/m.jpg\" class=\"img-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<h2 >Marwar Hospital </h2>\r\n");
      out.write("\t\t\t\t\t<h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("\t\t\t\t</svg> +(91) -9772844440</h4>\r\n");
      out.write("\t\t\t\t\t<h5> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-forward\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z\"/>\r\n");
      out.write("\t\t\t\t</svg> AVAILABLE NOW</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" onClick=\"parent.location='detail1.jsp'\" value=\"In Detail\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr class=\"w-5 pt-3\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/hospital/g.jpg\" class=\"img-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<h2 >Goyal Hospital & Research Center Pvt Ltd </h2>\r\n");
      out.write("\t\t\t\t\t<h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("\t\t\t\t</svg> +91-291-2432144</h4>\r\n");
      out.write("\t\t\t\t\t<h5> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-forward\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z\"/>\r\n");
      out.write("\t\t\t\t</svg> AVAILABLE NOW</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" onClick=\"parent.location='detail2.jsp'\" value=\"In Detail\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr class=\"w-5 pt-3\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/hospital/dn.jpg\" class=\"img-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<h2 >Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital </h2>\r\n");
      out.write("\t\t\t\t\t<h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("\t\t\t\t</svg> +(91)-9152491758</h4>\r\n");
      out.write("\t\t\t\t\t<h5> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-forward\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z\"/>\r\n");
      out.write("\t\t\t\t</svg> AVAILABLE NOW</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" onClick=\"parent.location='detail3.jsp'\" value=\"In Detail\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr class=\"w-5 pt-3\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/hospital/vn.jpg\" class=\"img-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<h2 >Vinayaka Hospital</h2>\r\n");
      out.write("\t\t\t\t\t<h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("\t\t\t\t</svg> +(91)-9152598987</h4>\r\n");
      out.write("\t\t\t\t\t<h5> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-forward\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z\"/>\r\n");
      out.write("\t\t\t\t</svg> AVAILABLE NOW</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" onClick=\"parent.location='detail4.jsp'\" value=\"In Detail\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr class=\"w-5 pt-3\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/hospital/mdm.jpg\" class=\"img-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12\">\r\n");
      out.write("\t\t\t\t\t<h2 >Mdm Hospital </h2>\r\n");
      out.write("\t\t\t\t\t<h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("\t\t\t\t</svg> +(91)-291-2438655</h4>\r\n");
      out.write("\t\t\t\t\t<h5> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-forward\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M9.502 5.513a.144.144 0 0 0-.202.134V6.65a.5.5 0 0 1-.5.5H2.5v2.9h6.3a.5.5 0 0 1 .5.5v1.003c0 .108.11.176.202.134l3.984-2.933a.51.51 0 0 1 .042-.028.147.147 0 0 0 0-.252.51.51 0 0 1-.042-.028L9.502 5.513zM8.3 5.647a1.144 1.144 0 0 1 1.767-.96l3.994 2.94a1.147 1.147 0 0 1 0 1.946l-3.994 2.94a1.144 1.144 0 0 1-1.767-.96v-.503H2a.5.5 0 0 1-.5-.5v-3.9a.5.5 0 0 1 .5-.5h6.3v-.503z\"/>\r\n");
      out.write("\t\t\t\t</svg> AVAILABLE NOW</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" onClick=\"parent.location='detail5.jsp'\" value=\"In Detail\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr class=\"w-5 pt-3\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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