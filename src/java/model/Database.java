package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


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
                    System.out.println(price);
                }
                result=days*price;
                System.out.println(result);
	    } catch (Exception ex) {
		System.out.println(ex);
            }
	    return result;
    }
    public static boolean isDataExist(String query) throws SQLException, ClassNotFoundException {
		boolean check = false;
		Connection c = ConnectionM.getConnection();
		
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next() == true) {
				check = true;
			} else {
				check = false;
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} 
		return check;
	}
    public static int storeHotel(String hotelname,String rating,String address,String about,String mbno,String price){
            int hid=0;
         try (Connection con = ConnectionM.getConnection()){
                String sql="INSERT INTO HOTELS(HName,Rating,Address,About,Contact_no,Price) VALUES(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,hotelname);
                ps.setString(2,rating);
                ps.setString(3,address);
                ps.setString(4,about);
                ps.setString(5,mbno);
                ps.setString(6,price);
		ps.executeUpdate();
                ps=con.prepareStatement("SELECT HID FROM HOTELS WHERE CONTACT_NO=?");
                ps.setString(1,mbno);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                   hid=rs.getInt(1);
                }
                
	    } catch (Exception ex) {
		System.out.println(ex);
            }
	    return hid;
    }
    public static boolean saveImageToDatabase(int Hid,String fileName)
     {
         try(Connection connection=ConnectionM.getConnection())
         {
                PreparedStatement ps=connection.prepareCall("INSERT INTO IMAGES(HID,IMGNAME) VALUES(?,?)");
                ps.setInt(1,Hid);
                ps.setString(2,fileName);
                return ps.executeUpdate()>0;
         }
         catch(Exception e){
             return false;
         }
     }
    public static int NoofHotels(){
        int c=0;
        try(Connection con=ConnectionM.getConnection()){
            PreparedStatement ps=con.prepareCall("SELECT * FROM HOTELS");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                c++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    public static List<Hotel> getHotelRecords() throws SQLException, ClassNotFoundException{
        List <Hotel> list=new ArrayList<Hotel>();
        try{
            Connection con=ConnectionM.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM HOTELS");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Hotel h= new Hotel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(h);
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        return list;
    }
    public static String getImageName(int hid){
       String iname=null;
       try{
            Connection con=ConnectionM.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT IMGNAME FROM IMAGES WHERE HID=?");
            ps.setInt(1,hid);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                iname=rs.getString(1);
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        } 
       return iname;
    }
//     <%int count=Database.NoofHotels();
//        System.out.println(count);
//        for(int i=0;i<count;i++){%>    
//           <div class="row text-center">  
//                <div class="col-lg-4 col-md-4 col-12">
//        		<div class="card" style="width:400px;">
//                            <%List<Hotel> list=Database.getHotelRecords();
//                            for(Hotel h:list){
//                               int hid=Integer.parseInt(h.getHotelid());    
//                               String iname=Database.getImageName(hid);
//                            %>
//                            
//                            <img class="card-img-top" src="images/iname" style="height: 200px;" alt="image">
//				<div class="card-body">
//				    <h4 class="card-title"><%=h.getHotelname()%></h4>
//				    <p class="card-text"><%=h.getRating()%> <br> <%=h.getAddress()%></p>
//				    <a href="hotel1.jsp" class="btn btn-primary">Visit</a>
//                                </div>
//			    </div>
//        	</div>
//           </div>
//        <%}%>
}

