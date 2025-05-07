/*
 * File         : Anjing.java
 * Ringkasan    : fondasi abstrak untuk tiap hewan peliharaan
 * Penulis      : Muhammad Paruda Pradayan / 24060123140124
 * Tgl          : 5 Mei 2025
 */


package anabulhewan;

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