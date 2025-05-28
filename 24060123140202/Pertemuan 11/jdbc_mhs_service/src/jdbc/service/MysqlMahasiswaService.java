package jdbc.service;

import jdbc.model.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.List;
import java.util.ArrayList;

/**
 * Service class untuk mengelola operasi CRUD Mahasiswa
 * Berperan sebagai controller yang menghubungkan program utama dengan basis data
 * Menggunakan pola Object Oriented dengan memanfaatkan model dan DB utility
 */
public class MysqlMahasiswaService {
    
    private Connection koneksi;
    private static final String URL = "jdbc:mysql://localhost:3307/PBO";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "160905";
    
    /**
     * Default Constructor
     * Menginisialisasi koneksi database langsung
     */
    public MysqlMahasiswaService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.koneksi = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error saat membuat koneksi database: " + e.getMessage());
        }
    }
    
    /**
     * Constructor dengan parameter untuk custom koneksi
     * @param url URL database
     * @param username Username database
     * @param password Password database
     */
    public MysqlMahasiswaService(String url, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.koneksi = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error saat membuat koneksi database: " + e.getMessage());
        }
    }
    
    /**
     * Method untuk membuat objek Mahasiswa baru
     * @return objek Mahasiswa kosong
     */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    /**
     * Method untuk membuat objek Mahasiswa dengan parameter
     * @param id ID mahasiswa
     * @param nama Nama mahasiswa
     * @return objek Mahasiswa yang sudah diisi
     */
    public Mahasiswa makeMhsObject(int id, String nama) {
        return new Mahasiswa(id, nama);
    }
    
    // ==================== CRUD OPERATIONS ====================
    
    /**
     * CREATE - Menambahkan data mahasiswa baru ke database
     * @param mhs objek Mahasiswa yang akan ditambahkan
     * @return true jika berhasil, false jika gagal
     */
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
    
    /**
     * READ - Mengambil data mahasiswa berdasarkan ID
     * @param id ID mahasiswa yang dicari
     * @return objek Mahasiswa jika ditemukan, null jika tidak ditemukan
     */
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
    
    /**
     * READ - Mengambil data mahasiswa berdasarkan nama
     * @param nama Nama mahasiswa yang dicari
     * @return List berisi objek Mahasiswa dengan nama yang mengandung keyword
     */
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
    
    /**
     * READ - Mengambil semua data mahasiswa
     * @return List berisi semua objek Mahasiswa
     */
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
    
    /**
     * UPDATE - Memperbarui data mahasiswa
     * @param mhs objek Mahasiswa dengan data terbaru
     * @return true jika berhasil, false jika gagal
     */
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
    
    /**
     * DELETE - Menghapus data mahasiswa berdasarkan ID
     * @param id ID mahasiswa yang akan dihapus
     * @return true jika berhasil, false jika gagal
     */
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
    
    /**
     * DELETE - Menghapus data mahasiswa berdasarkan nama
     * @param nama Nama mahasiswa yang akan dihapus
     * @return true jika berhasil, false jika gagal
     */
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
    
    // ==================== UTILITY METHODS ====================
    
    /**
     * Method untuk mapping ResultSet ke objek Mahasiswa
     * @param rs ResultSet dari query database
     * @return objek Mahasiswa
     * @throws SQLException jika terjadi error saat mapping
     */
    private Mahasiswa mapResultSetToMahasiswa(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }
    
    /**
     * Method untuk mengecek apakah mahasiswa dengan nama tertentu sudah ada
     * @param nama Nama yang akan dicek
     * @return true jika sudah ada, false jika belum ada
     */
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
    
    /**
     * Method untuk mendapatkan jumlah total mahasiswa
     * @return jumlah total mahasiswa
     */
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
    
    /**
     * Method untuk menutup koneksi database
     */
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
            }
        } catch (SQLException e) {
            System.err.println("Error saat tutup koneksi: " + e.getMessage());
        }
    }
    
    /**
     * Method untuk mendapatkan status koneksi database
     * @return true jika koneksi aktif, false jika tidak
     */
    public boolean isConnectionActive() {
        try {
            return koneksi != null && !koneksi.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}