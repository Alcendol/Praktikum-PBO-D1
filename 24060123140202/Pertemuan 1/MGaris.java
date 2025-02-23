/* Nama File : MGaris.java
 * Deskripsi : aplikasi garis.java
 * Pembuat : Muhammad Firzi Ryadi/24060123140202
 * Tanggal : Jumat, 21 Februari 2025
 */
public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Garis G2 = G1;
        Titik T2 = new Titik(4,2);
        G1.printGaris();
        G1.setGarisT1(new Titik(5,4));
        G1.printGaris();
        G1.setGarisT2(T2);
        G1.printGaris();
        System.out.println("Panjang dari garis adalah:" + G1.getPanjang());
        System.out.println("Gradien :" + G1.getGradien());
        Titik titikTengah = G1.getTitikTengah();
        System.out.println("Titik tengah garis: (" + titikTengah.getAbsis() + ", " + titikTengah.getOrdinat() + ")");
        System.out.println("IsSejajar? : " + G1.isSejajar(G1, G2));
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G1, G2)); 
        G1.printRumus();
    }
}