/*
 * File         : ContohMetodeGenerik.java
 * Ringkasan    : fondasi abstrak untuk tiap hewan peliharaan
 * Penulis      : Muhammad Paruda Pradayan / 24060123140124
 * Tgl          : 5 Mei 2025
 */


package anabulhewan;

public class ContohMetodeGenerik {

    /** 
     * Contoh method generik tanpa bound: hanya menampilkan toString() dari isi Datum 
     */
    public static <T> void tampilDatum(Datum<T> d) {
        System.out.println("Isi datum: " + d.getIsi());
    }

    /** 
     * Contoh method generik dengan bound T extends Anabul:
     * memanggil gerak() dan bersuara() pada objek Anabul di dalam Datum 
     */
    public static <T extends Anabul> void kontrolHewan(Datum<T> d) {
        T hewan = d.getIsi();
        System.out.println(">>> Kontrol untuk: " + hewan.getNama());
        hewan.Gerak();
        hewan.Bersuara();
        System.out.println();
    }
}