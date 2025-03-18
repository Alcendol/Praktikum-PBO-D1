/**
 * File         : main.java
 * Deskripsi    : Program utama untuk menguji kelas DosenTetap, DosenTamu, dan Tendik
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 18 Maret 2025
 */

 public class Main{
    public static void main(String[] args) {
        // Menguji Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Agus", "1 Januari 1980", "1 Januari 2015", 5000000, "Teknik");
        System.out.println("==== Dosen Tetap ====");
        dosenTetap.printInfo();

        // Menguji Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu("123456", "99887766", "Asep", "10 Mei 1985", "4 Januari 2020", 4000000, "Ekonomi", 24);
        System.out.println("\n==== Dosen Tamu ====");
        dosenTamu.printInfo();

        // Menguji Tendik
        Tendik tendik = new Tendik("678910", "Budi", "15 Maret 1975", "1 Februari 2010", 3500000, "Administrasi");
        System.out.println("\n==== Tenaga Kependidikan ====");
        tendik.printInfo();
    }
}

