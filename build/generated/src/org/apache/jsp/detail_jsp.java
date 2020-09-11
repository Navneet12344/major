package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title> </title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("  $( function() {\r\n");
      out.write("    $( \"#datepicker\" ).datepicker();\r\n");
      out.write("  } );\r\n");
      out.write("  </script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.container img{\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("  <a class=\"navbar-brand text-white\" href=\"index.jsp\">HOSPITALS</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"container py-5 my-3 border\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-lg-8 col-md-8 col-12\">\r\n");
      out.write("        <h2> Dr. Akshay Solanki (yash Aman Hospital) </h2>\r\n");
      out.write("        <h4> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("            <path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("          </svg> +(91)-9152624707</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-4 col-md-4 col-12 px-5 py-5\">\r\n");
      out.write("          <input type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#appointmentModal\" value=\"Book Appoitment\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal fade\" id=\"appointmentModal\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("      \r\n");
      out.write("        <!-- Modal Header -->\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h4 class=\"modal-title\">Fill this form for Appointment</p></h4>\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Modal body -->\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <form action=\"BookAppointment\" method=\"post\">\r\n");
      out.write("          <input type=\"hidden\" name=\"doctorid\" value=\"00YAH\">\r\n");
      out.write("          \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label for=\"name\">Your Name *</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" placeholder=\"Enter name\" id=\"name\" autocomplete=\"off\" name=\"name\" value = '");
      out.print( session.getAttribute("name")== null ? "":session.getAttribute("name") );
      out.write("' >\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label for=\"mobile\">Your Mobile No. *</label>\r\n");
      out.write("\t\t    <input type=\"number\" class=\"form-control\" placeholder=\"Enter your number\" id=\"mobile\" name=\"mobile\" autocomplete=\"off\"  value = '");
      out.print( session.getAttribute("mobile") );
      out.write("' >\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label for=\"email\">Your Email ID (Optional)</label>\r\n");
      out.write("\t\t    <input type=\"email\" class=\"form-control\" placeholder=\"Enter email id\" id=\"email\" name=\"email\" autocomplete=\"off\"  value = '");
      out.print( session.getAttribute("email") == null ? "":session.getAttribute("email") );
      out.write("' >\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\r\n");
      out.write("    \t <div class=\"form-group\">\r\n");
      out.write("\t\t\t <label for=\"date\">Appointment Date *</label>\r\n");
      out.write("\t\t\t <input type=\"text\" class=\"form-control\" placeholder=\"Enter Date\"  name=\"date\" autocomplete=\"off\" id=\"datepicker\">\r\n");
      out.write(" \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("      </div>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("<section>\r\n");
      out.write("  <div class=\"container border pb-5\">\r\n");
      out.write("    <div class=\"p-3 mb-2 bg-light text-muted\"><h4>Business Information</h4></div>\r\n");
      out.write("    <h3 class=\"text-muted\">Dr. Akshay Solanki (yash Aman Hospital) in Residency Road, Jodhpur</h3>\r\n");
      out.write("    <hr class=\"w-5 pt-10\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <h4>Location and Overview:</h4>\r\n");
      out.write("    <hr class=\"w-5 pt-10\">\r\n");
      out.write("    <h6 class=\"text-muted\">Dr. Akshay Solanki (yash Aman Hospital) in Residency Road, Jodhpur is a top player in the category General Physician Doctors in the Jodhpur. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Jodhpur. Over the course of its journey, this business has established a firm foothold in itâs industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Jodhpur, this establishment occupies a prominent location in Residency Road. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is known to provide top service in the following categories: General Physician Doctors, Piles Doctors, Colorectal Surgeon Doctors, Piles Hospitals, Online Doctors For Piles, Colorectal Oncologist Surgeon Doctors, Fissure Doctors, Non Surgical Piles Treatment Doctors.</h6><br>\r\n");
      out.write("   \r\n");
      out.write("    <h4>Contact number and Address :</h4>\r\n");
      out.write("    <hr class=\"w-5 pt-10\">\r\n");
      out.write("    <h5 class=\"text-muted\"> <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("            <path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z\"/>\r\n");
      out.write("        </svg> +91-291-2570034,</h5><br>\r\n");
      out.write("        <h5 class=\"text-muted\">Email : yashamanhospital.info@gmail.com, drasolanki@hotmail.com<br><br>\r\n");
      out.write("          Yash Aman Hospital, 21 Kishore Bagh, <br>Near Bhomiayaji Ka Than,Main Nagaur Road,<br>Jodhpur - 342001, rajasthan <br><br>\r\n");
      out.write("        Open hours: 9:00AM - 8:00PM Mon-Fri</h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <h4>About Us</h4>\r\n");
      out.write("        <hr class=\"w-5 pt-10\">\r\n");
      out.write("        <h6 class=\"text-muted\">Yash Aman Hospital is located in the Jodhpur, Rajasthan. Yash Aman Hospital serves a vast population covering the areas of jodhpur and the local villages. The Hospital was started on 28th September 2009 by Dr Akshay Solanki. Serving around 100 no of out patients daily, Yash Aman hospital provides good quality health care at a highly subsidised rate. This Hospital has several departments and a wide range of facilities to provide effective medical care. Every year, new facilities are being made available, thereby adding to its growth.</h6><br>\r\n");
      out.write("\r\n");
      out.write("        <h4>Our Mission</h4>\r\n");
      out.write("        <hr class=\"w-5 pt-10\">\r\n");
      out.write("        <h6 class=\"text-muted\">We Believes in continuous improvement, we update ourself & facilities continuously to create wellbeing & betterment for our patients. our mission is to delivering complete satisfaction of each of our patients by :</h6>\r\n");
      out.write("        <h6 class=\"text-muted\">.>Providing consistent & high quality care to our patients.<br>\r\n");
      out.write("        .>Achieving a positive outcome through best of efforts.<br>\r\n");
      out.write("        .>Maintaining utmost hygienic care in our hospital.<br>\r\n");
      out.write("        .>Providing most advance facilities at affordable cost</h6>\r\n");
      out.write("        <br>\r\n");
      out.write("    <h4 class=\"text-dark\">Products and Services offered:</h4>\r\n");
      out.write("    <hr class=\"w-5 pt-10\">\r\n");
      out.write("    <h6 class=\"text-muted\">Dr. Akshay Solanki (yash Aman Hospital) in Residency Road has a wide range of products and services to cater to the varied requirements of their customers. The staff at this establishment are courteous and prompt at providing any assistance. They readily answer any queries or questions that you may have. Pay for the product or service with ease by using any of the available modes of payment, such as Cash, Debit Cards, Cheques, Credit Card. This establishment is functional from Open 24 Hrs - Open 24 Hrs.</h6>\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"p-3 mb-2 bg-light text-muted\"><h4>Frequently Asked Question</h4></div>\r\n");
      out.write("    <h5>1. What are the various mode of payment accepted here ?</h5>\r\n");
      out.write("    <h6 class=\"text-muted\">You can make payment Via Cash, Debit Cards, Cheques, Credit Card.</h6><br>\r\n");
      out.write("    <h5>2. What are its hours of operation ?</h5>\r\n");
      out.write("    <h6 class=\"text-muted\">The establishment is functional on<br>\r\n");
      out.write("          Monday:- Open 24 Hrs<br>\r\n");
      out.write("          Tuesday:- Open 24 Hrs<br>\r\n");
      out.write("          Wednesday:- Open 24 Hrs<br>\r\n");
      out.write("          Thursday:- Open 24 Hrs<br>\r\n");
      out.write("          Friday:- Open 24 Hrs<br>\r\n");
      out.write("          Saturday:- Open 24 Hrs<br>\r\n");
      out.write("          Sunday:- Open 24 Hrs</h6>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section class=\"pt-3 py-5\">\r\n");
      out.write("  <div class=\"container border\">\r\n");
      out.write("    <h1 class=\"text-center pt-5 text-success\">Our Doctors</h1>\r\n");
      out.write("    <h5 class=\"text-center\">We are a team of Experts</h5>\r\n");
      out.write("    <hr class=\"w-25 mx-auto pt-5\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/drakshaysolanki.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Akshay Solanki</h4>\r\n");
      out.write("          M.S. ( Gen.Surgery.) Laparoscopic Surgeon ( FAIS, FIAGES, FMAS, FISCP )\r\n");
      out.write("          <br><br>\r\n");
      out.write("          MEMBER OF ISCURS ( LONDON ) Trained in Laser & Piles from Germany, Trained in Vaaft from Ircad France Specialist in :- Piles, Fissure, Fistula</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/Dr_Meenal_solankia1.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Meenal Solanki</h4>\r\n");
      out.write("          M.S. ( Obs. & Gynae )\r\n");
      out.write("          <br><br>\r\n");
      out.write("          Laparoscopic Gynae Surgeon Gold Medalist\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/Dr_Tejpal_Faroda.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Tejpal Faroda</h4><br>\r\n");
      out.write("            M.S , M.Ch ( Neurosurgery )</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/Dr_Arvind_Sarraf.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h3>Dr Arvind Sarraf</h3><br>\r\n");
      out.write("          M.S. ( Gen.Surgery.)</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"row py-3 pt-3\">\r\n");
      out.write("      <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/dr_sushil_jhanwar.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Sushil Jhanwar</h4><br>\r\n");
      out.write("          MD ( physician )</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/dr_prafaul_kachwaha.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Prafaul kachwaha</h4>\r\n");
      out.write("            Anesthesiologist</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/dr_saurabh_vijayvergia.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Saurabh Vijayvergia</h4>\r\n");
      out.write("          M.S. ( E.N.T. )<br>\r\n");
      out.write("\r\n");
      out.write("          Ear Nose Throat & Head Neck Surgeon</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("        <img class=\"card-img-top\" src=\"images/hospital/Dr_Bhanu_Pratap_Singh.jpg\" class=\"Card image\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("          <p class=\"card-text\"> <h4>Dr Bhanu Pratap Singh</h4>\r\n");
      out.write("        MD Pedetrician </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section class=\"py-2 pb-3\">\r\n");
      out.write("  <div class=\"container border\">\r\n");
      out.write("        <h1 class=\"text-center pt-5 text-muted\"> Hospital Photos</h1>\r\n");
      out.write("        <hr class=\"w-25 mx-auto pt-5\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash1.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash2.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash3.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row py-3\">\r\n");
      out.write("          <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash4.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash5.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash6.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" col-lg-3 col-md-3 col-12 \">\r\n");
      out.write("          <img src=\"images/hospital/yash7.jpg\" class=\"img-fluid\">\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write(" </section>\r\n");
      out.write(" <section class=\"py-5\">\r\n");
      out.write("      <div class=\" container border\">\r\n");
      out.write("        <h2 class=\"pt-5 text-muted\">Hospital Location in Map</h2>\r\n");
      out.write("        <hr class=\"w-5 pt-10\">\r\n");
      out.write("        <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14304.013389971631!2d73.044472!3d26.3263911!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x2f1e942cb4d4022e!2sYash%20aman%20Hospital%20OT!5e0!3m2!1sen!2sin!4v1598449717630!5m2!1sen!2sin\" width=100% height=\"500\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\r\n");
      out.write("      </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write(" \r\n");
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