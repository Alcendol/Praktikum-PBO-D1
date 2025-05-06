/*
 * Nama : Raditya Saputra
 * NIM : 24060123140140
 * Nama File : ContohMetodeGenerik.java
 * Tanggal : 6 Mei 2025
 */
class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.bersuara();
        hewan.gerak();
        System.out.println(); 
    }
}
