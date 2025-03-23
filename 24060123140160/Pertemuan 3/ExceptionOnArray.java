/* 
 * Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program untuk mendemonstrasikan penanganan exception pada array, 
 *                dimana akses di luar batas array akan menyebabkan ArrayIndexOutOfBoundsException.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : Senin, 3 Februari 2025
 */

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
