package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("form {border: 3px solid #f1f1f1; width: 40%; margin-right: auto; margin-left: auto; background-color: rgba(0,0,0,.7);}\r\n");
      out.write("\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 12px 20px;\r\n");
      out.write("  margin: 8px 0;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 14px 20px;\r\n");
      out.write("  margin: 8px 0;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("  opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("  width: auto;\r\n");
      out.write("  padding: 10px 18px;\r\n");
      out.write("  background-color: #f44336;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin: 24px 0 12px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.avatar {\r\n");
      out.write("  width: 40%;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("}\r\n");
      out.write(".container2 {\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("  background-color : rgba(0,0,0,.7);\r\n");
      out.write("}\r\n");
      out.write("span.psw {\r\n");
      out.write("  float: right;\r\n");
      out.write("  padding-top: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("@media screen and (max-width: 300px) {\r\n");
      out.write("  span.psw {\r\n");
      out.write("     display: block;\r\n");
      out.write("     float: none;\r\n");
      out.write("  }\r\n");
      out.write("  .cancelbtn {\r\n");
      out.write("     width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2 style=\"text-align:center;\">Login Admin</h2>\r\n");
      out.write("\r\n");
      out.write("<form action=\"adlogin\" method=\"post\">\r\n");
      out.write("  <div class=\"imgcontainer\">\r\n");
      out.write("    <img src=\"images/img_avatar.png\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" autocomplete=\"off\" required>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" autocomplete=\"off\" name=\"psw\" required>\r\n");
      out.write("        \r\n");
      out.write("    <button type=\"submit\">Login</button>\r\n");
      out.write("    <label>\r\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n");
      out.write("    </label>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container2\" style=\"background-color:#f1f1f1\">\r\n");
      out.write("      <a href=\"#\"><button type=\"button\" class=\"cancelbtn\">Cancel</button></a>\r\n");
      out.write("    <span class=\"psw\"><a href=\"#\">Forgot password?</a></span>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
