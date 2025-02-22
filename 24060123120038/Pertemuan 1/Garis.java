package pertemuansatu;
//Nama: Nazla Azzahra Hermana
//NIM: 24060123120038
//Lab: PBO D1

public class Garis {
    //ATRIBUT
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    //METHOD
    //Konstruktor untuk membuat garis
    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan nilai counter garis
    static int getCounterGaris() {
        return counterGaris;
    }

    // Mengembalikan nilai panjang
    double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.absis - titikAwal.absis, 2) + Math.pow(titikAkhir.ordinat - titikAwal.ordinat, 2));
    }

    // Mengembalikan nilai gradien
    double getGradien() {
        if (titikAkhir.absis == titikAwal.absis) {
          throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
          return (titikAkhir.ordinat - titikAwal.ordinat) / (titikAkhir.absis - titikAwal.absis);
    }

    // Mengembalikan nilai garis tengah
    Titik getTitikTengah() {
        double tengahX = (titikAwal.absis + titikAkhir.absis) / 2;
        double tengahY = (titikAwal.ordinat + titikAkhir.ordinat) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Mengecek apakah sebuah garis sejajar dengan garis lainnya
    boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Mengecek apakah sebuah garis tegak lurus dengan garis lainnya
    boolean isTegakLurus(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
    if (Double.isInfinite(gradien1) && gradien2 == 0) return true;
    if (Double.isInfinite(gradien2) && gradien1 == 0) return true;
    return gradien1 * gradien2 == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir garis
    void tampilkanGaris() {
        System.out.println("Titik Awal: (" + titikAwal.absis + ", " + titikAwal.ordinat + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.absis + ", " + titikAkhir.ordinat + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c 
    void printPersamaanGaris() {
        double gradien = getGradien();
        double intercept = titikAwal.ordinat - gradien * titikAwal.absis;
        System.out.println("Persamaan garis: y = " + gradien + "x + " + intercept);
    }
}
