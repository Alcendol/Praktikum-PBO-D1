/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc_mahasiswa_service;
import jdbc.model.*;
import jdbc.service.*;
import java.util.*;
/**
 *
 * 
 */
public class Jdbc_mahasiswa_service {

    /**
     * @param args the command line arguments
     */
    static MYSQLMahasiswaService service = new MYSQLMahasiswaService();

    public static void displayAll() {
        List<Mahasiswa> list = service.getAll();
        System.out.println("== Data Mahasiswa ==");
        for (Mahasiswa mhs : list) {
            System.out.println(mhs.toString());
        }
    }

    public static void main(String[] args) {
        //List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

}
