/*
 * Nama File : MainCoer.java
 * Deskripsi : Contoh untuk percobaan Ad Hoc - Coersion
 * Pembuat : Patricia Gabrielle Yudianto
 * Tanggal : 27 April 2025
 */

public class MainCoer {
    public static void main(String[] args) {
        int output = 'a';

        // double x = 15.5;
        // int output = x;

        // int y = 25;
        // double output = y;

        // int z = 78;
        // char output = (char) z;

        // char a = 'a';
        // double output = a;

        System.out.println(output);
    }
}

/*
 * Kesimpulan :
 * - Percobaan pertama bisa dieksekusi, karena java punya coersion otomatis
 * untuk char ke int, dimana dia akan mengkonversi
 * nilai karakter tersebut ke dalam ascii.
 * - Percobaan kedua tidak bisa dieksekusi, karena mengonversi double jadi int
 * bisa terjadi kehilangan nilai (desimal
 * dihilangkan).
 * - Percobaan ketiga bisa dieksekusi, karena konversi dari tipe yang lebih
 * kecil (int) ke lebih besar (double) tidak
 * menyebabkan kehilangan data.
 * - Percobaan keempat bisa dieksekusi, karena java bisa mengonversi int ke char
 * menggunakan casting explisit yang dimana
 * akan mengonversi angka jadi karakter sesuai nilai ascii nya.
 * - Percobaan kelima bisa dieksekusi, java bisa konversi char ke double
 * otomatis karena nilai numerik dari char
 * ascii bisa disesuaikan ke double.
 */
