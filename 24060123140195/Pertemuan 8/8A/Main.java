/*
 * Nama File    : Main.java
 * Deskripsi    : Program utama untuk menguji perilaku berbagai jenis hewan menggunakan kelas Datum dan ContohMetodeGenerik.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 27 April 2025
 */
public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing("liam"));

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing("lawson"));

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung("oscar"));

        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}
