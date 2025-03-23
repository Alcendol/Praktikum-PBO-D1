/**
* File : AngkaSial.java
* Deskripsi : Program pemggunaan exception buatan sendiri
*             pengenalan klausa 'throw' dan 'throws'
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
 Pertanyaan : 
 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

 Jawaban : 
 1. Jika eksepsi terjadi, maka baris 12 tidak dieksekusi
 2. Iya, jika eksepsi terjadi, baris 21 akan dieksekusi
*/



