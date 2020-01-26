package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

        static Connection con = null;
        static Statement stmt = null;


        public static Connection makeJDBCConnection() {

            Connection con = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Congrats - Seems your MySQL JDBC Driver Registered!");
            } catch (ClassNotFoundException e) {
                System.out.println("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
                e.printStackTrace();
                return null;
            }

            try {
                // DriverManager: The basic service for managing a set of JDBC drivers.
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/automation", "root", "");
                if (con != null) {
                    System.out.println("Connection Successful! Enjoy. Now it's time to push data");
                } else {
                    System.out.println("Failed to make connection!");
                }
            } catch (SQLException e) {
                System.out.println("MySQL Connection Failed!");
                e.printStackTrace();
                return con;
            }

            return con;

        }
}
