/*
 * Nama File    : Anabul.java
 * Deskripsi    : Program untuk class anabul
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }
}
