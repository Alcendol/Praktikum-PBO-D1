/*
 * Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak untuk hewan peliharaan (Anabul) dengan method abstract gerak() dan bersuara().
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 26 april 2025
 */

 abstract class Anabul {

    protected String nama;


    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }


    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    // Method abstract yang akan diimplementasikan oleh kelas turunan
    public abstract void gerak();

    public abstract void bersuara();

}
