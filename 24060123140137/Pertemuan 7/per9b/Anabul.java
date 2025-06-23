/*
 * Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak Anabul mewakili hewan peliharaan, 
 *                dengan method abstrak gerak() dan bersuara().
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */


public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama=nama;
    }
    public abstract void gerak();

    public abstract void bersuara();
}