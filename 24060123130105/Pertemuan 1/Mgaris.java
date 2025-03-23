
/* Nama File    : Mgaris.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Nadzif Silakhudin
 * Tanggal      : 2/19/2025
 */

public class Mgaris {
    public static void main(String[] args) {
        
        Garis G1;

        System.out.println("Membuat garis baru G1: ");
        G1 = new Garis();
        System.out.println("Titik awal = ");
        G1.awal.printTitik();
        System.out.println("Titik akhir = ");
        G1.akhir.printTitik();
        System.out.println("Gradien garis = " + G1.getGradien());

        Titik T1,T2;
        T1 = new Titik(-2,0);
        T2 = new Titik(0,4);


        Garis G2;
        G2 = new Garis(T1,T2);
        System.out.println("Membuat garis baru G2: ");
        System.out.println("Titik awal = ");
        G2.awal.printTitik();
        System.out.println("Titik akhir = ");
        G2.akhir.printTitik();
        System.out.print("Titik tengah dari G2 adalah ");
        G2.getTitikTengah().printTitik();

        System.out.println("G1 sejajar dengan G2 ? " +( G1.isSejajar(G2) ? "ya" : "tidak"));
        System.out.println("G1 Tegak Lurus dengan G2 ? " +( G1.isTegakLurus(G2) ? "ya" : "tidak"));


        System.out.println("Persamaan garis = ");
        G1.printPersamaan();
        System.err.println();
        G2.printPersamaan();


    }
}
