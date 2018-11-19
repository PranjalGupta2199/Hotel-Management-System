package searchroom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRANJAL
 */
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.sql.*;

public class Cursor {
    public static void insert(String query,String noofroomText) {
        Connection conn = null;
        
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\Smit\\Desktop\\Hotel-Management-System-develop\\Data\\dump.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            Statement stmt = conn.createStatement();
            try{
                ResultSet rs = stmt.executeQuery(query);
            System.out.println("Connection to SQLite has been established.");
            /*while (rs.next()){
                //int id = rs.getInt("id");
                String firstName = rs.getString("Location");
                String lastName = rs.getString("Name");
        
        // print the results
                System.out.format("%s, %s\n", firstName, lastName);
                }*/
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
 
            finally{
                stmt.close();
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void getData(String location) {
        Connection conn = null;
        
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\Smit\\Desktop\\Hotel-Management-System-develop\\Data\\dump.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            //PreparedStatement stmt;
            Statement stmt = conn.createStatement();
            try{
                String query = "select * from HotelData where 'Location' = '"+location+"'";
                //stmt = conn.prepareStatement(query);
                //int result = stmt.executeUpdate();
                //System.out.println(result);
                ResultSet rs = stmt.executeQuery(query);
            System.out.println("Connection to SQLite has been established.");
            while (rs.next()){
                System.out.println("chalja");
                //int id = rs.getInt("id");
                String Name = rs.getString("Name");
                int roomCost = rs.getInt("Room cost");
                float ratings = rs.getFloat("Rating");
        // print the results
                System.out.println(Name + ratings+ roomCost);
                }
            }
            catch (Exception e){
                System.out.println("hio");
                System.out.println(e.getMessage());
            }
 
            finally{
                //stmt.close();
            }
            
        } catch (SQLException e) {
            System.out.println("poi");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    
    
    public static boolean[] roomCount(String query,String noofroomText) {
        Connection conn = null;        
         int[][] roomcount = new int[4][60];
                for(int i=0;i<4;i++){
                    for(int j=0;j<60;j++){
                        roomcount[i][j] = 150;
                    }
                }
            boolean [] availabilityCheck = new  boolean [4];    
            for(int y=0;y<4;y++) availabilityCheck[y] = true;
          String[] hotellist = new String[]{"Clairon Hotel","The Mount Regency","Liberty Park","MGM Beach Resorts","Delhi Empire Dx","Radisson Hotel","Grand Heritage Resort",
           "Sri Sri Residency","The LaLit","Mango Hotel","Indana Palace","Souvenir Prime","The Ambassador","Parle International","The Oriental Residency" ,
            "Golden Chariot","Noor-Us-Subah Palace","Jehanuma Palace","Shalimar Deluxe","Golden Lakes Hotel"};
         
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\Smit\\Desktop\\Hotel-Management-System-develop\\Data\\dump.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            Statement stmt = conn.createStatement();
            try{
                ResultSet rs = stmt.executeQuery(query);
                System.out.println("Connection to SQLite has been established.");
                int counter = 0;
                
            while (rs.next() == true){
                System.out.println("entred into rs");
                //int id = rs.getInt("id");
                String fDate = rs.getString("FromDate");
                String tDate = rs.getString("ToDate");
                String hName = rs.getString("HotelName");
                int noofrooms = rs.getInt("Rooms");

                
                int rowno=0;
                int roomcount_index=0;
                
                for(int o=0;o<20;o++){
                    if(hotellist[o].equals(hName) == true){
                        rowno=o;
                        break;
                    }
                }
                
                int temp = (rowno)%4;
                    if(temp == 1){
                        roomcount_index = 0;                    
                    }
                    else if(temp == 2){
                        roomcount_index = 1;
                    }else if(temp == 3){
                        roomcount_index = 2;                    
                    }else if(temp == 0){
                        roomcount_index = 3;                    
                    }
                    
                
                int f_date = Integer.parseInt(fDate.split("/", 0)[0]);
                int f_month = Integer.parseInt(fDate.split("/", 0)[1]);
                int t_date = Integer.parseInt(tDate.split("/", 0)[0]);
                int t_month = Integer.parseInt(tDate.split("/", 0)[1]);
                //int noofrooms = Integer.parseInt(noofrooms_string);
                int startindex=0;
                int endindex=0;
                
                if(f_month == 11) startindex = f_date-1;
                else startindex = 29 + f_date;
                
                if(t_month == 11) endindex = t_date-1;
                else endindex = 29 + t_date;
                
                int min=150;
                
                for(int p=startindex;p<=endindex;p++){
                    
                    if(roomcount[roomcount_index][p] < min){
                        min = roomcount[roomcount_index][p];
                    }
                    //roomcount[roomcount_index][p] -= noofrooms;
                    
                }
                int noofrooms_int = Integer.parseInt(noofroomText);
                if(min < noofrooms_int){
                    availabilityCheck[roomcount_index] = false;
                }
                else {
                    //availabilityCheck[roomcount_index] = true;
                    for(int p=startindex;p<=endindex;p++)
                    roomcount[roomcount_index][p] -= noofrooms;
                }
                counter ++ ;
        // print the results
                //System.out.format("%s, %s\n", firstName, lastName);
                }

            }
            catch (Exception e){
                System.out.println("Exception exec");
                System.out.println(e.getMessage());
            }
 
            finally{
                
                stmt.close();
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            for(int i=0;i<4;i++)
            {
                System.out.print(availabilityCheck[i]);
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }  
            return availabilityCheck;
        }
        
        
    }
    public static void main(String args[]){
        String a = "Smit";
        //INSERT INTO GuestData ('Location', 'Hotel Name', 'Account Name') VALUES ('Chennai', 'Clairon Hotel', '"+a+"')
        //connect("DELETE * FROM GuestData");
    }
    
}
