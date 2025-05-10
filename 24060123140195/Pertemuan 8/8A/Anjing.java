/*
 * Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing yang merupakan turunan dari Anabul, dengan implementasi metode gerak dan bersuara.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 27 April 2025
 */
public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing " + " Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + " Guk Guk");
    }

}

