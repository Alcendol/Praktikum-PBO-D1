import java.sql.*;

/**
 * Nama      : Muhammad Firzi Ryadi
 * NIM       : 24060123140202
 * File      : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 */

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama DB, user, dan password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "160905");

        // Kerjakan MySQL query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi database
        con.close();
    }
}

