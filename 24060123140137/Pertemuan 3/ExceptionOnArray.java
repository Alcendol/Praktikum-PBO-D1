/*
 * Nama File    : AngkaSial.java
 * Pembuat      : Noval Putra B / 24060123140137
 * Tanggal      : 10 Maret 2025
 */

package pertemuan3;

public class ExceptionOnArray {
  public static void main(String[] args) {
    Integer[] arrayInteger = new Integer[4];
    try {
      arrayInteger[2] = 11;
      arrayInteger[4] = 10;
      System.out.println("Berhasil");
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      System.out.println("Clean up code . . .");
    }
  }
}
