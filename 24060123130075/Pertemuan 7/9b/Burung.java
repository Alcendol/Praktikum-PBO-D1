/* Nama File    : Burung.java
 * Deskripsi    : class Burung
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/4/2025
 */ 

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(
            nama + " si Burung bergerak dengan terbang."
        );
    }

    @Override
    public void Bersuara() {
        System.out.println(
            nama + " si Burung bersuara cuit."
        );
    }
}
