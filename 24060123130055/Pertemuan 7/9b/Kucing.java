/*
 File         : Kucing.java
 Deskripsi    : Subclass Anabul yang mewakili kucing, dengan implementasi Gerak dan Bersuara yang spesifik.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan 4 kaki.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: meong!");
    }
}