/* Nama File    : Anabul.java
 * Deskripsi    : class abstract Anabul
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/4/2025
 */ 

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