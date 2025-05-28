/* Nama File : MPegawai.java
*  Deskripsi : Main program superclass pegawai dan subclass nya
*  Pembuat : Muhammad Shafwan Raihan S
*  Tanggal : 18 / 03 / 2025
*/

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // Instansiasi objek
        DosenTetap Andi = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        DosenTamu Reza = new DosenTamu("1234567890", "Reza", LocalDate.of(1985, 8, 10), LocalDate.of(2018, 6, 15), 4500000, "Fakultas Teknik", "5678901234", LocalDate.now().plusMonths(6));
        Tendik Banu = new Tendik("24060123140120", "Banu", LocalDate.of(1970, 2, 3), LocalDate.of(2005,8,28), 8000000, "IT Support");
        
        // printInfo objek
        Andi.printInfo();
        System.out.println();
        Reza.printInfo();
        System.out.println();
        Banu.printInfo();

    }
}
