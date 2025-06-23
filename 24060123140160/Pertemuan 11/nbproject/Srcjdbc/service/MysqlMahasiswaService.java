package ondi.service;

import jdbc.model.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.List;
import java.util.ArrayList;


public class MysqlMahasiswaService {

    private Connection koneksi;
    private static final String URL = "ondi:mysql://localhost:3307/PBO";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "160905";

    public MysqlMahasiswaService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.koneksi = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error saat membuat koneksi database: " + e.getMessage());
        }
    }

    public MysqlMahasiswaService(String url, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.koneksi = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error saat membuat koneksi database: " + e.getMessage());
        }
    }


    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }


    public Mahasiswa makeMhsObject(int id, String nama) {
        return new Mahasiswa(id, nama);
    }


    public boolean add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, mhs.getNama());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Error saat menambah data mahasiswa: " + e.getMessage());
            return false;
        }
    }

  
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToMahasiswa(rs);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error saat mengambil data mahasiswa by ID: " + e.getMessage());
        }

        return null;
    }


    public List<Mahasiswa> getByNama(String nama) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa WHERE nama LIKE ? ORDER BY nama";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, "%" + nama + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    mahasiswaList.add(mapResultSetToMahasiswa(rs));
                }
            }

        } catch (SQLException e) {
            System.err.println("Error saat mengambil data mahasiswa by nama: " + e.getMessage());
        }

        return mahasiswaList;
    }


    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY id";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                mahasiswaList.add(mapResultSetToMahasiswa(rs));
            }

        } catch (SQLException e) {
            System.err.println("Error saat mengambil semua data mahasiswa: " + e.getMessage());
        }

        return mahasiswaList;
    }

  
    public boolean update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Error saat update data mahasiswa: " + e.getMessage());
            return false;
        }
    }


    public boolean delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Error saat hapus data mahasiswa: " + e.getMessage());
            return false;
        }
    }

  
    public boolean deleteByNama(String nama) {
        String sql = "DELETE FROM mahasiswa WHERE nama = ?";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, nama);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Error saat hapus data mahasiswa by nama: " + e.getMessage());
            return false;
        }
    }


    private Mahasiswa mapResultSetToMahasiswa(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

  
    public boolean isNamaExists(String nama) {
        String sql = "SELECT COUNT(*) FROM mahasiswa WHERE nama = ?";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, nama);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }

        } catch (SQLException e) {
            System.err.println("Error saat cek nama: " + e.getMessage());
        }

        return false;
    }

  
    public int getTotalMahasiswa() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";

        try (PreparedStatement stmt = koneksi.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            System.err.println("Error saat hitung total mahasiswa: " + e.getMessage());
        }

        return 0;
    }

 
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
            }
        } catch (SQLException e) {
            System.err.println("Error saat tutup koneksi: " + e.getMessage());
        }
    }

 
    public boolean isConnectionActive() {
        try {
            return koneksi != null && !koneksi.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}
