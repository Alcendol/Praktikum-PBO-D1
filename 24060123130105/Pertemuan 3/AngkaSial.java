/*
 * Nama File    : AngkaSial.java
 * Deskripsi    : Program untuk menunjukan throw exception
 * Pembuat      : Nadzif Silakhudin / 240601230105
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
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/*
 * PERTANYAAN:
    *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
    *   Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
    Jelaskan pada lembar praktikum anda ! 

 * JAWABAN :
 * baris as.cobaAngka(12); tidak dieksekusi karena baris sebelumnya sudah terjadi exception
 */