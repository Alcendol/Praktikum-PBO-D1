/*
 * File         : Anabul.java
 * Ringkasan    : fondasi abstrak untuk tiap hewan peliharaan
 * Penulis      : Pieter Mikha Pangondian Partogi S / 24060123140160
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
