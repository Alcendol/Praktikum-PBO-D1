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
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException{
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
                mhs = makeMhsObject(rs);
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
                list.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
