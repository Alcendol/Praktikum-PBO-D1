/*
 * File         : UtilAnabul.java
 * Deskripsi    : contoh metode generik yang memproses Holder<Anabul>
 */
package per8;

public class UtilAnabul {

    // T harus turunan Anabul
    public static <T extends Anabul> void tampilkan(Holder<T> h) {
        T hewan = h.ambil();
        hewan.bersuara();
        hewan.bergerak();
        System.out.println();       // baris kosong pemisah
    }
}