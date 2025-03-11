/* Nama File    : AngkaSial.java
 * Deskripsi    : Program ini mendemonstrasikan penggunaan exception yang dibuat sendiri.
 *                Memperkenalkan penggunaan klausa 'throw' dan 'throws'.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 5/3/2025
 */ 


public class AngkaSial {

    public void cekAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial.");
    }

    public static void main(String[] args) {
        AngkaSial instance = new AngkaSial();

        try {
            instance.cekAngka(10);
            instance.cekAngka(13);
            instance.cekAngka(12);
        } catch (AngkaSialException e) {
            System.out.println("Kesalahan terjadi: " + e.getMessage());
            System.out.println("Harap lebih berhati-hati dalam memilih angka!");
        }
    }
}

/*
 * Ketika angka 13 dimasukkan, eksekusi pada baris setelahnya tidak akan berjalan,
 * karena program akan langsung melempar eksepsi 'AngkaSialException'.
 * Hal ini menyebabkan program berpindah ke blok 'catch' tanpa melanjutkan kode di bawahnya.
 *
 * Namun, setelah eksepsi ditangkap dalam blok 'catch', program tetap berjalan normal,
 * sehingga baris kode dalam blok 'catch' akan dieksekusi, memberikan pesan kesalahan dan peringatan kepada pengguna.
 */
