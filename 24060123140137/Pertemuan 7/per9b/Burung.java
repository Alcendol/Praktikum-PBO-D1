/*
 * Nama File    : Burung.java
 * Deskripsi    : Subclass Anabul untuk burung, 
 *                override gerak() dan bersuara().
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */

public class Burung extends Anabul {

    public Burung() {
        super("Burung");
    }

    @Override
    public void bersuara() {
        System.out.println(nama+" cuit...");
    }

    @Override
    public void gerak() {
        System.out.println(nama+" terbang...");
    }
}