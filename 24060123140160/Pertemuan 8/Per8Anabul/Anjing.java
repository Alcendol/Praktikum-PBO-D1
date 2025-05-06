/*
 * File         : Anjing.java
 * Deskripsi    : turunan Anabul – bunyi guk‑guk, gerak melata
 */
package per8;

public class Anjing extends Anabul {

    public Anjing(String nama) { super(nama); }

    @Override public void bersuara() { System.out.println("Anjing " + nama + " guk‑guk"); }
    @Override public void bergerak() { System.out.println("Anjing " + nama + " melata"); }
}
