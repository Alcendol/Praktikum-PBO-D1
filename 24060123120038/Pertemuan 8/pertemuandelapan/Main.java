package pertemuandelapan;

/*  Nama File   : Main.java
 *  Deskripsi   : Program utama untuk mensimulasikan perilaku hewan peliharaan menggunakan kelas Anabul
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 07 Mei 2025
*/

import pertemuandelapan.Anabul;
import pertemuandelapan.Kucing;
import pertemuandelapan.Anjing;
import pertemuandelapan.Burung;
import pertemuandelapan.Datum;

public class Main {
    public static void main(String[] args) {
        Datum<Anabul> datumKucing = new Datum<>(new Kucing("Nico"));
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing("Nepa"));
        Datum<Anabul> datumBurung = new Datum<>(new Burung("Nara"));

        System.out.println("Kucing:");
        datumKucing.getIsi().bergerak();
        datumKucing.getIsi().bersuara();

        System.out.println("\nAnjing:");
        datumAnjing.getIsi().bergerak();
        datumAnjing.getIsi().bersuara();

        System.out.println("\nBurung:");
        datumBurung.getIsi().bergerak();
        datumBurung.getIsi().bersuara();
    }
}
