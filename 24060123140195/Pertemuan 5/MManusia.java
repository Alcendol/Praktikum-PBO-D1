/*
 * Nama File    : MManusia.java
 * Deskripsi    : Program utama untuk menguji kelas Manusia dan subclass-nya (PNS, Pengusaha, Petani)
 *                dengan menampilkan informasi detail, menghitung pajak serta masa kerja, dan menampilkan
 *                jumlah total objek dari masing-masing kelas.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 22 Maret 2025
 */

 package pertemuan5;

 import java.time.LocalDate;
 
 public class MManusia {
     public static void main(String[] args) {
 
         // Membuat instansi objek berdasarkan data pegawai
         PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
         Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl.Air", 55000000, "000-556-773-212-000-5");
         Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
         PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), " ", 10000000, "198004212010041002");
         p2.setAlamat("Jl. Panorama 111 Tembalang");
 
         // Menampilkan data jumlah objek yang telah dibuat
         System.out.println("++++++ DATA JUMLAH OBJEK ++++++");
         System.out.println("Jumlah Manusia    = " + Manusia.getCounterMns());
         System.out.println("Jumlah PNS        = " + PNS.getCounterPNS());
         System.out.println("Jumlah Pengusaha  = " + Pengusaha.getCounterPengusaha());
         System.out.println("Jumlah Petani     = " + Petani.getCounterPetani());
 
         // Memanggil metode untuk menghitung pajak pada masing-masing objek
         System.out.println();
         System.out.println("~~~~~~ INFORMASI PAJAK ~~~~~~");
         System.out.println("Pajak PNS p1            = " + p1.hitungPajak());
         System.out.println("Pajak Pengusaha pe1     = " + pe1.hitungPajak());
         System.out.println("Pajak Petani pt1        = " + pt1.hitungPajak());
 
         // Memanggil metode untuk menghitung masa kerja
         System.out.println();
         System.out.println("====== DATA MASA KERJA ======");
         System.out.println("Masa Kerja p1           = " + p1.hitungMasaKerja());
         System.out.println("Masa Kerja pe1          = " + pe1.hitungMasaKerja());
         System.out.println("Masa Kerja pt1          = " + pt1.hitungMasaKerja());
 
         // Menampilkan informasi detail masing-masing pegawai
         System.out.println();
         System.out.println("++++++ INFORMASI LENGKAP ++++++");
         p1.cetakInfo();
         System.out.println();
         pe1.cetakInfo();
         System.out.println();
         pt1.cetakInfo();
         System.out.println();
         p2.cetakInfo();
     }
 }