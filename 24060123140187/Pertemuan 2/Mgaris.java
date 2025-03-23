/* Nama File : Mgaris.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Sabtu, 22 Februari 2025
 */
package pertemuanDua;

 public class Mgaris {
     public static void main(String[] args) {
         Titik titikA = new Titik(3, 2);
         Titik titikB = new Titik(4, 2);
         Garis garis1 = new Garis(titikA, titikB);
         
         Titik titikC = new Titik(1, 2);
         Titik titikD = new Titik(3, 4);
         Garis garis2 = new Garis(titikC, titikD);
         
         // Menampilkan panjang sebuh garis //
         System.out.println("Panjang garis 1: " + garis1.getPanjang());
         System.out.println("Panjang garis 2: " + garis2.getPanjang());
         
         // Menampilkan gradien sebuh garis //
         System.out.println("Gradien garis 1: " + garis1.getGradien());
         System.out.println("Gradien garis 2: " + garis2.getGradien());
         
         // Menampilkan titik tengah //
         Titik titikTengah = garis1.getTitikTengah();
         System.out.println("Titik tengah garis 1: (" + titikTengah.getAbsis() + ", " + titikTengah.getOrdinat() + ")");
         
         // Mengecek apakah kedua garis sejajar //
         System.out.println("Apakah garis 1 dan 2 sejajar? " + garis1.isSejajar(garis2));
         
         // Menampilkan persamaan garis //
         garis1.printPersamaanGaris();
         
         // Menampilkan jumlah objek garis //
         System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
       }
 }
 