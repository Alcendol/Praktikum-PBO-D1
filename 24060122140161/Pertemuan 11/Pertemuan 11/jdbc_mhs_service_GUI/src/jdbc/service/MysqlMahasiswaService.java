/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    public void insert(Mahasiswa m) throws SQLException {
        String sql = "INSERT INTO mahasiswa(nama) VALUES(?)";
        try (Connection conn = MysqlUtility.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, m.getNama());
            stmt.executeUpdate();
        }
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Connection conn = MysqlUtility.getConnection(); 
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        }
        return list;
    }

    public void update(Mahasiswa m) throws SQLException {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (Connection conn = MysqlUtility.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, m.getNama());
            stmt.setInt(2, m.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (Connection conn = MysqlUtility.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    public List<Mahasiswa> selectAll() throws SQLException {
    List<Mahasiswa> list = new ArrayList<>();
    Connection conn = MysqlUtility.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM mahasiswa");
    while (rs.next()) {
        Mahasiswa m = new Mahasiswa();
        m.setId(rs.getInt("id"));
        m.setNama(rs.getString("nama"));
        list.add(m);
    }
    conn.close();
    return list;
}

}

