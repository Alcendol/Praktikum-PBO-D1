/* 
 * Nama File    : AngkaSialException.java
 * Deskripsi    : Kelas custom exception yang memberikan pesan error ketika angka 13 dimasukkan.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : Senin, 3 Februari 2025
 */

 
public class AngkaSialException extends Exception {
  public AngkaSialException() {
    super("jangan memasukkan angka 13 karena angka sial !!!");
  }
}
