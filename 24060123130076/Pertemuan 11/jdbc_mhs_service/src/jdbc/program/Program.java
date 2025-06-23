/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        MysqlMahasiswaService service = new MysqlMahasiswaService();

        try {
            // Tambah mahasiswa
            service.insert(new Mahasiswa("Nina"));
            service.insert(new Mahasiswa("Rudi"));
            service.insert(new Mahasiswa("Beni"));

            // Tampilkan semua
            List<Mahasiswa> mhsList = service.getAll();
            for (Mahasiswa m : mhsList) {
                System.out.println(m.getId() + " - " + m.getNama());
            }

            // Ubah nama Rudi jadi Agus (asumsi ID Rudi = 2)
            service.update(new Mahasiswa(2, "Agus"));

            // Hapus Beni (asumsi ID Beni = 3)
            service.delete(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
