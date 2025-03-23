/*Nama File  : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : Rabu, 5 Maret 2025
 * */

package pertemuanTiga;

public class Asersi1 {
 public static void main(String[] argas){
    int x=0;

    if (x > 0) {
        System.out.println("x bilangan positif");
    } else{
        assert(x<0): "ada kesalahan kode";
        System.out.println("x bilangan negatif");

    }
    }
 }   
