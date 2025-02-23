/* Nama File : Titik.java
 * Deskripsi : file java
 * Pembuat : Muhammad Firzi Ryadi/24060123140202
 * Tanggal : Jumat, 21 Februari 2025
 */
public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;
    /* Method */
    /* konstruktor untuk membuat objek yaitu titik (0,0)*/
    Titik () {
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }
    Titik (double absis,double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }
    /* jika terdapat static di depan tipe data,maka fungsi static tersebut bisa langsung ditempelkan ke classnya.Contoh di bawah
     * Titik.getCounterTitik
    */
    static int getCounterTitik () {
        return counterTitik;
    }

    double getAbsis() {
        return absis;
    }
    double getOrdinat() {
        return ordinat;
    }
    void setAbsis(double x) {
        absis = x;
    }
    void setOrdinat(double y) {
        ordinat = y;
    }
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik(" + absis + "," + ordinat +")");
    }

    int getKuadran () {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0  && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    double getJarakPusat () {
        return Math.sqrt((absis*absis) + (ordinat*ordinat)); 
    }

    double getJarak(Titik t) {
        return Math.sqrt(Math.pow(this.absis - t.absis,2) +  Math.pow(this.ordinat-t.ordinat,2));
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }
    
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}


    