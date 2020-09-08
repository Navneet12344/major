package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Database;

@WebServlet(name = "PriceController", urlPatterns = {"/price"})
public class PriceController extends HttpServlet {
    protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException, SQLException{
          response.setContentType("text/html;charset=UTF-8");
          int days,total=0;
          try(PrintWriter out=response.getWriter()){
              String cin = request.getParameter("value1");
              String cout= request.getParameter("value2");
              String HName=request.getParameter("value3");
//              System.out.println(HName);
              DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
              Date din=df.parse(cin);    //Wed Jan 15 00:09:00 IST 2020
              Date dout=df.parse(cout);     // df.format(d);             //2020-01-15
              int date=din.getDate();
//              System.out.println(date);
              int month=din.getMonth()+1;
//              System.out.println(month);
              int y1 = din.getYear();
              int year=y1+1900;
//              System.out.println(year);
              if((din.getMonth()+1)!=(dout.getMonth()+1)){
                  if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)){
                     days=(31-din.getDate())+dout.getDate();
                  }
                  else{
                     days=(30-din.getDate())+dout.getDate(); 
                  }
              }
              else{
                  days=dout.getDate()-din.getDate();
              }
            total=Database.getPrice(days,HName);
            out.println(total);
          }
           catch(Exception e){
             e.printStackTrace();
           }
     }
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

}
