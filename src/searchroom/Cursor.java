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

import java.sql.*;

public class Cursor {
    public static void connect(String query) {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\PRANJAL\\Documents\\NetBeansProjects\\SearchRoom\\Data\\HMS.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            Statement stmt = conn.createStatement();
            try{
                ResultSet rs = stmt.executeQuery(query);
            //System.out.println("Connection to SQLite has been established.");
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
    public static void main(String args[]){
        String a = "Smit";
        //INSERT INTO GuestData ('Location', 'Hotel Name', 'Account Name') VALUES ('Chennai', 'Clairon Hotel', '"+a+"')
        connect("DELETE * FROM GuestData");
    }
    
}
