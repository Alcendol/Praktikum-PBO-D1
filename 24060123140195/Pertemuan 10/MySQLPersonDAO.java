import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO {
    public void save(Person person) throws Exception {
        String name = person.getName();

        // Load JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Connect to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");

        // Prepare and execute the SQL query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println("Executing: " + query);

        Statement statement = connection.createStatement();
        statement.executeUpdate(query);

        // Close connection
        connection.close();
    }
}
