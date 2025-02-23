/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat : Muhammad Firzi Ryadi/24060123140202
 * Tanggal : Jumat, 21 Februari 2025
 */

 public class Garis {
    /*ATRIBUT */
    Titik T1;
    Titik T2;
    static int CounterGaris = 0;

    /*METHOD */
    //mengembalikan nilai counterTitik
    static int getCounterGaris(){
        return CounterGaris;
    }

    //konstruktor untuk membuat garis ((x1,y1),(x2,y2))
    Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        CounterGaris++;
    }

    Garis () {
        this(new Titik(0,0), new Titik(1,1));
    }

    Titik getGarisT1() {
        return this.T1;
    }
    Titik getGarisT2() {
        return this.T2;
    }

    void setGarisT1 (Titik T1) {
        this.T1 = T1;
    }
    void setGarisT2 (Titik T2) {
        this.T2 = T2;
    }
    double getPanjang() {
        return Math.sqrt(Math.pow(T2.absis - T1.absis, 2) + Math.pow(T2.ordinat - T1.ordinat, 2));
    }

    double getGradien() {
        double Selisih = T1.getAbsis() - T2.getAbsis();
        if(Selisih==0) {
            System.out.println("x1 dan x2 sama,pembagian nol");
        }
        return (T1.getOrdinat()-T2.getOrdinat()) / Selisih;
     }
     Titik getTitikTengah() {
        return new Titik((this.T1.getAbsis() + this.T2.getAbsis()) / 2, 
                         (this.T1.getOrdinat() + this.T2.getOrdinat()) / 2);
    }

     boolean isSejajar(Garis G,Garis X) {
        return G.getGradien() == X.getGradien();
     }
     boolean isTegakLurus(Garis G, Garis X) {
        return (G.getGradien()* X.getGradien()) == -1;
     }
     void printGaris() {
        System.out.println("Titik awal (" + T1.absis + "," + T1.ordinat + "), Titik akhir (" + T2.absis + ", " + T2.ordinat + ")");
    }

   
    void printRumus() {
        System.out.println("y = "+ T1.getAbsis() +"x + "+ T2.getOrdinat() +"");
    }

 }

    