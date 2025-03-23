/* Nama File : garis.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Sabtu, 22 Februari 2025
 */

package pertemuanDua;

public class Garis {
    //atribut
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // method
    // Konstruktor tanpa parameter
    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter 
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor (getter) CounterGaris 
    static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang sebuah garis 
    double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Method untuk mendapatkan gradien dari sebuah garis 
    double getGradien() {
        if (titikAkhir.getAbsis() == titikAwal.getAbsis()) {
          throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
          return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Method untuk mendapatkan titik tengah dari sebuah garis //
    Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Method untuk mengecek apakah sebuah garis sejajar dengan garis lainnya //
    boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Method untuk mengecek apakah sebuah garis tegak lurus dengan garis lainnya //
    boolean isTegakLurus(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();

    // Jika salah satu gradien bernilai Infinity (garis vertikal)
    if (Double.isInfinite(gradien1) && gradien2 == 0) return true;
    if (Double.isInfinite(gradien2) && gradien1 == 0) return true;

    // Mengecek apakah perkalian gradien = -1
    return gradien1 * gradien2 == -1;
}

    // Method untuk menampilkan ke layar titik awal dan titik akhir garis //
    void tampilkanGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }
    // Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c //
    void printPersamaanGaris() {
        double gradien = getGradien();
        double intercept = titikAwal.getOrdinat() - gradien * titikAwal.getAbsis();
        System.out.println("Persamaan garis: y = " + gradien + "x + " + intercept);
      }
    }
