import java.sql.*;
import java.util.*;

public class MySQLPersonDAO implements PersonDAO {
    private Connection conn;

    public MySQLPersonDAO(Connection conn) {
        this.conn = conn;
    }

    public void insertPerson(Person p) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO person(name) VALUES (?)");
            stmt.setString(1, p.getName());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getAllPersons() {
        List<Person> list = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM person");
            while (rs.next()) {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
