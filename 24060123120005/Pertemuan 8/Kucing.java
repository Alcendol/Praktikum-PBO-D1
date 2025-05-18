/*
 * Nama File : Kucing.java
 * Deskripsi : Subclass dari Anabul yang merepresentasikan hewan kucing
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara meong");
    }
}
