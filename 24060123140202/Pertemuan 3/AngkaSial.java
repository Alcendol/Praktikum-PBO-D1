/*
 * Nama File    : AngkaSial.java
 * Deskripsi    : Program untuk mencoba AngkaSial
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 5 Maret 2025
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
  
/*
   *Pertanyaan = Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
   Jawaban = Baris 12 tidak akan dieksekusi jika eksepsi terjadi karena jika eksepsi terjadi maka yang akan dieksekusi
            adalah AngkaSialException dan akan mengeluarkan message "jangan memasukkan angka 13 karena angka sial !!!"
*/

/*
 * Pertanyaan = Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * Jawaban = baris 21 akan dieksekusi dan pernyataan di dalamnya akan dieksekusi
 */