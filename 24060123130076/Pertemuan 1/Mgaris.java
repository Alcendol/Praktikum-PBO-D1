/*Nama: Muhammad Helmi Abdulbaqi */
/*Nim: 24060123130076 */
/*Kelas-Lab: D-C1 */


public class Mgaris {
    public static void main(String[] args) {
        // Membuat objek titik
        titik t1 = new titik(2, 3);
        titik t2 = new titik(5, 7);
        titik t3 = new titik(1, 1);
        titik t4 = new titik(4, 5);

        // Membuat objek garis
        garis g1 = new garis(t1, t2);
        garis g2 = new garis(t3, t4);

        // Memanggil semua metode dalam kelas garis
        System.out.println("Jumlah garis yang dibuat: " + garis.getCounterGaris());
        
        System.out.println("Panjang garis g1: " + g1.getPanjangGaris());
        System.out.println("Gradien garis g1: " + g1.getGradien());
        
        titik tengahG1 = g1.titikTengah();
        System.out.println("Titik tengah garis g1: (" + tengahG1.getAbsis() + ", " + tengahG1.getOrdinat() + ")");
        
        System.out.println("Apakah g1 sejajar dengan g2? " + g1.isSejajar(g2));
        System.out.println("Apakah g1 tegak lurus dengan g2? " + g1.isTegakLurus(g2));
        
        System.out.print("Persamaan garis g1: ");
        g1.printPersamaanGaris();
        
        System.out.print("Informasi garis g1: ");
        g1.printGaris();
    }
}
