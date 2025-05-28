import java.sql.*;

public class MainDAO {
    public static void main(String[] args) {
        String nama = "Indra";
        Person person = new Person(nama);
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo", "root", "Nara_180205");

            // Cek apakah nama sudah ada
            String cekQuery = "SELECT COUNT(*) FROM person WHERE name = ?";
            PreparedStatement ps = con.prepareStatement(cekQuery);
            ps.setString(1, nama);
            ResultSet rsCek = ps.executeQuery();
            rsCek.next();
            int count = rsCek.getInt(1);

            if (count == 0) {
                // Insert jika belum ada
                m.getPersonDAO().savePerson(person);
            }

            // Tampilkan isi tabel
            String query = "SELECT * FROM person";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);

            System.out.println("Isi tabel person:");
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println("- " + name);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
