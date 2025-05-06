/*
 * Nama File : Burung.java
 * Deskripsi : Subclass dari Anabul yang merepresentasikan hewan burung
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    public void bersuara(){
        System.out.println(nama + " bersuara cuit");
    }
}