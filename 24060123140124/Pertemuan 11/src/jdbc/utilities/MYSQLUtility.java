/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utlities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 */
public class MYSQLUtility {
    private static Connection koneksi;

    public static Connection getConnection(){
        if (koneksi  == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/pbo1";
                String user = "root";
                String password = "root";
                koneksi = DriverManager.getConnection(url,user, password);
                if (koneksi != null) {
                    System.out.println("Connected Successfully");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Failed to load driver: " + cne.getMessage());
            } catch(SQLException sqle){
                System.out.println("Failed connecting to database: " + sqle.getMessage());
            }
        }

        return koneksi;
    }
}
