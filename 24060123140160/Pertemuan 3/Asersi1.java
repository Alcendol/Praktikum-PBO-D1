/* 
 * Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan penggunaan asersi (assert) dalam mendeteksi kondisi yang tidak sesuai.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : Senin, 3 Februari 2025
 */


public class Asersi1 {
  public static void main(String[] args) {
    int x = 0;

    if (x > 0) {
      System.out.println("x bilangan positif");
    } else {
      assert (x < 0) : "ada kesalahan kode";
      System.out.println("x bilangan negatif");
    }
  }
}