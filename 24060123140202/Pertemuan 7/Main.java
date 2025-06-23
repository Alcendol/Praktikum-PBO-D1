/*
 * Nama File    : Main.java
 * Deskripsi    : Program untuk testing
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Anabul> daftarAnabul = new ArrayList<>();

        daftarAnabul.add(new Kucing("Mimi"));
        daftarAnabul.add(new Anjing("Doggy"));
        daftarAnabul.add(new Burung("Coco"));

        for (Anabul a : daftarAnabul) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}
