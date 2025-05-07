package AnabulHewan;

public class AnabulMain {
    public static void main(String[] args) {
        // buat Datum untuk tiap jenis hewan
        Datum<Kucing> dKucing = new Datum<>(new Kucing("Kitty"));
        Datum<Anjing> dAnjing = new Datum<>(new Anjing("Buddy"));
        Datum<Burung> dBurung = new Datum<>(new Burung("Tweety"));

        System.out.println("=== Simulasi generik dengan ContohMetodeGenerik ===\n");

        // tampilkan isi datum (toString)
        ContohMetodeGenerik.tampilDatum(dKucing);
        ContohMetodeGenerik.tampilDatum(dAnjing);
        ContohMetodeGenerik.tampilDatum(dBurung);
        System.out.println();

        // kontrol hewan: gerak & bersuara
        ContohMetodeGenerik.kontrolHewan(dKucing);
        ContohMetodeGenerik.kontrolHewan(dAnjing);
        ContohMetodeGenerik.kontrolHewan(dBurung);
    }
}