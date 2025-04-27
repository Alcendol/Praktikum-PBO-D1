/*
 File         : main.java
 Deskripsi    : Program utama untuk mensimulasikan gerak dan suara setiap tipe Anabul.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class main {
    public static void main(String[] args) {
        Anabul[] peliharaan = {
            new Kucing("Saki"),
            new Anjing("Hachi"),
            new Burung("Cici")
        };

        for (Anabul hewan : peliharaan) {
            hewan.Bersuara();
            hewan.Gerak();
            System.out.println();
        }
    }
}