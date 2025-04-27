/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : Kucing.java
 * Tanggal : 27 April 2025
 */
public class Kucing extends Anabul {


    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + " Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + " Meong");
    }
    
}
