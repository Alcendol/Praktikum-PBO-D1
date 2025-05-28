/*
 * File         : DemoGenerik.java
 * Deskripsi    : demo Holder generik + metode generik UtilAnabul
 */
package per8;

public class DemoGenerik {
    public static void main(String[] args) {

        Holder<Kucing>  kotakKucing  = new Holder<>();
        kotakKucing.simpan(new Kucing("Luna"));

        Holder<Anjing>  kotakAnjing  = new Holder<>();
        kotakAnjing.simpan(new Anjing("Bingo"));

        Holder<Burung>  kotakBurung  = new Holder<>();
        kotakBurung.simpan(new Burung("Rio"));

        UtilAnabul.tampilkan(kotakKucing);
        UtilAnabul.tampilkan(kotakAnjing);
        UtilAnabul.tampilkan(kotakBurung);
    }
}
