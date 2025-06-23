/*
 * Nama File    : main.java
 * Deskripsi    : Program utama ini bertujuan untuk menguji dan mendemonstrasikan implementasi dari kelas-kelas Pegawai, DosenTamu, DosenTetap, dan Tendik dengan menampilkan informasi detail masing-masing pegawai.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 16 Maret 2025
 */

class main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000, "Fakultas Sains dan Matematika");
        DosenTamu dosenTamu = new DosenTamu("123456789", "87654321", "Budi", "10 Oktober 1985", "1 Januari 2020", 4000000, "Fakultas Teknik", "10 Oktober 2026");
        Tendik tendik = new Tendik("987654321", "Siti", "15 Juli 1980", "1 Maret 2010", 3000000, "Kemahasiswaan");


        System.out.println("\n=== Data Pegawai ===");
        dosenTetap.printInfo();
        System.out.println("\n----------------------\n");
        dosenTamu.printInfo();
        System.out.println("\n----------------------\n");
        tendik.printInfo();
    }
}
