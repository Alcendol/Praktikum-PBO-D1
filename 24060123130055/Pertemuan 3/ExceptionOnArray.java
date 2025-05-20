/* Nama File    : Dosen.java
 * Deskripsi    : berisi eksepsei pada array
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 5 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer [] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[8] = 10;
            System.out.println("Succes");
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("clean up code . . .");
        }
    }
}