package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    public static String checkUser(String email_add, String password) throws SQLException, ClassNotFoundException {
        try (Connection con = ConnectionM.getConnection()) {
            PreparedStatement ps = con.prepareCall("SELECT * FROM CUSTOMERS WHERE EMAIL=?");
            ps.setString(1,email_add);
            ResultSet rs=ps.executeQuery();
            if(!rs.next()){
                String emailid=rs.getString(3);
                System.out.println(emailid);  
                return "Invalid email id";
            }
            else{
                if(rs.getString(5).equals(password)){
                    return "Valid user";
                }
                else{
                    return "Invalid Password";
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            return "Unknown Error";
        }
    }
    public static String checkAdmin(String username, String pass) throws SQLException, ClassNotFoundException {
        try (Connection con = ConnectionM.getConnection()) {
            PreparedStatement ps = con.prepareCall("SELECT * FROM ADMIN WHERE USERNAME=?");
            ps.setString(1,username);
            ResultSet rs=ps.executeQuery();
            if(!rs.next()){ 
                return "Invalid admin name";
            }
            else{
                if(rs.getString(3).equals(pass)){
                    return "Valid admin";
                }
                else{
                    return "Invalid Password";
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            return "Unknown Error";
        }
    }
    public static int save(String sql) {
		int i = 0;
		System.out.println("query is ::::: "+sql.toString());
		try (Connection con = ConnectionM.getConnection()){
			Statement st = con.createStatement();
			i = st.executeUpdate(sql);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return i;
	}
    public static String getUserName(String email_add) throws SQLException, ClassNotFoundException{
         String name=null;
         try (Connection con = ConnectionM.getConnection()) {
            PreparedStatement ps = con.prepareCall("SELECT NAME FROM CUSTOMERS WHERE EMAIL=?");
            ps.setString(1,email_add);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                name=rs.getString(1);
            }
            
         } 
         catch(Exception e){
            e.printStackTrace();
            return "Unknown Error"; 
         }
         return name;
    }
    public static int getPrice(int days,String Hname){
        int result=0, price=0;
            try (Connection con = ConnectionM.getConnection()){
                PreparedStatement ps=con.prepareCall("SELECT PRICE FROM HOTELS WHERE HNAME=?");
                ps.setString(1,Hname);
		ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    price=Integer.parseInt(rs.getString(1));
                }
                result=days*price;
                System.out.println(result);
	    } catch (Exception ex) {
		System.out.println(ex);
            }
	    return result;
    }
    public static int storeHotel(String hotelname,String rating,String address,String about,String mbno,String price){
            int flag=0;
         try (Connection con = ConnectionM.getConnection()){
                String sql="INSERT INTO HOTELS(HName,Rating,Address,About,Contact_no,Price) VALUES(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,hotelname);
                ps.setString(2,rating);
                ps.setString(3,address);
                ps.setString(4,about);
                ps.setString(5,mbno);
                ps.setString(6,price);
		flag=ps.executeUpdate();
	    } catch (Exception ex) {
		System.out.println(ex);
            }
	    return flag;
    }
    public static boolean saveImageToDatabase(String fileName)
     {
         try(Connection connection=ConnectionM.getConnection())
         {
                PreparedStatement ps=connection.prepareCall("INSERT INTO IMAGE VALUES(?)");
                ps.setString(1,fileName);
                return ps.executeUpdate()>0;
         }
         catch(Exception e){
             return false;
         }
     }
}

