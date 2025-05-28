/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : Main.java
 * Tanggal : 27 April 2025
 */
public class Main {
    public static void main(String[] args) {
        Anabul anabul = new Anjing("Doggo");
        anabul.gerak();
        anabul.bersuara();


        Anabul anabul2 = new Kucing("Liam");
        anabul2.gerak();
        anabul2.bersuara();

        Anabul anabul3 = new Burung("Chirp");
        anabul3.gerak();
        anabul3.bersuara();
    }
}
