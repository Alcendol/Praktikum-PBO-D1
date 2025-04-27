/* Nama File    : HewanMain.java
 * Deskripsi    : main Anabul
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/4/2025
 */ 

public class HewanMain {
    public static void main(String[] args) {
        Anabul[] anabuls = {
            new Kucing("Kitty"),
            new Anjing("Bruno"),
            new Burung("Tweety")
        };

        for (Anabul anabul : anabuls) {
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println();
        }
    }
}
