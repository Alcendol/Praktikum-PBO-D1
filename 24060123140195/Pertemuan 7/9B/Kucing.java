/*
 * Nama File    : Kucing.java
 * Deskripsi    : Subkelas Anabul yang mengimplementasikan cara bergerak dan bersuara untuk kucing.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 26 april 2025
 */

 class Kucing extends Anabul {


    public Kucing(String nama) {
        super(nama);
    }


    @Override
    public void gerak() {
        System.out.println(
            nama + " (Kucing) bergerak dengan melata."
        );
    }


    @Override
    public void bersuara() {
        System.out.println(
            nama + " (Kucing) bersuara: Meong...."
        );
    }

}

