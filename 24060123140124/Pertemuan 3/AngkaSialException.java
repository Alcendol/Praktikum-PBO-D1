/* Nama File    : AngkaSialException.java
 * Deskripsi    : Ekspresi buatan sendiri, menolak angka 13!
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 5/3/2025
 */ 

 public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}