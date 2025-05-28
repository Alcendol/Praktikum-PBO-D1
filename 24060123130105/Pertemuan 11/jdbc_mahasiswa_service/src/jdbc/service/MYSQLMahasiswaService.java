/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import jdbc.model.Mahasiswa;
import jdbc.utlities.MYSQLUtility;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
/**
 *
 * @author nadzif
 */
public class MYSQLMahasiswaService {
    Connection koneksi = null;
    
    public MYSQLMahasiswaService(){
        this.koneksi = MYSQLUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa mhs){
        try {
            String sql = "INSERT INTO mahasiswa VALUES (?, ?)";
            PreparedStatement st = koneksi.prepareStatement(sql);
            st.setInt(1, mhs.getId());
            st.setString(2, mhs.getNama());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void update(Mahasiswa mhs){
        try {
            String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement st = koneksi.prepareStatement(sql);
            st.setString(1, mhs.getNama());
            st.setInt(2, mhs.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void delete(int id){
        try {
            String sql = "DELETE FROM mahasiswa WHERE id = ?";
            PreparedStatement st = koneksi.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
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
            System.out.println(e.toString());;
        }
        return mhs;
    }
    
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
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
}
