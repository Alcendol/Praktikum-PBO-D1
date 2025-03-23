/* Nama File    : MGaris.java
 * Deskripsi    : berisi objek Garis dan memanggil method dalam class Garis
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 26 Februari 2025
 */

 public class MGaris {
    public static void main(String[] args) {
        Garis g1 = new Garis(new Titik(-2.5, 0), new Titik(0, 4));
        Garis g2 = new Garis(new Titik(1.5, 1.4), new Titik(3.4, 5.2));
        
        g1.tampilkanGaris();
        System.out.println("Panjang Garis: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());
        System.out.println("Titik Tengah: (" + g1.getTitikTengah().getAbsis() + ", " + g1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + g1.getPersamaanGaris());

        System.out.println("Garis g1 dan g2 sejajar? " + g1.isSejajar(g2));
        System.out.println("Garis g1 dan g2 tegak lurus? " + g1.isTegakLurus(g2));
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}