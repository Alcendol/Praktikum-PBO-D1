/* Nama File   : MMahasiswa.java
 * Deskripsi   : Kelas utama untuk menguji implementasi kelas Mahasiswa dan relasinya dengan MataKuliah, Dosen, serta Kendaraan.
 * Pembuat     : Pieter Mikha Pangondian Partogi Sihombing/24060123140160
 * Tanggal     : Senin, 3 Februari 2025
 */

 package tugas2;

 public class MMahasiswa {
     public static void main(String[] args) {
         // Membuat objek MataKuliah dengan parameter
         MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
         MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
         
         // Membuat objek Mahasiswa dengan data dasar
         Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
         
         // Membuat objek Dosen dan Kendaraan untuk relasi
         Dosen D1 = new Dosen("123", "Andi", "Informatika");
         Kendaraan K1 = new Kendaraan("H3809BBM", "Motor");
         
         // Menghubungkan objek-objek sesuai relasi yang ditentukan
         M1.setDosenWali(D1);
         M1.setKendaraan(K1);
         M1.addMatkul(PBO);
         M1.addMatkul(MBD);
         
         // Mencetak detail lengkap mahasiswa dan informasi tambahan
         M1.printDetailMhs();
         System.out.println("Jumlah Mata Kuliah = " + M1.getJumlMatkul());
         System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlSKS());
     }
 }
 