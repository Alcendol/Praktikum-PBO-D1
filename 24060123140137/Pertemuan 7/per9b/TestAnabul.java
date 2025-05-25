/*
 * Nama File    : TestAnabul.java
 * Deskripsi    : Program utama untuk mensimulasikan
 *                bunyi dan gerakan setiap jenis Anabul.
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */

public class TestAnabul {
    public static void main(String[] args) {
        Anabul kucing=new Kucing();
        Anabul anjing=new Anjing();
        Anabul burung=new Burung();
        kucing.bersuara();
        kucing.gerak();

        anjing.bersuara();
        anjing.gerak();

        burung.bersuara();
        burung.gerak();
    }
}