
import java.sql.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailis;

/**
 *
 * @author Rauno Hietanen
 */
public class Mailis {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/mailis?";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome!");

        /*scanner data = new Scanner();*/
        
        Connection conn = null;
        Statement stmt = null;
        Scanner scn = new Scanner(System.in);
        String course_code = null, course_desc = null, course_chair = null;

        try {
            // STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // STEP 3: Open a connection
            System.out.print("\nConnecting to database...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mailis?"
                            + "user=root&password=");
            System.out.println(" SUCCESS!\n");

            // STEP 4: Ask for user input
            System.out.print("Enter User name: ");
            course_code = scn.nextLine();

            System.out.print("Enter date: ");
            course_desc = scn.nextLine();

            System.out.print("Enter car id: ");
            course_chair = scn.nextLine();
            
            System.out.print("Enter km: ");
            course_chair = scn.nextLine();
            
            System.out.print("Enter purpose: ");
            course_chair = scn.nextLine();

            // STEP 5: Excute query
            System.out.print("\nInserting records into table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO mailisdataa "
                    + "VALUES (?, ?, ?, ?, ?)";
            stmt.executeUpdate(sql);

            System.out.println(" SUCCESS!\n");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Thank you for your patronage!");
    }
}


