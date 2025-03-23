/**
 *  * Nama : Noval Putra Barliyanda / 24060123140137
 *  * Tanggal : 10 Maret 2025
 *  * File : AngkaSial.java
 */
package pertemuan3;
 
 public class AngkaSial {

  public void cobaAngka(int angk) throws AngkaSialException {
      if(angk ==13) {
        throw new AngkaSialException();
      }
      System.out.println(" bukan angka sial");
  }

  public static void main(String[] args) {
      AngkaSial as = new AngkaSial();
      try {
          as.cobaAngka(10);
          as.cobaAngka(13);
          as.cobaAngka(12);
      } catch (AngkaSialException ase) {

          System.out.println(ase.getMessage());
          System.out.println("hati-hati angka sial!!");
      }
  }
}

/*
 * Pertanyaan 1 : Ketika eksepsi terjadi, apakah baris 14 pada AngkaSial.java di atas dieksekusi?
 * Jawaban : Tidak dieksekusi ketika eksepsi terjadi (angk 13), karena kontrol berpindah ke blok catch
 * Pertanyaan 2 : Apakah baris 23 pada AngkaSial.java di atas dieksekusi?
 * Jawaban : dieksekusi setelah penanganan eksepsi, karena kontrol kembali ke metode main()
 */