package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
          //scriplet tag to add java code in jsp
    response.setHeader("Pragma", "no-store,no-cache");
    response.setHeader("Cache-Control", "no-store,no-cache");
    if (request.getSession(false) == null) {
        response.sendRedirect("admin.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding:0;\n");
      out.write("\t\t}\n");
      out.write("            form input{\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("            form textarea{\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("\t\tpadding: 50px;\n");
      out.write("                border: 3px solid #f1f1f1; width: 40%;margin-right: auto; margin-left: auto;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                margin-top: 5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"nav-bar\">\n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-light navbar-light\">\n");
      out.write("            <!--<i class=\"fa fa-backward\" aria-hidden=\"true\"></i>-->\n");
      out.write("                <i class=\"fa fa-backward mr-1\" aria-hidden=\"true\" style=\"font-size: 30px; color: red;\"></i>\n");
      out.write("                <a class=\"navbar-brand text-danger mr-3\" href=\"index.jsp\">Back to Home</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> \n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                   <ul class=\"navbar-nav\">\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#create\">Create</a>\n");
      out.write("\t\t      </li>\n");
      out.write("<!--\t\t      <li class=\"nav-item\">\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#remove\">Remove</a>\n");
      out.write("\t\t      </li>-->\n");
      out.write("\t\t      <li class=\"nav-item\">\n");
      out.write("\t\t        <a class=\"nav-link\" href=\"#update\">Update</a>\n");
      out.write("\t\t      </li>\n");
      out.write("\t\t   </ul>\n");
      out.write("                  <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"navbar-brand text-danger\" href=\"logoutad\"><i class=\"fa fa-sign-out mr-3\" style=\"font-size: 30px; color:red;\" aria-hidden=\"true\"></i>Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("    <section id=\"create\">\n");
      out.write("        <h1 class=\"text-center text-warning\">Add Hotel</h1>\n");
      out.write("        <form action=\"create\" method=\"post\" class=\"ml-auto\" enctype=\"multipart/form-data\">\n");
      out.write("            <label for=\"hname\">Hotel name:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Hotel Name\" name=\"hname\" id=\"hname\" autocomplete=\"off\" required>\n");
      out.write("            <label for=\"rate\">Ratings:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Ratings\" name=\"rate\" id=\"rate\" autocomplete=\"off\" required>\n");
      out.write("            <label for=\"address\">Address:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter Address\" name=\"addr\" id=\"address\" autocomplete=\"off\" required>\n");
      out.write("            <label for=\"about\">About:</label>\n");
      out.write("            <textarea id=\"about\" name=\"abt\" rows=\"5\" class=\"form-control\"></textarea>\n");
      out.write("            <label for=\"mbno\">Contact details:</label>\n");
      out.write("            <input type=\"tel\" class=\"form-control\" placeholder=\"Enter Contact no.\" name=\"mbno\" id=\"mbno\" autocomplete=\"off\" pattern=\"[0-9]{10,11}\" required>\n");
      out.write("            <label for=\"img\">Add image:</label>\n");
      out.write("            <input type=\"file\" class=\"form-control\" name=\"img\" id=\"img\" autocomplete=\"off\" accept=\"image/*\" required>\n");
      out.write("            <label for=\"price\">Price:</label>\n");
      out.write("            <input type=\"number\" class=\"form-control\" name=\"price\" id=\"price\" min=\"100\" autocomplete=\"off\"  required>\n");
      out.write("            <input type=\"submit\" class=\"form-control mt-3 btn btn-success\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("    </section>  \n");
      out.write("        \n");
      out.write("<section id=\"update\">\n");
      out.write("    <form method=\"post\" action=\"update\"> \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"select\">Select list(any one)</label>\n");
      out.write("              <select class=\"form-control\" id=\"select\">\n");
      out.write("                <!--<option>Rating</option>-->\n");
      out.write("                <option>Price</option>\n");
      out.write("                <option>Contact No</option>\n");
      out.write("              </select>\n");
      out.write("              <input type=\"number\" class=\"form-control\" name=\"change\" id=\"change\" min=\"100\" autocomplete=\"off\"  required>\n");
      out.write("              <input type=\"submit\" class=\"form-control mt-3 btn btn-success\" value=\"Submit\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </form> \n");
      out.write("</section>\n");
      out.write("    <!-- jQuery library -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <!-- Popper JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("    <!-- Latest compiled JavaScript -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/smooth-scroll.js\">\n");
      out.write("        var scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("    </script>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
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
