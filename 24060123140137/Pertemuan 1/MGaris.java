//Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : MGaris.java
public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G2 = new Garis(T1, T2);

        System.out.println("Print Garis G1 Default : ");
        G1.printGaris();
        System.out.println("Print Garis G2 dengan parameter Titik T1 dan T2 : ");
        G2.printGaris();
        System.out.println("Get Titik awal garis G1 = ");
        G1.getTitikAwal().printTitik();
        System.out.println("Get Titik akhir garis G1 = ");
        G1.getTitikAkhir().printTitik();
        System.out.println("Set Titik awal dan akhir garis G1 = ");
        G1.setTitikAwal(5, 5);
        G1.setTitikAkhir(1, -9);
        G1.printGaris();
        System.out.println("Panjang garis G1 = " + G1.panjangGaris());
        System.out.println("Gradien garis G1 = " + G1.gradienGaris());
        System.out.println("Titik tengah Garis G1 = ");
        G1.getTitikTengah().printTitik();
        System.out.println("Apakah G1 sejajar dengan G2 = " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2 = " + G1.isTegakLurus(G2));
        System.out.println("Persamaan garis G2 : ");
        System.out.println(G2.persamaanGaris());
        System.out.println("Jumlah garis : " + Garis.getCounter());
    }
    
}