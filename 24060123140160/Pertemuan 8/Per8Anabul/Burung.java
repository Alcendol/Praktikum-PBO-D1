/*
 * File         : Burung.java
 * Deskripsi    : turunan Anabul – bunyi cuit, gerak terbang
 */
package per8;

public class Burung extends Anabul {

    public Burung(String nama) { super(nama); }

    @Override public void bersuara() { System.out.println("Burung " + nama + " cuit"); }
    @Override public void bergerak() { System.out.println("Burung " + nama + " terbang"); }
}
