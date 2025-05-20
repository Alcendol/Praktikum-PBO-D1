/*
 File         : Anjing.java
 Deskripsi    : Subclass Anabul yang mewakili anjing, dengan implementasi Gerak dan Bersuara yang spesifik.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan 4 kaki.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: guk-guk!");
    }
}