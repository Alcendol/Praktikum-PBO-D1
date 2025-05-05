/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : Anjing.java
 * Tanggal : 27 April 2025
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
