/*
 * Nama File    : Anjing.java
 * Deskripsi    : Subclass Anabul untuk anjing, 
 *                override gerak() dan bersuara().
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */

public class Anjing extends Anabul {

    public Anjing() {
        super("Anjing");
    }

    @Override
    public void bersuara() {
        System.out.println(nama+" guk-guk...");
    }

    @Override
    public void gerak() {
        System.out.println(nama+" melata...");
    }
}