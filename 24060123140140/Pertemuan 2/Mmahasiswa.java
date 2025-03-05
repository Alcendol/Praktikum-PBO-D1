/*
 * Nama File : Mmahasiswa.java
 * Deskripsi : berisis atribut dan method dalam class Mahasiswa, Dosen, Kendaraan, dan Matkul
 * Pembuat   : Raditya Saputra/24060123140140
 * Tanggal   : 27 Februari 2025
 */

public class Mmahasiswa {
    public static void main(String[] args) {
        // Objek Dosen
        Dosen D1 = new Dosen("10098", "Aladin", "Sastra India");
        Dosen D2 = new Dosen("10099", "Bejo", "Informatika");

        // Objek Kendaraan
        Kendaraan K1 = new Kendaraan("B 15 A", "Motor");
        Kendaraan K2 = new Kendaraan("B 805 JO", "Mobil");

        // Objek Mata Kuliah
        Matkul M1 = new Matkul("IF1210", "Pemrograman Berbasis Komputer", 3);
        Matkul M2 = new Matkul("IF1211", "Aljabar Linear", 4);
        Matkul M3 = new Matkul("IF1212", "Statistika", 4);

        // Objek Mahasiswa
        Mahasiswa Mhs1 = new Mahasiswa("2040103001", "Paruda", "Informatika", D2, K1);
        Mahasiswa Mhs2 = new Mahasiswa("2040103002", "Ondi", "Informatika", D1, K2);
        Mahasiswa Mhs3 = new Mahasiswa("2040103003", "Ojan", "Informatika", D2, K1);
        // Menambahkan Mata Kuliah ke Mahasiswa
        Mhs1.addmatkul(M1);
        Mhs1.addmatkul(M3);
        Mhs2.addmatkul(M1);
        Mhs2.addmatkul(M2);
        Mhs2.addmatkul(M3);
        Mhs3.addmatkul(M2);
        Mhs3.addmatkul(M3);
        Mhs3.addmatkul(M1);


        // Mengatur relasi
        Mhs1.setDosenWali(D2);
        Mhs2.setDosenWali(D2);
        Mhs3.setDosenWali(D1);
        Mhs1.setKendaraan(K1);
        Mhs2.setKendaraan(K2);
        Mhs3.setKendaraan(K1); 
        // Kendaraan K1 sudah dimiliki oleh Mahasiswa 1
        
        // Menampilkan Data Mahasiswa
        System.out.println("\nMHS 1");
        Mhs1.printDetailMhs();
        System.out.println("\nMHS 2");
        Mhs2.printDetailMhs();
        System.out.println("\nMHS 3");
        Mhs3.printDetailMhs();

        System.out.println("\nTotal SKS dan Matkul Mahasiswa 1 & 2");
        System.out.println("Total SKS MHS 1: " + Mhs1.getJumlahSks());
        System.out.println("Total SKS MHS 2: " + Mhs2.getJumlahSks());
        System.out.println("Jumlah Mata Kuliah MHS 1: " + Mhs1.getJumlahMatkul());
        System.out.println("Jumlah Mata Kuliah MHS 2: " + Mhs2.getJumlahMatkul());
    }
    
}
