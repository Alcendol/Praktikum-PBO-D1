/* Nama File    : MGaris.java
 * Deskripsi    : Berisi main dari class Garis
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 19/2/2025
 */ 

public class MGaris {
    public static void main(String[] args) {
        Garis G1, G2, G3;

        G1 = new Garis();
        G1.printGaris();
        
        System.out.println("Titik Awal : (" + G1.getTitikAwal().absis + "," + G1.getTitikAwal().ordinat + ")");
        System.out.println("Titik Akhir : (" + G1.getTitikAkhir().absis + "," + G1.getTitikAkhir().ordinat + ")");

        System.out.println("==========================="); 

        G2 = new Garis(new Titik(2.0, 2.0), new Titik(5.0, 5.0));
        G2.printGaris();
        
        System.out.println("Titik Awal : (" + G2.getTitikAwal().absis + "," + G2.getTitikAwal().ordinat + ")");
        System.out.println("Titik Akhir : (" + G2.getTitikAkhir().absis + "," + G2.getTitikAkhir().ordinat + ")");

        System.out.println("===========================");

        G3 = new Garis();
        G3.printGaris();

        System.out.println("\nsetTitikAwal : ");
        G3.setTitikAwal(new Titik(1.0, 1.0));
        G3.printGaris();

        System.out.println("\nsetTitikAkhir : ");
        G3.setTitikAkhir(new Titik(4.0, 4.0));
        G3.printGaris();

        System.out.println("\nPanjang Garis : " + G3.getPanjangGaris());

        System.out.println("Gradien : " + G3.getGradien());

        System.out.println("Titik Tengah : (" + G3.getTitikTengah().absis + "," + G3.getTitikTengah().ordinat + ")");

        System.out.println("===========================");

        System.out.println("isSejajar G2 & G3 : " + G2.isSejajar(G3));
        System.out.println("isTegakLurus G2 & G3 : " + G2.isTegakLurus(G3));

        System.out.println("===========================");

        Garis G4 = new Garis(new Titik(1, 5), new Titik(2, 1));
        G4.printGaris();
        G4.persamaanGaris();

        System.out.println("Counter : "  + Garis.getCounterGaris());
    }
}
