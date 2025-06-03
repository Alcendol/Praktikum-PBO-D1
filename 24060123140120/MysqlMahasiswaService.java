/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author ThinkPad T14s
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    private Connection koneksi;

    public MysqlMahasiswaService() {
        try {
            koneksi = MysqlUtility.getConnection();
        } catch (Exception e) {
            System.out.println("Gagal koneksi ke database: " + e.getMessage());
        }
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, mhs.getId());  
            stmt.setString(2, mhs.getNama());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());
            int affected = stmt.executeUpdate();
            if (affected == 0) {
                System.out.println("Update gagal: ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id=?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
                list.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
