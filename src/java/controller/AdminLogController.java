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

@WebServlet(name = "AdminLogController", urlPatterns = {"/adlogin"})
public class AdminLogController extends HttpServlet {
     protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException, SQLException{
          response.setContentType("text/html;charset=UTF-8");
          try(PrintWriter out=response.getWriter()){
              String username = request.getParameter("uname");
              String pass=request.getParameter("psw");         
              String status=Database.checkAdmin(username,pass);
               if(status.equals("Valid admin"))
              {
                  HttpSession session=request.getSession(true);
                  session.setAttribute("adname" ,username);
                  response.sendRedirect("index.jsp");
              }
              else{
//                  if(status.equals("Invalid email id")){
//                       onclick();
//                  }
//                  else{
//                      
//                  }
                  out.println(status);
              }
              
          }
           catch(Exception e){
             e.printStackTrace();
           }
     }
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

}
