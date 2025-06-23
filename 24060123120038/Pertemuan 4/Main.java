package PerEmpat;
/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program untuk menunjukkan main
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 18 Maret 2025
*/
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            DosenTetap dosenTetap = new DosenTetap(
                "123456789", 
                "Asep", 
                dateFormat.parse("10-02-2000"), 
                dateFormat.parse("18-02-2016"), 
                5000000, 
                "Fakultas Sains dan Matematika", 
                "7654321"
            );

            DosenTamu dosenTamu = new DosenTamu(
                "456789012", 
                "James", 
                dateFormat.parse("12-05-2005"), 
                dateFormat.parse("03-10-2007"), 
                4500000, 
                "Fakultas Ilmu Budaya", 
                "234567",
                dateFormat.parse("21-06-2007")
            );
            
            Tendik tendik = new Tendik(
                "4321567890", 
                "Bobby", 
                dateFormat.parse("21-04-1979"), 
                dateFormat.parse("15-03-2016"), 
                3500000, 
                "Akademik"
            );
            
            System.out.println("Contoh tampilan informasi detail pegawai untuk Dosen Tetap:");
            System.out.println("----------------------------------------------------------------");
            dosenTetap.printInfo();
            System.out.println();
            
            System.out.println("Contoh tampilan informasi detail pegawai untuk Dosen Tamu:");
            System.out.println("----------------------------------------------------------------");
            dosenTamu.printInfo();
            System.out.println();
            
            System.out.println("Contoh tampilan informasi detail pegawai untuk Tendik:");
            System.out.println("----------------------------------------------------------------");
            tendik.printInfo();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}