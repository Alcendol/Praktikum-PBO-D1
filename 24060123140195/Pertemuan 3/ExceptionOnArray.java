/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan ekspresi menggunakan class library java
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 5/3/2025
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
