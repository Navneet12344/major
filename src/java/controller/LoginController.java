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

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
     protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException, SQLException{
          response.setContentType("text/html;charset=UTF-8");
          try(PrintWriter out=response.getWriter()){
              String email_add = request.getParameter("email");
              String password=request.getParameter("pwd");         
              out.println(email_add);
              String status=Database.checkUser(email_add,password);
              String name=Database.getUserName(email_add);
               if(status.equals("Valid user"))
              {
                  HttpSession session=request.getSession(true);
                  session.setAttribute("mail" ,email_add);
                  session.setAttribute("uname" ,name);
                  response.sendRedirect("welcome.jsp");
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
