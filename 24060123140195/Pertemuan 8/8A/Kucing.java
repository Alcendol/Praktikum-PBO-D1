/*
 * Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing yang merupakan turunan dari Anabul, dengan implementasi metode gerak dan bersuara.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 27 April 2025
 */
public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + " Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + " Meong");
    }

}
