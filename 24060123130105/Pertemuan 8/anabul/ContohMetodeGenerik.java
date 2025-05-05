/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : ContohMetodeGenerik.java
 * Tanggal : 5 Mei 2025
 */
class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.bersuara();
        hewan.gerak();
        System.out.println(); 
    }
}
