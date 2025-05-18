/*
 * Nama File : ContohMetodeGenerik.java
 * Deskripsi : Kelas dengan metode generik untuk mengendalikan objek Datum<T>
 * Pembuat   : Patricia Gabrielle Yudianto
 * Tanggal   : 6 Mei 2025
 */
public class ContohMetodeGenerik {
    /**
     * Menampilkan gerak dan suara setiap Anabul
     * @param data Datum yang mengemas objek Anabul apa saja
     */
    public <T extends Anabul> void tampilkanGerakDanSuara(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.gerak();
        hewan.bersuara();
    }
}
