package languageapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Amaar
 */
public class createDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect connect = new Connect();
    }
}

class Connect {

    private String urlSQLite;
    private Driver driverSQLite;
    private Connection con;

    public Connect() {
        // This defines the type of file and the name of the file
        urlSQLite = "jdbc:sqlite:StudentRecord.db";

        try {
            // Download the database file onto the user device
            driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("Driver for SQLite downloaded.");
        } catch (SQLException e) {
            System.out.println("Problem with download driver for SQLite: " + e.getMessage());
        }

        try {
            // create database if it does not exist.
            con = DriverManager.getConnection(urlSQLite);
            System.out.println("Connection to SQLite is done.");
        } catch (SQLException e) {
            System.out.println("Problem with connection to SQLite: " + e.getMessage());
        }

        try {
            // This closes the connection to SQLite
            if (!con.isClosed()) {
                con.close();
                System.out.println("Connection to SQLite closed.");
            }
        } catch (SQLException e) {
            System.out.println("Problem with close connection of SQLite");
        }
    }
}