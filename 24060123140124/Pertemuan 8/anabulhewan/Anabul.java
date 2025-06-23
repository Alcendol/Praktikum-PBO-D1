/*
 * File         : Anabul.java
 * Ringkasan    : fondasi abstrak untuk tiap hewan peliharaan
 * Penulis      : Muhammad Paruda Pradayan / 24060123140124
 * Tgl          : 5 Mei 2025
 */

package anabulhewan;

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}