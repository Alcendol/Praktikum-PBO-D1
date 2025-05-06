/*
 * Nama : Raditya Saputra
 * NIM : 24060123140140
 * Nama File : Anjing.java
 * Tanggal : 6 Mei2025
 */
public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing " + " Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + " Guk Guk");
    }
    
}
