/*
 * File         : Kucing.java
 * Deskripsi    : turunan Anabul – bunyi meong, gerak melata
 */
package per8;

public class Kucing extends Anabul {

    public Kucing(String nama) { super(nama); }

    @Override public void bersuara() { System.out.println("Kucing " + nama + " meong"); }
    @Override public void bergerak() { System.out.println("Kucing " + nama + " melata"); }
}
