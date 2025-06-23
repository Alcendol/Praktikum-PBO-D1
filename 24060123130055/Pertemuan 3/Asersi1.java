/* Nama File    : Dosen.java
 * Deskripsi    : berisi program asersi
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 5 Maret 2025
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0 ) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}