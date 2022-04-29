package languageapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author w1781655 / w1776316
 */
public class jdbcCrud {
    public static void insertStu() {
        Connection con = connectDB.getConnection();
        Statement stmt = null;
        String sqlString = ("");
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            stmt.executeUpdate(sqlString);
            stmt.close();
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
      public static void insertStu(int id, String forename, String surname, String emailaddress, String password, String completed, String inProgress) {

        Connection con = connectDB.getConnection();
        Statement stmt = null;
//        int ID = id;
        String studentFname = forename;
        String studentSname = surname;
        String studentEmail = emailaddress;
        String studentPassword = password;
        String completedActivity = completed;
        String Progress = inProgress; 
        
        String sqlString = "INSERT INTO student ( Firstname, Surname, Email, Password, InProgress, CompletedActivity) VALUES \n"
                + "('" + studentFname + "', '" + studentSname + "', '" + studentEmail + "', '" + studentPassword + "', '" + 
                            completedActivity + "', '" + Progress + "')";
        
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            stmt.executeUpdate(sqlString);
            stmt.close();
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
    
     public static void showAll() {
        Connection con = connectDB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from student ");        

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
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

     public static void main(String[] args){
     //insertStu
//     insertStu();
//         insertStu(2, "rack", "e", "g", "f", "s", "d");
         
     } 
}

