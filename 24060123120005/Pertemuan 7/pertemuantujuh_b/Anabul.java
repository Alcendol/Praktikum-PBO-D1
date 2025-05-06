/*
 * Nama File : Anabul.java
 * Deskripsi : Superclass yang merepresentasikan hewan peliharaan
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();

    public abstract void bersuara();

}