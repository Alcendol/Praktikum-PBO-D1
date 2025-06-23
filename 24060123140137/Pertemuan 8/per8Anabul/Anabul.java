/*
 * File         : Anabul.java
 * Ringkasan    : fondasi abstrak untuk tiap hewan peliharaan
 * Penulis      : Noval Putra Barliyanda / 24060123140137
 * Tgl          : 5 Maret 2025
 */
package per8;

public abstract class Anabul {
    protected String nama;

    protected Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void bergerak();   
    public abstract void bersuara();   
}