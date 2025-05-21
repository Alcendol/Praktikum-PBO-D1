/*
 * Nama File    : Main.java
 * Deskripsi    : Membuat Objek dari class Dosentamu, DosenTetap, Tendik
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */

package Pertemuan4;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Dosen Tetap");
        DosenTetap D1 = new DosenTetap("123412", "Bagong", LocalDate.of(1986, 3, 26), LocalDate.of(2018, 5, 1),
        5000000, "9810012", "Fakultas Masyarakat Sosialis");
        
        D1.printInfo();
        System.out.println("\n=====================================================");
        System.out.println("\nDosen Tamu");

        DosenTamu DT1 = new DosenTamu("123501", "Neneng", LocalDate.of(1998, 5, 28),
        LocalDate.of(2023, 9, 20), 4500000, "98912314", "Fakultas Mojok Kiri", LocalDate.of(2040, 1, 1));

        DT1.printInfo();
        System.out.println("\n=====================================================");
        System.out.println("\nTenaga Pendidik");

        Tendik T1 = new Tendik("123614", "Irfan", LocalDate.of(1984, 4, 29),
        LocalDate.of(2013, 11, 30), 5500000, "Akademik");

        T1.printInfo();
        System.out.println("\n=====================================================");
    }
    
}
