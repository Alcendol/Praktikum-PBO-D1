/*  Nama File   : Titik.java 
    Deskripsi   : berisi atrinut dan method dalam class Titik
    Pembuat     : Muhammad Paruda Pradayan - 24060123140124
    Tanggal     : 19 - Februari - 2025
*/



public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Method getter dan setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return deltaY / deltaX;
    }

    // Method untuk mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Method untuk mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis garisLain) {
        return this.getGradien() * garisLain.getGradien() == -1;
    }

    // Method untuk menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Garis dari titik (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") ke titik (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Method untuk menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
