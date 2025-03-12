/* Nama File    : Dosen.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 6 Maret 2025
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan masukkan angka 13");
    }
}