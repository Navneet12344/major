package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.paytm.pg.merchant.CheckSumServiceHelper;
import java.util.TreeMap;
import java.util.Map;
import java.util.Enumeration;

public final class pgRedirect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public class PaytmConstants {
  public final static String MID="pplqsb60382717307210";
  public final static String MERCHANT_KEY="HJRJon2uMZaQd6qA";
  public final static String INDUSTRY_TYPE_ID="Retail";
  public final static String CHANNEL_ID="WEB";
  public final static String WEBSITE="WEBSTAGING";
 public final static String PAYTM_URL="https://securegw-stage.paytm.in/order/process";
   
 } 
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Payment Redirect To Payment gateway</title>\n");
      out.write("    </head>\n");
      out.write("    <body   style=\" background-size: cover; position: relative; \">\n");
      out.write("     \n");
      out.write("        ");
      out.write("\n");
      out.write("     \n");
      out.write("     \n");

Enumeration<String> paramNames = request.getParameterNames();
Map<String, String[]> mapData = request.getParameterMap();
TreeMap<String,String> parameters = new TreeMap<String,String>();
String paytmChecksum =  "";
while(paramNames.hasMoreElements()) {
 String paramName = (String)paramNames.nextElement();
 parameters.put(paramName,mapData.get(paramName)[0]); 
}

parameters.put("MID",PaytmConstants.MID);
parameters.put("CHANNEL_ID",PaytmConstants.CHANNEL_ID);
parameters.put("INDUSTRY_TYPE_ID",PaytmConstants.INDUSTRY_TYPE_ID);
parameters.put("WEBSITE",PaytmConstants.WEBSITE);
parameters.put("MOBILE_NO","8619558930");
parameters.put("EMAIL","kaurnavneet71242@gmail.com");
//parameters.put("CALLBACK_URL", "put back url");  //if payment is canceled then return this page
parameters.put("CALLBACK_URL","https://merchant.com/callback/");

String checkSum =  CheckSumServiceHelper.getCheckSumServiceHelper().genrateCheckSum(PaytmConstants.MERCHANT_KEY, parameters);  //interface which is generate transection id


StringBuilder outputHtml = new StringBuilder();
outputHtml.append("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>");
outputHtml.append("<html>");
outputHtml.append("<head>");
outputHtml.append("<title>Merchant Check Out Page</title>");
outputHtml.append("</head>");
outputHtml.append("<body>");
outputHtml.append("<center><h1>Please do not refresh this page...</h1></center>");
outputHtml.append("<form method='post' action='"+ PaytmConstants.PAYTM_URL +"' name='f1'>");
outputHtml.append("<table border='1'>");
outputHtml.append("<tbody>");

for(Map.Entry<String,String> entry : parameters.entrySet()) {
 String key = entry.getKey();
 String value = entry.getValue();
 outputHtml.append("<input type='hidden' name='"+key+"' value='" +value+"'>"); 
} 
 


outputHtml.append("<input type='hidden' name='CHECKSUMHASH' value='"+checkSum+"'>");
outputHtml.append("</tbody>");
outputHtml.append("</table>");
outputHtml.append("<script type='text/javascript'>");
outputHtml.append("document.f1.submit();");
outputHtml.append("</script>");
outputHtml.append("</form>");
outputHtml.append("</body>");
outputHtml.append("</html>");
out.println(outputHtml);

      out.write("\n");
      out.write("</body>\n");
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
