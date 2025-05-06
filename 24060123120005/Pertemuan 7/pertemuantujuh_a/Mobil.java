/*
 * Nama File : Mobil.java
 * Deskripsi : Contoh untuk Ad Hoc - Overloading
 * Pembuat : Patricia Gabrielle Yudianto
 * Tanggal : 27 April 2025
 */

public class Mobil {
    private int ukuranRoda;
    private String bentuk;

    public Mobil() {

    }

    public Mobil(int ukuranRoda, String bentuk) {
        this.ukuranRoda = ukuranRoda;
        this.bentuk = bentuk;
    }

    public void infoMobil() {
        System.out.println("Ini adalah mobil");
    }

    public void infoMobil(int kali) {
        int i = 0;
        for (i = 0; i < kali; i++) {
            System.out.println("Ini adalah mobil");
        }
    }
}
