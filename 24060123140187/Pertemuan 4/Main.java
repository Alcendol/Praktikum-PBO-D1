/*Nama File  : main.java
 * Deskripsi : Program penggunaan inheritance pada class dosen
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : 15 Maret 2025
 * */

package pertemuanEmpat;
import java.text.SimpleDateFormat;

// Class Main untuk menguji implementasi
public class Main {
    public static void main(String[] args) {
        try {
            // Format tanggal: dd-MM-yyyy
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            // Contoh pembuatan objek DosenTetap seperti contoh
            DosenTetap dosenTetap = new DosenTetap(
                "123456789", 
                "NAIFAH", 
                dateFormat.parse("22-22-2000"), 
                dateFormat.parse("11-11-2011"), 
                4500000, 
                "Fakultas Sains dan Matematika", 
                "9876543"
            );
            
            // Contoh pembuatan objek DosenTamu
            DosenTamu dosenTamu = new DosenTamu(
                "96325874999", 
                "Nara", 
                dateFormat.parse("18-02-1997"), 
                dateFormat.parse("02-03-2023"), 
                4700000, 
                "Fakultas Ekonomi dan Bisnis", 
                "89657432",
                dateFormat.parse("30-12-2029")
            );
            
            // Contoh pembuatan objek Tendik
            Tendik tendik = new Tendik(
                "9563214780", 
                "Helmie", 
                dateFormat.parse("23-11-1988"), 
                dateFormat.parse("15-03-2016"), 
                3500000, 
                "Akademik"
            );
            
            System.out.println("Contoh tampilan informasi detail pegawai untuk Dosen Tetap:");
            System.out.println("----------------------------------------------------------------");
            dosenTetap.printInfo();
            System.out.println("----------------------------------------------------------------");
            System.out.println();
            
            System.out.println("Contoh tampilan informasi detail pegawai untuk Dosen Tamu:");
            System.out.println("----------------------------------------------------------------");
            dosenTamu.printInfo();
            System.out.println("----------------------------------------------------------------");
            System.out.println();
            
            System.out.println("Contoh tampilan informasi detail pegawai untuk Tendik:");
            System.out.println("----------------------------------------------------------------");
            tendik.printInfo();
            System.out.println("----------------------------------------------------------------");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}