/* 
 * Nama File    : AngkaSial.java
 * Deskripsi    : Program untuk mendemonstrasikan exception custom, 
 *                dimana metode cobaAngka() akan melempar exception jika angka yang dimasukkan adalah 13.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : Senin, 3 Februari 2025
 */

public class AngkaSial {
  public void cobaAngka(int angka) throws AngkaSialException {
    if (angka == 13) {
      throw new AngkaSialException();
    }
    System.out.println(angka + " bukan angka sial");
  }

  public static void main(String[] args) {
    AngkaSial as = new AngkaSial();

    try {
      as.cobaAngka(10);
      as.cobaAngka(13);
      as.cobaAngka(12);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("Hati hati memasukkan angka!!!");
    }
  }
}

//   pada AngkaSial.java:
// - Baris "as.cobaAngka(10);" dieksekusi dengan normal karena nilai 10 bukan angka sial, sehingga menghasilkan output "10 bukan angka sial".
// - Ketika "as.cobaAngka(13);" dipanggil, kondisi if (angka == 13) terpenuhi sehingga 
//   throw new AngkaSialException(); dijalankan. Hal ini menyebabkan eksekusi dalam blok try berhenti 
//   dan langsung dilompat ke blok catch.
// - Karena exception dilempar pada pemanggilan angka 13, baris "as.cobaAngka(12);" tidak dieksekusi.
// - di blok catch, pesan exception (yang didefinisikan dalam AngkaSialException) ditampilkan melalui e.getMessage(), 
//   kemudian dicetak pesan "Hati hati memasukkan angka!!!".
//
// Kesimpulannya: baris setelah pemanggilan metode dengan angka 13 (misalnya, pemanggilan dengan 12) tidak dijalankan
// karena exception menyebabkan alur program langsung masuk ke blok catch.
//