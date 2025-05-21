/*
 * Nama File    : Anjing.java
 * Deskripsi    : Subkelas Anabul yang mengimplementasikan cara bergerak dan bersuara untuk anjing.
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 26 april 2025
 */

 class Anjing extends Anabul {


    public Anjing(String nama) {
        super(nama);
    }


    @Override
    public void gerak() {
        System.out.println(
            nama + " (Anjing) bergerak dengan melata."
        );
    }


    @Override
    public void bersuara() {
        System.out.println(
            nama + " (Anjing) bersuara: Gukguk.."
        );
    }

}