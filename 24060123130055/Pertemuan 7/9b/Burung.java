/*
 File         : Burung.java
 Deskripsi    : Subclass Anabul yang mewakili burung, dengan implementasi Gerak dan Bersuara yang spesifik.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: cuit!");
    }
}
