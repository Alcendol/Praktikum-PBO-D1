/*
 * Nama File    : Burung.java
 * Deskripsi    : Subclass Anabul untuk burung, 
 *                override gerak() dan bersuara().
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 26 April 2025
 */
package per9;

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
