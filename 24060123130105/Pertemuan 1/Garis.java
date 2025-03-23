
/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Nadzif Silakhudin
 * Tanggal      : 2/19/2025
 */

public class Garis {

    // ATRIBUT
    Titik awal;
    Titik akhir;
    static int garisCounter = 0;

    
    // METHOD

    Garis(){
        awal = new Titik();
        akhir = new Titik(1,1);
    }

    Garis(Titik a, Titik b){
        this.awal = a;
        this.akhir = b;
    }
    
    // SELEKTOR

    Titik getAwal(){
        return awal;
    }
    
    Titik getAkhir(){
        return akhir;
    }

    double getGradien(){
        return akhir.getOrdinat() - awal.getOrdinat() / akhir.getAbsis() - awal.getAbsis();
    }

    Titik getTitikTengah(){

        return new Titik((awal.getAbsis()+akhir.getAbsis())/2 , 
                        (awal.getOrdinat()+akhir.getOrdinat())/2);
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printPersamaan(){
        Titik T1 = this.awal;
        Titik T2 = this.akhir;
        double m = (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
        double c = T1.getOrdinat() - m * T1.getAbsis();
        
        System.out.println("Persamaan garis yang memiliki titik (" + T1.absis + "," + T1.ordinat + ")"
        + ", (" + T2.absis + "," + T2.ordinat + ") adalah :");
        System.out.printf("y = %.2fx + %.2f", m, c);


    }
}
