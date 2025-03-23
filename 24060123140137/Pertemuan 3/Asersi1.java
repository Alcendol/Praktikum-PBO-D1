/*
* Nama File    : AngkaSial.java
* Pembuat      : Noval Putra B / 24060123140137
* Tanggal      : 10 Maret 2025
*/
package pertemuan3;

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