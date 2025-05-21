/* Nama File    : AngkaSial.java
 * Deskripsi    : Program ini mendemonstrasikan penggunaan exception yang dibuat sendiri.
 *                Memperkenalkan penggunaan klausa 'throw' dan 'throws'.
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 5/3/2025
 */ 

 public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial.");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println("Terjadi pengecualian: " + ase.getMessage());
            System.out.println("Harap lebih berhati-hati dalam memasukkan angka!");
        }
    }
}

/* 
 * Baris ke-12 tidak akan dijalankan ketika angka 13 diberikan sebagai input,
 * karena saat angka 13 ditemukan, program melempar eksepsi AngkaSialException.
 * Akibatnya, eksekusi langsung dialihkan ke blok catch.
 */

/* 
 * Baris ke-21 tetap berjalan, sebab setelah pengecualian tertangkap 
 * dalam blok catch, program tidak berhenti dan tetap melanjutkan eksekusi 
 * dari dalam blok tersebut.
 */
