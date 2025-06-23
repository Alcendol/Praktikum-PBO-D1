/* Nama File    : Anjing.java
 * Deskripsi    : class Anjing
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/4/2025
 */ 

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(
            nama + " si Anjing bergerak dengan melata."
        );
    }

    @Override
    public void Bersuara() {
        System.out.println(
            nama + " si Anjing bersuara guk-guk."
        );
    }
}
