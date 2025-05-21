/*
 * Nama File    : AnabulMain.java
 * Deskripsi    : Kelas utama untuk mensimulasikan gerakan dan suara berbagai hewan peliharaan Anabul.
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 26 april 2025
 */

 public class AnabulMain {


    public static void main(String[] args) {
        // Membuat array dari objek Anabul
        Anabul[] hewanPeliharaan = new Anabul[3];


        // Inisialisasi objek
        hewanPeliharaan[0] = new Kucing("dono");
        hewanPeliharaan[1] = new Anjing("kasino");
        hewanPeliharaan[2] = new Burung("indro");


        // Memanggil method untuk semua objek
        System.out.println("=== SIMULASI ANABUL ===");

        for (Anabul hewan : hewanPeliharaan) {
            System.out.println();
            System.out.println("Nama: " + hewan.getNama());
            hewan.gerak();
            hewan.bersuara();
        }
    }

}