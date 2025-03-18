/*
    Nama File : Main2.java
    Deskripsi : Program Main
    Pembuat   : Muhammad Paruda Pradayan
    NIM       : 24060123140124
    Tanggal   : 17 Maret 2025
*/

class Main2 {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Andi", "5-5-1990", "1-1-2015", 5000000, "Fakultas Sains dan Matematika");
        DosenTamu dosenTamu = new DosenTamu("123456789", "87654321", "Budi", "10-10-1985", "1-1-2020", 4000000, "Fakultas Teknik", "10-10-2026");
        Tendik tendik = new Tendik("987654321", "Siti", "15-7-1980", "1-3-2010", 3000000, "Kemahasiswaan");

        System.out.println("\n=== Data Pegawai ===");
        dosenTetap.printInfo();
        System.out.println("\n----------------------\n");
        dosenTamu.printInfo();
        System.out.println("\n----------------------\n");
        tendik.printInfo();
    }
}