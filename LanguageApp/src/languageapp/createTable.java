package languageapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Amaar Bhatti - w1781655
 */
public class createTable {
    public static void main(String[] args) {
        // This uses the class connectDB to create a connection to the database
        Connection con = connectDB.getConnection();
        Statement stmt = null;
        String createString;
        
        // the table is created with all fields mention below
        createString = "CREATE TABLE if not exists student (\n"
                + "            ID     INTEGER      PRIMARY KEY,\n"
                + "            Firstname  VARCHAR (15),\n"
                + "            Surname VARCHAR (15),\n"
                + "            Email   VARCHAR (25),\n"
                + "            Password  VARCHAR (15),\n"
                + "            InProgress  VARCHAR (15),\n"
                + "            CompletedActivity  VARCHAR (15),\n"
                + "            encryptedPublicKey  VARCHAR (15),\n"
                + "            encryptedPassword   VARCHAR (25)\n" + ") ;";
        try {
            stmt = con.createStatement();
            
            // this will update the database and add the student table
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
    }    
}

