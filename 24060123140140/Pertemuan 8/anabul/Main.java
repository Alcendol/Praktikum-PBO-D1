/*
 * Nama : Raditya Saputra
 * NIM : 24060123140140
 * Nama File : Main.java
 * Tanggal : 6 Mei 2025
 */

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing("Owen"));

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing("Snowwy"));

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung("Ocong"));

        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}
