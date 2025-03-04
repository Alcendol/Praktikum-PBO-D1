/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 26 Februari 2025
 */

 class Garis {
    private Titik awal, akhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1).
    public Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir.
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir.
    public Titik getAwal() { return awal; }
    public Titik getAkhir() { return akhir; }
    public void setAwal(Titik awal) { this.awal = awal; }
    public void setAkhir(Titik akhir) { this.akhir = akhir; }
    public static int getCounterGaris() { return counterGaris; }

    // Method untuk mendapatkan panjang sebuah garis.
    public double getPanjang() {
        return Math.sqrt(Math.pow(akhir.getAbsis() - awal.getAbsis(), 2) + Math.pow(akhir.getOrdinat() - awal.getOrdinat(), 2));
    }

    // Method untuk mendapatkan gradien dari sebuah garis.
    public double getGradien() {
        if (akhir.getAbsis() == awal.getAbsis()) {
            throw new ArithmeticException("Garis vertikal, gradien tidak terdefinisi");
        }
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    // Method untuk mendapatkan titik tengah dari sebuah garis.
    public Titik getTitikTengah() {
        return new Titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() + akhir.getOrdinat()) / 2);
    }

    // Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Method untuk menampilkan ke layar titik awal dan titik akhir garis.
    public void tampilkanGaris() {
        System.out.println("Garis dari (" + awal.getAbsis() + ", " + awal.getOrdinat() + ") ke (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    // Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}

