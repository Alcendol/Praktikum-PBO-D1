/*
 * Nama File    : AngkaSial.java
 * Deskripsi    : Program angka sial
 * Pembuat      : Muhammad Helmi Abdulbaqi/24060123130076
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
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println("Hati hati memasukkan angka!!!");
      }
    }
  }

  
/*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  
Jelaskan pada lembar praktikum anda !  */


/*jawaban 1: Angka 12 pada AngkaSial.java dieksekusi. Hal tersebut terjadi karena angka 12 terletak diatas angka 13 (angka sial)
 * sehingga angka 12 dieksekusi sebelum terjadinya catch exception
 */

 /*Jawaban 2: baris 21 (catch) dieksekusi karena terdapat angka 13 pada inputan sehingga terjadi throw exception yang membuat tereksekusinya catch */