/*
 * Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program untuk mencoba exception dalam sebuah array
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 5 Maret 2025
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer [] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[1] = 10;
            System.out.println("Success");
            double coba = 7 / 0;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        
        finally {
            System.out.println("clean up code . . .");
        }
    }
}
