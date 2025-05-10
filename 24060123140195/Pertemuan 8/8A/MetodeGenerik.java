/*
 * Nama File    : ContohMetodeGenerik.java
 * Deskripsi    : Contoh penerapan metode generik untuk menampilkan perilaku hewan yang menggunakan kelas Datum.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 5 Mei 2025
 */
class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.bersuara();
        hewan.gerak();
        System.out.println(); 
    }
}
