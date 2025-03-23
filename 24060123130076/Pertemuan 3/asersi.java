/*
 * Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjjukkan asersi
 * Pembuat      : Muhammad Helmi Abdulbaqi/24060123130076
 * Tanggal      : 10 Maret 2025
 */

 public class asersi {
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