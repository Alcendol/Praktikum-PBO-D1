package pertemuanlima;
/*  Nama File   : MManusia.java
 *  Deskripsi   : Driver program untuk menguji implementasi dari kelas PNS, Pengusaha, dan Petani yang telah dibuat sebelumnya.
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 23 Maret 2025
*/

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        pengusaha pe1 = new pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");
        petani pt1 = new petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        //OUTPUT JUMLAH OBJEK
        System.out.println("Jumlah Manusia     = " + manusia.getCounterMns());
        System.out.println("Jumlah PNS         = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha   = " + pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani      = " + petani.getCounterPetani());

        //OUTPUT PAJAK
        System.out.println("Pajak PNS p1       = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1   = " + pt1.hitungPajak());

        //OUTPUT MASA KERJA
        System.out.println("Masa Kerja p1      = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1     = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1     = " + pt1.hitungMasaKerja() + " tahun");

        //CETAK INFORMASI
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
        p2.cetakInfo();
    }
}