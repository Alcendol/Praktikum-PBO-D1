/*
 * Nama File    : Anjing.java
 * Deskripsi    : Subclass Anabul untuk anjing, 
 *                override gerak() dan bersuara().
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 26 April 2025
 */
package per9;

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
