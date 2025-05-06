/*
 * Nama File : MainGenerik.java
 * Deskripsi : Program utama untuk menguji Datum<T> dan ContohMetodeGenerik
 * Pembuat   : Patricia Gabrielle Yudianto
 * Tanggal   : 6 Mei 2025
 */
public class MainGenerik {
    public static void main(String[] args) {
        // Buat Datum berisi berbagai Anabul
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Mimi"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Doggo"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Tweety"));

        // Gunakan ContohMetodeGenerik untuk simulasi
        ContohMetodeGenerik cmg = new ContohMetodeGenerik();

        System.out.println("=== Simulasi dengan ContohMetodeGenerik ===");
        cmg.tampilkanGerakDanSuara(datumKucing);
        cmg.tampilkanGerakDanSuara(datumAnjing);
        cmg.tampilkanGerakDanSuara(datumBurung);
    }
}
