/*
 * Nama : Raditya Saputra
 * NIM : 24060123140140
 * Nama File : Kucing.java
 * Tanggal : 6 Mei 2025
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
