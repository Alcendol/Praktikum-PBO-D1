/*
 File         : ContohMetodeGenerik.java 
 Deskripsi    : Menyediakan metode generik untuk mengelola objek Datum
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 6 Mei 2025 
*/
public class ContohMetodeGenerik {

    public static <T> void tampilkanIsi(Datum<T> d) {
        System.out.println("Isi Datum: " + d.getIsi());
    }

    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> d) {
        T hewan = d.getIsi();
        System.out.println("Nama: " + hewan.getNama());
        System.out.print("Bersuara: ");
        hewan.Bersuara();
        System.out.print("Gerak: ");
        hewan.Gerak();
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Datum<Kucing> dKucing = new Datum<>(new Kucing("Saki"));
        Datum<Anjing> dAnjing = new Datum<>(new Anjing("Hachi"));
        Datum<Burung> dBurung = new Datum<>(new Burung("Cici"));

        tampilkanPerilaku(dKucing);
        tampilkanPerilaku(dAnjing);
        tampilkanPerilaku(dBurung);

        Datum<String> dString = new Datum<>("Contoh data string");
        tampilkanIsi(dString);
    }
}
