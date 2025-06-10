import java.sql.*;

public class DAOManager {
    private Connection conn;
    private PersonDAO personDAO;

    public DAOManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Gunakan driver sesuai versi
            conn = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
            personDAO = new MySQLPersonDAO(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
