/*Nama File  : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : Rabu, 5 Maret 2025
 * */

package pertemuanTiga;

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[1] = 10;
            System.out.println("Berhasil");
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
    }
}
}
