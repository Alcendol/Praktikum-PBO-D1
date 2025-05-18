/*
    Nama File : Main2.java
    Deskripsi : Kelas utama untuk menjalankan program dan menampilkan informasi pegawai
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
                
    Tanggal   : 17 Maret 2025
*/

                

import java.time.LocalDate;

                
public class Main2 {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("123456", "Dr. John", LocalDate.of(1980, 5, 15), LocalDate.of(2005, 3, 1), 8_000_000, "001", "Teknik");
        dosenTetap.printInfo();

        DosenTamu dosenTamu = new DosenTamu("654321", "Prof. Jane", LocalDate.of(1975, 7, 20), LocalDate.of(2015, 9, 1), 7_000_000, "002", "Sastra", LocalDate.of(2025, 9, 1));
        dosenTamu.printInfo();

        Tendik tendik = new Tendik("789012", "Budi", LocalDate.of(1990, 1, 10), LocalDate.of(2010, 6, 15), 5_000_000, "Administrasi");
        tendik.printInfo();
    }
}
