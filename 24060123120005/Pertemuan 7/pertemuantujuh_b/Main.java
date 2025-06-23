/*
 * Nama File : Main.java
 * Deskripsi : Main Class yang menguji polimorfisme inclusion pada Anabul
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Anabul> daftarAnabul = new ArrayList<>();
        daftarAnabul.add(new Kucing("Kookie"));
        daftarAnabul.add(new Anjing("Sally"));
        daftarAnabul.add(new Burung("Nicky"));

        for (Anabul a : daftarAnabul) {
            a.gerak();
            a.bersuara();
            System.out.println(); // Ini buat spasi antar anabulnya aja
        }
    }
}
