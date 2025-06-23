/*
 * Nama File    : Kucing.java
 * Deskripsi    : Program untuk class kucing
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong.");
    }
}