/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dari class Garis
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 19/2/2025
 */ 

public class Garis {
    /* ATRIBUT */
    Titik TitikAwal;
    Titik TitikAkhir;
    static int counterGaris = 0;

    /* METHOD */
    //konstruksi untuk membuat garis
    Garis () {
        TitikAwal = new Titik(0.0,0.0);
        TitikAkhir = new Titik(1.0,1.0);
        counterGaris++;
    }

    //overloading constructor
    Garis (Titik awal, Titik akhir) {
        TitikAwal = awal;
        TitikAkhir = akhir;
        counterGaris++;
    }

    //mencetak garis
    void printGaris () {
        System.out.println("Garis ((" + TitikAwal.absis + "," + TitikAwal.ordinat + "),(" + TitikAkhir.absis + "," + TitikAkhir.ordinat + "))");
    }

    //mengembalikan nilai titik awal garis (absis, ordinat)
    Titik getTitikAwal () {
        return TitikAwal;
    }

    //mengembalikan nilai titik akhir garis (absis, ordinat)
    Titik getTitikAkhir () {
        return TitikAkhir;
    }

    //mengembalikan jumlah garis
    static int getCounterGaris () {
        return counterGaris;
    }

    //mengeset nilai titik awal
    void setTitikAwal (Titik x) {
        TitikAwal = x;
    }

    //mengeset nilai titik akhir
    void setTitikAkhir (Titik y) {
        TitikAkhir = y;
    }

    //mengembalikan panjang sebuah garis
    double getPanjangGaris () {
        return Math.sqrt(Math.pow(getTitikAkhir().absis - getTitikAwal().absis, 2) + Math.pow(getTitikAkhir().ordinat - getTitikAwal().ordinat, 2));
    }

    //mengembalikan gradien sebuah garis
    double getGradien () {
        return (getTitikAkhir().ordinat - getTitikAwal().ordinat) / (getTitikAkhir().absis - getTitikAwal().absis);
    }

    //mengembalikan titik tengah dari sebuah garis
    Titik getTitikTengah () {
        return new Titik((getTitikAkhir().absis + getTitikAwal().absis) / 2, (getTitikAkhir().ordinat + getTitikAwal().ordinat) / 2);
    }

    //mengecek sejajar atau tidaknya dua buah garis
    boolean isSejajar (Garis b) {
        return this.getGradien() == b.getGradien();
    }

    //mengecek tegak lurus atau tidaknya dua buah garis
    boolean isTegakLurus (Garis b) {
        return this.getGradien() == (b.getGradien() * -1);
    }

    //persamaan garis
    void persamaanGaris () {
        double c, m;
        m = getGradien();
        c = getTitikAwal().ordinat -  (m * getTitikAwal().absis);

        if (m == 1) {
            if (c == 0){
                System.out.println("Persamaan : y = x");    
            }
            if (c > 0) {
                System.out.println("Persamaan : y = x + " + c);
            }
            if (c < 0) {
                System.out.println("Persamaan : y = x - " + Math.abs(c));
            }
        }
        if (m == -1) {
            if (c == 0){
                System.out.println("Persamaan : y = -x");    
            }
            if (c > 0) {
                System.out.println("Persamaan : y = -x + " + c);
            }
            if (c < 0) {
                System.out.println("Persamaan : y = -x - " + Math.abs(c));
            }
        }
        if (m == 0) {
            if (c == 0){
                System.out.println("Persamaan : y = 0");    
            }
            if (c > 0) {
                System.out.println("Persamaan : y = " + c);
            }
            if (c < 0) {
                System.out.println("Persamaan : y = - " + Math.abs(c));
            }
        }
        if (m > 1 || (m < 1 && m > 0)) {
            if (c == 0){
                System.out.println("Persamaan : y = " + m + "x");    
            }
            if (c > 0) {
                System.out.println("Persamaan : y = " + m + "x + " + c);
            }
            if (c < 0) {
                System.out.println("Persamaan : y = " + m + "x - " + Math.abs(c));
            }
        }
        if (m < -1 || (m > -1 && m < 0)) {
            if (c == 0){
                System.out.println("Persamaan : y = " + m + "x");    
            }
            if (c > 0) {
                System.out.println("Persamaan : y = " + m + "x + " + c);
            }
            if (c < 0) {
                System.out.println("Persamaan : y = " + m + "x - " + Math.abs(c));
            }
        }
    }

}
