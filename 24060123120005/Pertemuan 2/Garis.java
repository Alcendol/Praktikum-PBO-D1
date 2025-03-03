/*  Nama File   : Garis.java
 *  Deskripsi   : Berisi atribut dan method dalam class Garis
 *  Pembuat     : Patricia Gabrielle Yudianto
 *  Tanggal     : 23 Februari 2025 
*/

public class Garis {
    private Titik titikawal;
    private Titik titikakhir;
    private static int counterGaris = 0;

    // Kontruktor tanpa parameter yang diinisialisasi titik awal (0,0) dan titik
    // akhir (1,1)
    public Garis() {
        titikawal = new Titik(0, 0);
        titikakhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik A, Titik B) {
        titikawal = A;
        titikakhir = B;
        counterGaris++;
    }

    // Getter (selektor)
    public Titik getTitikAwal() {
        return titikawal;
    }

    public Titik getTitikAkhir() {
        return titikakhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Selektor (mutator)
    public void setTitikAwal(Titik A) {
        titikawal = A;
    }

    public void setTitikAkhir(Titik B) {
        titikakhir = B;
    }

    // Method untuk mendapatkan panjang sebuah garis
    public double getPanjangGaris() {
        double dx = titikakhir.getAbsis() - titikawal.getAbsis();
        double dy = titikakhir.getOrdinat() - titikawal.getOrdinat();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

    }

    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        return (titikakhir.getOrdinat() - titikawal.getOrdinat()) / (titikakhir.getAbsis() - titikawal.getAbsis());
    }

    // Method untuk mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double a = (titikawal.getAbsis() + titikakhir.getAbsis()) / 2;
        double b = (titikawal.getOrdinat() + titikakhir.getOrdinat()) / 2;
        return new Titik(a, b);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
    public boolean IsSejajar(Garis G) {
        // Jika kedua garis vertikal
        if ((titikawal.getAbsis() == titikakhir.getAbsis()) && (G.titikawal.getAbsis() == G.titikakhir.getAbsis())) {
            return true;
        }
        // Jika gradien kedua garis sama
        return this.getGradien() == G.getGradien();
    }

    // Method untuk mengecek apakah garis tegak lurus dengan garis lain
    public boolean IsTegakLurus(Garis G) {
        // Jika salah satu garis vertikal dan garis lain horizontal
        if (((titikawal.getAbsis() == titikakhir.getAbsis()) && (G.titikawal.getOrdinat() == G.titikakhir.getOrdinat()))
                || (titikawal.getOrdinat() == titikakhir.getOrdinat()
                        && G.titikawal.getAbsis() == G.titikakhir.getAbsis())) {
            return true;
        }
        // Jika kedua gradien garis dikalikan hasilnya -1
        return getGradien() * G.getGradien() == -1;
    }

    // Method untuk menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Titik (" + titikawal.getAbsis() + "," + titikawal.getOrdinat() + ") ke Titik ("
                + titikakhir.getAbsis() + "," + titikakhir.getOrdinat() + ")");
    }

    // Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaanGaris() {
        // Jika garis vertikal (absis titik awal = absis titik akhir)
        if (titikawal.getAbsis() == titikakhir.getAbsis()) {
            return "x = " + titikawal.getAbsis();
        }

        // Jika garis tidak vertikal
        double m = getGradien();
        double c = titikawal.getOrdinat() - (m * titikawal.getAbsis());

        return "y = " + m + "x + " + c;
    }
}
