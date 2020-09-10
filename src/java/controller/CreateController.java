package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Database;

@WebServlet(name="CreateController",urlPatterns={"/create"}) //annotation so that we dont use web.xml deployment descriptors
@MultipartConfig()
public class CreateController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             String hotelname = request.getParameter("hname");
             System.out.println(hotelname);
             String rating = request.getParameter("rate");
             String address = request.getParameter("addr");
             String about = request.getParameter("abt");
             String mbno=request.getParameter("mbno");
             String price=request.getParameter("price");
             int hid=Database.storeHotel(hotelname,rating,address,about,mbno,price);
             Part filepart=request.getPart("img");
             String path=request.getServletContext().getRealPath("/images");
             String genFileName=util.Utility.generateFileName(filepart.getSubmittedFileName());
             if(util.Utility.saveFile(genFileName, path, filepart.getInputStream()) && Database.saveImageToDatabase(hid,genFileName))
               {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Hotel added successfully.');");
                    out.println("location='welcomead.jsp';");
                    out.println("</script>");

               }
             
            else 
            {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Something went wrong.');");
                    out.println("location='adminform.jsp';");
                    out.println("</script>");
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
