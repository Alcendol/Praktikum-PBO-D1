/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dari class Titik
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 19/2/2025
 */ 

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    //konstruktor untuk membuat titik (0,0)
    Titik () {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //overloading constructor
    Titik (double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    
    //mengembalikan nilai absis
    double getAbsis () {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat () {
        return ordinat;
    }

    //mengeset nilai absis titik dengan nilai baru x
    void setAbsis (double x) {
        absis = x;
    }

    //mengeset nilai ordinat titik dengan nilai baru y
    void setOrdinat (double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak kordinat titik
    void printTitik () {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai kuadran
    int getKuadran () {
        //kamus lokal
        int i;

        //algoritma
        if (absis > 0 && ordinat > 0) {
            i = 1;
        } else if (absis < 0 && ordinat > 0) {
            i = 2;
        } else if (absis < 0 && ordinat < 0) {
            i = 3;
        } else if (absis > 0 && ordinat < 0) {
            i = 4;
        } else {
            i = 0;
        }
        return i;
    }

    //mengembalikan jarak antara sebuah titik dengan titik pusat (0,0)
    double getJarakPusat () {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak (Titik x) {
        return Math.abs(Math.sqrt(Math.pow(absis - x.getAbsis(), 2) + Math.pow(ordinat - x.getOrdinat(), 2)));
    }

    void refleksiX () {
        ordinat = ordinat * -1;
    }

    void refleksiY () {
        absis = absis * -1;
    }

    Titik getRefleksiX () {
        return new Titik (absis * -1, ordinat);
    }

    Titik getRefleksiY () {
        return new Titik (absis, ordinat * -1);
    }


}