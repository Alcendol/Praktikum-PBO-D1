/* Nama File : MManusia.java
*  Deskripsi : Main program class Manusia
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 20 / 03 / 2025
*/

package pertemuan5;
import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        // Instansiasi Objek
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006,4,1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1,1), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1,9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010,4,1), " ",10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Pemanggilan fungsi getCounter()
        System.out.println("--------INFORMASI JUMLAH OBJEK--------");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        
        // Pemanggilan fungsi hitungPajak() 
        System.out.println();
        System.out.println("--------INFORMASI PAJAK--------");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        
        // Pemanggilan fungsi hitungMasaKerja()
        System.out.println();
        System.out.println("--------INFORMASI MASA KERJA--------");
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        
        // Pemanggilan fungsi cetakInfo()
        System.out.println();
        System.out.println("--------INFORMASI LENGKAP--------");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
        System.out.println();
        p2.cetakInfo();
    }
}
