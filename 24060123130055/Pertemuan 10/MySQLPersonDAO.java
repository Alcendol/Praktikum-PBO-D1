import java.sql.*;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 20 Mei 2025
 */

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception {
        // ambil data dari objek
        String name = person.getName();

        // load driver JDBC MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // koneksi ke database (ubah URL, user, password sesuai lingkungan Anda)
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo", "root", ""
        );

        // susun query INSERT
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println("Executing query: " + query);

        // eksekusi
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);

        // tutup koneksi
        stmt.close();
        con.close();
    }
}
