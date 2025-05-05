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
