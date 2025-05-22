/*
 * Nama File    : Kucing.java
 * Deskripsi    : Subclass Anabul untuk kucing, 
 *                override gerak() dan bersuara().
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
  * Tanggal      : 26 April 2025
 */
package per9;

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
