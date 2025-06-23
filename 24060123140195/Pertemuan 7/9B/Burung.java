/*
 * Nama File    : Burung.java
 * Deskripsi    : Subkelas Anabul yang mengimplementasikan cara bergerak dan bersuara untuk burung.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 26 april 2025
 */

 class Burung extends Anabul {


    public Burung(String nama) {
        super(nama);
    }


    @Override
    public void gerak() {
        System.out.println(
            nama + " (Burung) bergerak dengan terbang."
        );
    }


    @Override
    public void bersuara() {
        System.out.println(
            nama + " (Burung) bersuara: Cuit!"
        );
    }

}
