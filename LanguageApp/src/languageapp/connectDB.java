package languageapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Amaar Bhatti - w1781655
 */
public class connectDB {
    
      public static Connection getConnection() {

        try {
            Class.forName("org.sqlite.JDBC");
            
            // Creates connection to the database file 
            String url = "jdbc:sqlite:StudentRecord.db";
            
            // This establishes the connection to the String url which contain the file
            Connection con = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
    
}

