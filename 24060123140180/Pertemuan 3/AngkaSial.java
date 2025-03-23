/*
 * Nama File    : AngkaSial.java
 * Deskripsi    : Program untuk menunjukan throw exception
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 10 Maret 2025
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
    } catch (AngkaSialException ase) {
      System.out.println(ase.getMessage());
      System.out.println("Hati hati memasukkan angka!!!");
    }
  }
}
/*
 * PERTANYAAN:
     *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
     *Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
     Jelaskan pada lembar praktikum anda ! 
  
 *Jawaban :
    *Iya, hal tersebut dikarenakan eksekusi dari as.cobaAngka(10) tidak akan memenuhi pengkondisian untuk memasuki throw.

    *Iya, baris ke 21 (catch) akan dieksekusi. disaat kita mencapai pemanggilan as.cobaAngka(13), kita akan diberikan eksepsi karena angka 13 
    memenuhi kondisi untuk melakukan throw. Alhasil, catch akan mengeksekusi throw dari cobaAngka
 */