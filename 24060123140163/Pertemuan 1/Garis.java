/*Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat : Nasywa Alya Kamila/240601231401
 * Tanggal : Jumat, 21 Februari 2025
*/

public class Garis {
    /****************ATRIBUT*****************/
    Titik TitikAwal;
    Titik TitikAkhir;
    static int counterGaris = 0;

    /****************METHOD*****************/
    //Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis() {
        this.TitikAwal = new Titik(0, 0);
        this.TitikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor dengan parameter untuk membuat garis dengan titik awal dan akhir
    Garis(Titik TitikAwal, Titik TitikAkhir) {
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        counterGaris++;
    }

    //Selector mengembalikan titik awal
    Titik getTitikAwal() {
        return TitikAwal;
    }

    //Selector mengembalikan titik akhir
    Titik getTitikAkhir() {
        return TitikAkhir;
    }

    //Selector mengembalikan nilai banyaknya garis
    static int getCounterGaris() {
        return counterGaris;
    }

    //Mengeset titik awal untuk garis dengan nilai baru
    void setTitikAwal(Titik TitikAwal) {
        this.TitikAwal = TitikAwal;
    }

    //Mengeset titik akhir untuk garis dengan nilai baru
    void setTitikAkhir(Titik TitikAkhir) {
        this.TitikAkhir = TitikAkhir;
    }

    //Menghitung panjang garis tanpa memanggil fungsi getJarak
    double getPanjang() {
        return Math.sqrt((TitikAkhir.getAbsis() - TitikAwal.getAbsis()) * (TitikAkhir.getAbsis() - TitikAwal.getAbsis()) + (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()) * (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()));
    }

    //Menghitung gradien garis
    double getGradien() {
        return ((TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()) / (TitikAkhir.getAbsis() - TitikAwal.getAbsis()));
    }

    //Mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        return new Titik(((TitikAwal.getAbsis() + TitikAkhir.getAbsis()) / 2), ((TitikAwal.getOrdinat() + TitikAkhir.getOrdinat()) / 2));
    }

    //Mengecek apakah garis ini sejajar dengan garis lainnya
    boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    //Mengecek apakah garis ini tegak lurus dengan garis lainnya
    boolean isTegakLurus(Garis garislain) {
        return this.getGradien() * garislain.getGradien() == -1;
    }

    //Mencetak koordinat titik awal dan akhir garis
    void printGaris() {
        System.out.println("Garis dari Titik (" + TitikAwal.getAbsis() + ", " + TitikAwal.getOrdinat() + ") ke Titik (" + TitikAkhir.getAbsis() + ", " + TitikAkhir.getOrdinat() + ")");
    }

    //Mendapatkan persamaan garis dalam bentuk string
    String getPersamaanGaris() {
        double m = getGradien();
        double c = TitikAwal.getOrdinat() - m * TitikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}