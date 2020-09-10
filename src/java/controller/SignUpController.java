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
import model.Database;

@WebServlet(name= "SignUpController",urlPatterns={"/signup"})
public class SignUpController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        try {
            PrintWriter pout = response.getWriter();
            response.setContentType("text/html");
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String mobile=request.getParameter("phone");
            String pass=request.getParameter("pwd");
            String sqlQuery = "select * from customers where email= '"+email+"'";
            boolean flag01 =  Database.isDataExist(sqlQuery);
            if(!flag01){
                String query="insert into customers(Name,email,mobile_no,password) values('"+name+"','"+email+"','"+mobile+"','"+pass+"')";
                System.out.println("query is :::: "+query);
                int flag = Database.save(query);
                if(flag == 1)
                {
                    pout.println("<script type=\"text/javascript\">");
                    pout.println("location='index.jsp';");
                    pout.println("</script>");
                    
                }
                else
                {
                    pout.println("<script type=\"text/javascript\">");
                    pout.println("alert('Something went wrong.');");
                    pout.println("location='index.jsp';");
                    pout.println("</script>");
                }
            }
            else {
                pout.println("<script type=\"text/javascript\">");
                pout.println("alert('Your Email Already Registered');");
                pout.println("location='index.jsp';");
                pout.println("</script>");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
}}
