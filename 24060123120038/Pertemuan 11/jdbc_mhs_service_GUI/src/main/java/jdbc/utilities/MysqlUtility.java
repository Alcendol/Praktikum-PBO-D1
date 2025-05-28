/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naraz
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Load driver JDBC MySQL
                Class.forName("com.mysql.cj.jdbc.Driver"); 

                // Konfigurasi koneksi
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs"; 
                String user = "root";
                String password = "Nara_180205"; // 


                // Inisialisasi koneksi
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil");

            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }

    public static void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null;
                System.out.println("Koneksi ditutup");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }

    public static boolean isConnected() {
        try {
            return koneksi != null && !koneksi.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}


