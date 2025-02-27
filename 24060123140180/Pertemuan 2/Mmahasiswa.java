// Nama File : Mmahasiswa.java
// Deskripsi : berisis implementasi atribut dan method dalam class Mahasiswa, Dosen, Kendaraan, dan Matkul
// Pembuat   : Pramudya Jati Pamungkas
// Tanggal   : 27 Februari 2025

public class Mmahasiswa {
    public static void main(String[] args) {
        // Objek Dosen
        Dosen D1 = new Dosen("10098", "Suparyo", "Sastra Mesin");
        Dosen D2 = new Dosen("10099", "Sutrisno", "Teknik Filsafat");

        // Objek Kendaraan
        Kendaraan K1 = new Kendaraan("H 30401 BCA", "Motor");
        Kendaraan K2 = new Kendaraan("B 8008 S", "Mobil");

        // Objek Mata Kuliah
        Matkul M1 = new Matkul("IF1210", "Pemrograman Marxisme", 3);
        Matkul M2 = new Matkul("IF1211", "Pemrograman Kapitalisme", 4);
        Matkul M3 = new Matkul("IF1212", "Pemrograman Sosialisme", 4);

        // Objek Mahasiswa
        Mahasiswa Mhs1 = new Mahasiswa("2020101001", "Budi", "Teknik Filsafat", D2, K1);
        Mahasiswa Mhs2 = new Mahasiswa("2020101002", "Susi", "Teknik Filsafat", D1, K2);
        Mahasiswa Mhs3 = new Mahasiswa("2020101003", "Joko", "Kedokteran Reaktor", D2, K1);
        // Menambahkan Mata Kuliah ke Mahasiswa
        Mhs1.addmatkul(M1);
        Mhs1.addmatkul(M3);
        Mhs2.addmatkul(M1);
        Mhs2.addmatkul(M2);
        Mhs2.addmatkul(M3);
        Mhs3.addmatkul(M2);
        Mhs3.addmatkul(M3);
        

        // Mengatur relasi
        Mhs1.setDosenWali(D2);
        Mhs2.setDosenWali(D2);
        Mhs3.setDosenWali(D1);
        Mhs1.setKendaraan(K1);
        Mhs2.setKendaraan(K2);
        Mhs3.setKendaraan(K1); // Kendaraan K1 sudah dimiliki oleh Mhs1
        
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
