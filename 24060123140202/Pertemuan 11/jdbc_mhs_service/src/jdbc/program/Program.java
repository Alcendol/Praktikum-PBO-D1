/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author mfirz
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println();

        // === Insert ===
        System.out.println("=== Insert ===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd);
        displayAll();

        // === Update ===
        System.out.println("=== Update ===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("Dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // === Delete ===
        System.out.println("=== Delete ===");
        System.out.println("Akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    static void displayAll() {
        List<Mahasiswa> listMhs = service.getAll();
        System.out.println("=== Display All ===");
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
    }
}
