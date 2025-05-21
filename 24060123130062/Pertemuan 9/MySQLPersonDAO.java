import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //Membuat koneksi dengan mysql
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "buntar132405");

        //Membuat query insert
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        //tutup koneksi
        con.close();
    }

    public void deletePerson(Person person) throws Exception{
        //gunakan nama
        String name = person.getName();

        //Membuat koneksi dengan mysql
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "buntar132405");

        //Membuat query delete
        String query = "DELETE FROM person WHERE name='"+name+"'";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        //tutup koneksi
        con.close();
    }
}