/* Nama File : Main.java
 * Deskripsi : Berisi atribut dan method Main
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan;
    
import pertemuanDelapan.Anabul;
import pertemuanDelapan.Kucing;
import pertemuanDelapan.Anjing;
import pertemuanDelapan.Burung;
import pertemuanDelapan.Datum;

public class Main {
    public static void main(String[] args) {
        Datum<Anabul> datumKucing = new Datum<>(new Kucing("Wiwi"));
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing("Rocky"));
        Datum<Anabul> datumBurung = new Datum<>(new Burung("Rainbow"));
        
        

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
