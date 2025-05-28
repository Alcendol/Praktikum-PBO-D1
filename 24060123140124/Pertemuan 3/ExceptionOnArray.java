/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan ekspresi menggunakan class library java
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 5/3/2025
 */ 

 public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code.... ");
        }
    }
}