/*
    Nama File : AngkaSialException.java
    Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
    Pembuat   : Patricia Gabrielle Yudianto
    Tanggal   : 9 Maret 2025
*/

public class AngkaSialException extends Exception {
  public AngkaSialException() {
    super("jangan memasukkan angka 13 karena angka sial!!!");
  }
}
