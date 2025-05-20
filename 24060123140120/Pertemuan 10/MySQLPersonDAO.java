/* Nama File : MySQLPersonDAO.java
*  Deskripsi : Implementasi PersonDAO untuk MySQL
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 19 / 05 / 2025
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        //Membuat koneksi, nama db, User, Password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root", "<Ra28In26>");
        //Kerjakan MySQL query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //Tutup koneksi database
        con.close();   
    }
}
