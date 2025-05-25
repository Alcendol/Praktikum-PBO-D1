/*
 * Nama File : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO yang menyimpan data ke MySQL
 * Pembuat   : Noval Putra Barliyanda / 24060123140137
 * Tanggal   : 20 Mei 2025
 */
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person person) throws Exception {
        String nama = person.getName();


        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/pbo", "root", "novaaaalll");

   
        String sql = "INSERT INTO person(name) VALUES('" + nama + "')";
        System.out.println(sql);

        Statement st = conn.createStatement();
        st.executeUpdate(sql);

      
        conn.close();
    }
}