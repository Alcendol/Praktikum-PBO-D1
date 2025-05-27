/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author mfirz
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/jdbc_mysql";
                // sesuaikan username dan password
                String user = "student";
                String password = "rahasia";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Driver tidak ditemukan! " + cnfe.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi! " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}