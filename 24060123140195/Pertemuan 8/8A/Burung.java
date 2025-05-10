/*
 * Nama File    : Burung.java
 * Deskripsi    : Kelas Burung yang merupakan turunan dari Anabul, menambahkan metode terbang dan bersuara.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 27 April 2025
 */
public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    public void terbang() {
        System.out.println("Burung "  + " Terbang");
    }

    public void bersuara() {
        System.out.println("Burung "  + " Cuit cuit");
    }
}
