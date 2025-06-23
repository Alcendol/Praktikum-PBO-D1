/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author Jati
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    //Constructor
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    //Membuat objek mahasiswa
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    //Menambahkan data mahasiswa
    public void add(Mahasiswa mhs){
        try {
            String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Update data mahasiswa
    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Menghapus data mahasiswa berdasarkan id
    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id = ?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Mengambil mahasiswa berdasarkan id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id = ?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }
    
    //Mengambil semua data mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return list;
    }
    
    //Mendapatkan ID berikutnya (ID terbesar + 1)
    public int getNextId() {
        int nextId = 1; // ID default mulai dari 1
        try {
            String sql = "SELECT MAX(id) as max_id FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int maxId = rs.getInt("max_id");
                nextId = maxId + 1;
            }
        } catch (SQLException e) {
            System.out.println("Error getting next ID: " + e.toString());
        }
        return nextId;
    }
    
}
