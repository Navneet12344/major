package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Database;
import java.util.List;
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
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <style>\r\n");
      out.write("            *{\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tbox-sizing: border-box;\r\n");
      out.write("\t\t}\r\n");
      out.write("            tr th{\r\n");
      out.write("\t\t\tbackground-color: rgba(0,0,0,0.8);\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t}\r\n");
      out.write("             table,tr,th,td{\r\n");
      out.write("         \tborder: 1px solid #ccc;\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t\tpadding: 5px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("                margin-left: auto;\r\n");
      out.write("                margin-right: auto;\r\n");
      out.write("              }\r\n");
      out.write("              h1{\r\n");
      out.write("                  text-align: center;\r\n");
      out.write("              }\r\n");
      out.write("              tr:hover{\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t}\r\n");
      out.write("                #right{\r\n");
      out.write("                    float: right;\r\n");
      out.write("                }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("        <h1 style=\"text-align: center; background-color: #A28089;\" class=\"mb-0\">Welcome ");
      out.print( request.getSession(false).getAttribute("adname"));
      out.write("</h1> \r\n");
      out.write("        <i class=\"fa fa-backward mr-1\" aria-hidden=\"true\" style=\"font-size: 30px; color: red;\"></i>\r\n");
      out.write("        <a class=\"navbar-brand text-danger mr-3\" href=\"index.jsp\">Back to Home</a>\r\n");
      out.write("        <a href=\"adminform.jsp\" class=\"btn btn-primary\" id=\"right\">Make Changes</a>\r\n");
      out.write("        ");
 List<Hotel> list=Database.getHotelRecords();
             out.print("<h1>Hotel Details</h1>");
             out.print("<table border='1' cellpadding='4' width='70%'>");
             out.print("<tr><th>Hid</th><th>HName</th><th>Rating</th><th>Address</th><th>About</th><th>Contact No.</th><th>Price</th><th>Remove</th></tr>");
             for(Hotel h:list){
                   out.print("<tr><td>"+h.getHotelid()+"</td><td>"+h.getHotelname()+"</td><td>"+h.getRating()+"</td><td>"+h.getAddress()+"</td><td>"+h.getAbout()+"</td><td>"+h.getContact_No()+"</td>"
                           + "<td>"+h.getPrice()+"</td><td>");
                   
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   <a href=\"delete?id=");
      out.print(h.getHotelid());
      out.write("\"><i class=\"fa fa-trash\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                   ");

                   out.print("</td></tr>");
             }
            out.print("</table>");
         
      out.write("\r\n");
      out.write("        <!-- jQuery library -->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Popper JS -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <!-- Latest compiled JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
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
