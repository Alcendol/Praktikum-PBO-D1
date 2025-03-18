/*Nama File  : DosenTamu.java
 * Deskripsi : Program penggunaan inheritance pada class dosen Tamu
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : 15 Maret 2025
 * */

 package pertemuanEmpat;
 import java.util.Calendar;
 import java.util.Date;
 
 public class DosenTamu extends Dosen {
     private String NIDK;
     private Date tanggalBerakhirKontrak;
     
     public DosenTamu(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String fakultas, String NIDK, Date tanggalBerakhirKontrak) {
         super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
         this.NIDK = NIDK;
         this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
     }
     
     public String getNIDK() {
         return NIDK;
     }
     
     public Date getTanggalBerakhirKontrak() {
         return tanggalBerakhirKontrak;
     }
     
     /**
      * Menghitung sisa masa kontrak dalam bulan
      * @return jumlah bulan sisa kontrak
      */
     public int hitungSisaKontrak() {
         Calendar today = Calendar.getInstance();
         Calendar kontrak = Calendar.getInstance();
         kontrak.setTime(tanggalBerakhirKontrak);
         
         int bulan = (kontrak.get(Calendar.YEAR) - today.get(Calendar.YEAR)) * 12 + 
                     (kontrak.get(Calendar.MONTH) - today.get(Calendar.MONTH));
         
         return bulan;
     }
     
     @Override
     public double hitungTunjangan() {
         // Tunjangan dosen tamu = 2,5% x gaji pokok
         return 0.025 * getGajiPokok();
     }
     
     @Override
     public Date hitungBUP() {
         // Dosen tamu tidak memiliki BUP, melainkan tanggal berakhir kontrak
         return tanggalBerakhirKontrak;
     }
     
     @Override
     public void printInfo() {
         System.out.println("NIP            : " + getNIP());
         System.out.println("NIDK           : " + getNIDK());
         System.out.println("Nama           : " + getNama());
         System.out.println("Tanggal Lahir  : " + formatTanggal(getTanggalLahir()));
         System.out.println("TMT            : " + formatTanggal(getTMT()));
         System.out.println("Jabatan        : Dosen Tamu");
         System.out.println("Fakultas       : " + getFakultas());
         System.out.println("Masa Kerja     : " + formatMasaKerja());
         System.out.println("Masa Kontrak   : " + hitungSisaKontrak() + " bulan");
         System.out.println("Gaji Pokok     : Rp " + String.format("%,.2f", getGajiPokok()));
         System.out.println("Tunjangan      : 2,5% x Rp " + String.format("%,.2f", getGajiPokok()) + 
                            " = Rp " + String.format("%,.2f", hitungTunjangan()));
     }
 }
