/* Nama File : MMahasiswa.java
 * Deskripsi : Berisi main dari mahasiswa
 * Pembuat : Muhammad Firzi Ryadi/24060123140202
 * Tanggal : Rabu, 26 Februari 2025
 */
package p1;

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data",3);
        Mahasiswa M1 = new Mahasiswa("234","Citra","Informatika");
        Dosen D1 = new Dosen("123", "Andi","Informatika");
        Kendaraan K1 = new Kendaraan("H3809BBM","Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlSKS());
    }
}
