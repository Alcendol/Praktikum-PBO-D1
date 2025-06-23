/*
 * Nama File    : Kucing.java
 * Deskripsi    : Subclass Anabul untuk kucing, 
 *                override gerak() dan bersuara().
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
  * Tanggal      : 26 April 2025
 */

public class Kucing extends Anabul {
    public Kucing() {
        super("Kucing");
    }

    @Override
    public void bersuara() {
        System.out.println(nama+" meong...");
    }

    @Override
    public void gerak() {
        System.out.println(nama+" melata...");
    }
}