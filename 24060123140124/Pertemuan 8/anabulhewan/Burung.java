/*
 * File         : Burung.java
 * Ringkasan    : fondasi abstrak untuk tiap hewan peliharaan
 * Penulis      : Muhammad Paruda Pradayan / 24060123140124
 * Tgl          : 5 Mei 2025
 */


package anabulhewan;

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
