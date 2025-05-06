/*
 * Nama File : Anjing.java
 * Deskripsi : Subclass dari Anabul yang merepresentasikan hewan anjing 
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}
