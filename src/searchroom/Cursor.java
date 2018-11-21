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
import java.util.*;

public class Cursor {

    public void modify_detail(String cost, String ref, String fromDate, String room){
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "update 'GuestData' set Rooms = '"+room+"', FromDate = '"+fromDate+"', Cost = '"+cost+"' where RefNumber = '"+ref+"'";
            stmt.executeUpdate(query);
            conn.close();
            System.out.println("closed");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void delete_row(String ref_number){
        System.out.println(ref_number);
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "delete from 'GuestData' where RefNumber = '"+ref_number+"'";
            stmt.executeUpdate(query);
            conn.close();
            System.out.println("closed");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<ArrayList<String>> getTransactions(String Username){
        Connection conn = null;
        ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();

        try {
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            //String query = "select * from SignUp where 'Username' = '"+Username+"'";
            String query = "select * from GuestData";
            ResultSet rst = stmt.executeQuery(query);
            
            
            while (rst.next()){
                if (rst.getString("Username").equals(Username) == true) {
                    ArrayList<String> temp = new ArrayList<String>();
                    temp.add("false");
                    temp.add(rst.getString(8));
                    temp.add(rst.getString(1));
                    temp.add(rst.getString(2));
                    temp.add(rst.getString(4));
                    temp.add(rst.getString(5));
                    temp.add(rst.getString(6));
                    temp.add(rst.getString(7));
                    temp.add(rst.getString(9));
                
                    resultArray.add(temp);
                
                }
                
            }
            
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return resultArray;
    }
    
    public String[] getUserInfo(String Username){
        Connection conn = null;
        String[] resultArray = new String[4];
        try {
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            //String query = "select * from SignUp where 'Username' = '"+Username+"'";
            String query = "select * from SignUp";
            ResultSet rst = stmt.executeQuery(query);

            
            resultArray[0] = Username;
            while(rst.next()){
                System.out.println("hi");
                if (rst.getString("Username").equals(Username) == true){
                
                    String emailid = rst.getString("EmailID"); 
                    String contact = rst.getString("Contact");
                    String address = rst.getString("Address");
                
                    resultArray[1] = emailid;
                    resultArray[2] = contact;
                    resultArray[3] = address;
                }
            }
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            return resultArray;
        }
    }
    
    public  int login_page(String user,String pass) {
        Connection conn = null;
        
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from SignUp");
            while(rs.next()){
                String s1 = rs.getString("Username"); 
                String s2 = rs.getString("Password");
                if(s1.equals(user)==true && s2.equals(pass)==true){
                    
                    return 1;                    
                }
            }          
            System.out.println("Connection to SQLite has been established.");
            
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
        return 0;
    }
 
    public static int popup_message(String user) {
        Connection conn = null;
        int flag =0;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from SignUp");
            while(rs.next()){
                String s = rs.getString("Username");
                if(s.equals(user)==true){
                    JOptionPane.showMessageDialog(null, "Same Username Try again");
                    return 1;                    
                }
            }          
            System.out.println("Connection to SQLite has been established.");
            
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
        return 0;
    }

    public static void update_table(String query) {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            
            stmt.execute(query);           
            System.out.println("Connection to SQLite has been established.");
            
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
        static int[][] d  = new int[][]
                {
                        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                        {1, 2, 3, 4, 0, 6, 7, 8, 9, 5},
                        {2, 3, 4, 0, 1, 7, 8, 9, 5, 6},
                        {3, 4, 0, 1, 2, 8, 9, 5, 6, 7},
                        {4, 0, 1, 2, 3, 9, 5, 6, 7, 8},
                        {5, 9, 8, 7, 6, 0, 4, 3, 2, 1},
                        {6, 5, 9, 8, 7, 1, 0, 4, 3, 2},
                        {7, 6, 5, 9, 8, 2, 1, 0, 4, 3},
                        {8, 7, 6, 5, 9, 3, 2, 1, 0, 4},
                        {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
                };
        static int[][] p = new int[][]
                {
                        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                        {1, 5, 7, 6, 2, 8, 3, 0, 9, 4},
                        {5, 8, 0, 3, 7, 9, 6, 1, 4, 2},
                        {8, 9, 1, 6, 0, 4, 3, 5, 2, 7},
                        {9, 4, 5, 3, 1, 2, 6, 8, 7, 0},
                        {4, 2, 8, 6, 5, 7, 3, 9, 0, 1},
                        {2, 7, 9, 3, 8, 0, 6, 4, 1, 5},
                        {7, 0, 4, 6, 9, 1, 3, 2, 5, 8}
                };
        static int[] inv = {0, 4, 3, 2, 1, 5, 6, 7, 8, 9};

        public static boolean validateVerhoeff(String num){
            int c = 0;
            int[] myArray = StringToReversedIntArray(num);
            for (int i = 0; i < myArray.length; i++){
                c = d[c][p[(i % 8)][myArray[i]]];
            }

            return (c == 0);
        }
        private static int[] StringToReversedIntArray(String num){
            int[] myArray = new int[num.length()];
            for(int i = 0; i < num.length(); i++){
                myArray[i] = Integer.parseInt(num.substring(i, i + 1));
            }
            myArray = Reverse(myArray);
            return myArray;
        }
        private static int[] Reverse(int[] myArray){
            int[] reversed = new int[myArray.length];
            for(int i = 0; i < myArray.length ; i++){
                reversed[i] = myArray[myArray.length - (i + 1)];
            }
            return reversed;
        } 
        
    //SMIT JAIN
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
            //if(conn !=  null) System.out.println("hjkl");
            Statement stmt = conn.createStatement();
            System.out.println(query);
            try{
                ResultSet rs = stmt.executeQuery(query);
                //System.out.println("Connection to SQLite has been established.");
                int counter = 0;
               //System.out.println(rs.next());
               int noofrooms_int = Integer.parseInt(noofroomText);
               
                
                  
                   
              
            while (rs.next()){                
                //int id = rs.getInt("id");
                String fDate = rs.getString("FromDate");
                String tDate = rs.getString("ToDate");
                String hName = rs.getString("HotelName");
                int noofrooms =rs.getInt("Rooms");
               //System.out.println(fDate + tDate + hName);
                
                int rowno=0;
                int roomcount_index=0;
                
                for(int o=0;o<20;o++){
                    if(hotellist[o].equals(hName) == true){
                        rowno=o+1;
                        break;
                    }
                }
                System.out.println(rowno);
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
                    
                    roomcount[roomcount_index][p] -= noofrooms;
                    if(roomcount[roomcount_index][p] < min){
                        min = roomcount[roomcount_index][p];
                    }
                }
                
                if(min < noofrooms_int){
                    availabilityCheck[roomcount_index] = false;
                }
                
                    //availabilityCheck[roomcount_index] = true;
                   /* for(int p=startindex;p<=endindex;p++)
                    roomcount[roomcount_index][p] -= noofrooms;*/
                
                //counter ++ ;
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
            
        }
        
        catch (SQLException e) {
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
