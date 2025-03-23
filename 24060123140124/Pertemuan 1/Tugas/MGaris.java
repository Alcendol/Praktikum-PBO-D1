/*  Nama File   : Titik.java 
    Deskripsi   : berisi atrinut dan method dalam class Titik
    Pembuat     : Muhammad Paruda Pradayan - 24060123140124
    Tanggal     : 19 - Februari - 2025
*/



public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik untuk garis pertama
        Titik titikAwal1 = new Titik(-2, 0);
        Titik titikAkhir1 = new Titik(0, 4);

        // Membuat objek garis pertama
        Garis garis1 = new Garis(titikAwal1, titikAkhir1);

        // Menampilkan informasi garis pertama
        garis1.printGaris();
        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());
        System.out.println("Titik tengah garis: (" + garis1.getTitikTengah().getAbsis() + ", " + garis1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + garis1.getPersamaanGaris());

        // Membuat objek titik untuk garis kedua
        Titik titikAwal2 = new Titik(1, 1);
        Titik titikAkhir2 = new Titik(3, 3);

        // Membuat objek garis kedua
        Garis garis2 = new Garis(titikAwal2, titikAkhir2);

        // Menampilkan informasi garis kedua
        garis2.printGaris();
        System.out.println("Panjang garis: " + garis2.getPanjang());
        System.out.println("Gradien garis: " + garis2.getGradien());
        System.out.println("Titik tengah garis: (" + garis2.getTitikTengah().getAbsis() + ", " + garis2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + garis2.getPersamaanGaris());

        // Mengecek apakah garis1 sejajar dengan garis2
        System.out.println("Apakah garis1 sejajar dengan garis2? " + garis1.isSejajar(garis2));

        // Mengecek apakah garis1 tegak lurus dengan garis2
        System.out.println("Apakah garis1 tegak lurus dengan garis2? " + garis1.isTegakLurus(garis2));

        // Menampilkan jumlah garis yang telah dibuat
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}