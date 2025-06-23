/*
 * Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak Anabul mewakili hewan peliharaan, 
 *                dengan method abstrak gerak() dan bersuara().
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 26 April 2025
 */
package per9;

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama=nama;
    }
    public abstract void gerak();

    public abstract void bersuara();
}
