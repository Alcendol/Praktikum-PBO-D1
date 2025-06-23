/* Nama File    : Kucing.java
 * Deskripsi    : class Kucing
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/4/2025
 */ 

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(
            nama + " si Kucing bergerak dengan melata."
        );
    }

    @Override
    public void Bersuara() {
        System.out.println(
            nama + " si Kucing bersuara meong."
        );
    }
}
