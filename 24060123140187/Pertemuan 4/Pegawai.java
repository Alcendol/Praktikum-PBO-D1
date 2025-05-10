/*Nama File  : Pegawai.java
 * Deskripsi : Program penggunaan inheritance pada class dosen
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : 15 Maret 2025
 * */

 package pertemuanEmpat;

 import java.util.Calendar;
 import java.util.Date;
 
 /**
  * Class abstract Pegawai sebagai parent class
  */
 public abstract class Pegawai {
     private String NIP;
     private String nama;
     private Date tanggalLahir;
     private Date TMT;
     private double gajiPokok;
     
     public Pegawai(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok) {
         this.NIP = NIP;
         this.nama = nama;
         this.tanggalLahir = tanggalLahir;
         this.TMT = TMT;
         this.gajiPokok = gajiPokok;
     }
     
     public String getNIP() {
         return NIP;
     }
     
     public String getNama() {
         return nama;
     }
     
     public Date getTanggalLahir() {
         return tanggalLahir;
     }
     
     public Date getTMT() {
         return TMT;
     }
     
     public double getGajiPokok() {
         return gajiPokok;
     }
     
     /**
      * Menghitung masa kerja dari TMT hingga saat ini
      * @return array dengan elemen pertama adalah tahun dan elemen kedua adalah bulan
      */
     public int[] hitungMasaKerja() {
         Calendar tmt = Calendar.getInstance();
         tmt.setTime(TMT);
         
         Calendar today = Calendar.getInstance();
         
         int tahun = today.get(Calendar.YEAR) - tmt.get(Calendar.YEAR);
         int bulan = today.get(Calendar.MONTH) - tmt.get(Calendar.MONTH);
         
         if (bulan < 0) {
             tahun--;
             bulan += 12;
         }
         
         return new int[]{tahun, bulan};
     }
     
     // Method abstract yang akan diimplementasikan oleh subclass
     public abstract double hitungTunjangan();
     public abstract Date hitungBUP();
     public abstract void printInfo();
     
     /**
      * Format tanggal sesuai contoh: 5 Mei 1990
      * @param date Tanggal yang akan diformat
      * @return String format tanggal
      */
     protected String formatTanggal(Date date) {
         Calendar cal = Calendar.getInstance();
         cal.setTime(date);
         
         String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
         
         return cal.get(Calendar.DATE) + " " + bulan[cal.get(Calendar.MONTH)] + " " + cal.get(Calendar.YEAR);
     }
     
     /**
      * Format masa kerja: 10 tahun 2 bulan
      * @return String format masa kerja
      */
     protected String formatMasaKerja() {
         int[] masaKerja = hitungMasaKerja();
         return masaKerja[0] + " tahun " + masaKerja[1] + " bulan";
     }
 }