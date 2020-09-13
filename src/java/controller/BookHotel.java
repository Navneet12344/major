package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Database;


@WebServlet(name = "BookHotel", urlPatterns = {"/book"})
public class BookHotel extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        HttpSession session=request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          if( session.getAttribute("mail") != null) {
            String cin=session.getAttribute("cin").toString();
            String cout=session.getAttribute("cout").toString();
            System.out.println("entered");
            int hid=Integer.parseInt(session.getAttribute("hotelid").toString());
            String query =  "insert into bookings (hid,Check_in,Check_out) VALUES  ('"+
		hid+"','"+cin+"','"+cout+"')";
		int flag = Database.save(query);
		
		if(flag == 1)
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Hotel Booked');");
			out.println("location='bill.jsp';");
//                        out.println("<a href=hotel1.jsp?page=hid>");
//                        out.println("</a>");
			out.println("</script>");
		
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Failed to Book');");
			out.println("location='bill.jsp';");
			out.println("</script>");
			
		}
          }
          else{
              out.println("<script type=\"text/javascript\">");
              out.println("alert('Login first');");
              out.println("location='index.jsp';");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(BookHotel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(BookHotel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
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
