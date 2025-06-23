/*Nama File  : Tendik.java
 * Deskripsi : Program penggunaan inheritance pada class dosen
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : 15 Maret 2025
 * */

package pertemuanEmpat;

import java.util.Calendar;
import java.util.Date;

/**
 * Class Tendik sebagai subclass dari Pegawai
 */
public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;
    
    public Tendik(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    
    public String getBidang() {
        return bidang;
    }
    
    @Override
    public double hitungTunjangan() {
        // Tunjangan tendik = 1% x masa kerja (dalam tahun) x gaji pokok
        return 0.01 * hitungMasaKerja()[0] * getGajiPokok();
    }
    
    @Override
    public Date hitungBUP() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getTanggalLahir());
        
        // Tambahkan usia BUP ke tahun lahir
        calendar.add(Calendar.YEAR, BUP);
        
        // Set tanggal ke 1
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        // Tambahkan 1 bulan
        calendar.add(Calendar.MONTH, 1);
        
        return calendar.getTime();
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP            : " + getNIP());
        System.out.println("Nama           : " + getNama());
        System.out.println("Tanggal Lahir  : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT            : " + formatTanggal(getTMT()));
        System.out.println("Jabatan        : Tenaga Kependidikan");
        System.out.println("Bidang         : " + getBidang());
        System.out.println("Masa Kerja     : " + formatMasaKerja());
        System.out.println("BUP            : " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok     : Rp " + String.format("%,.2f", getGajiPokok()));
        
        int[] masaKerja = hitungMasaKerja();
        System.out.println("Tunjangan      : 1% x " + masaKerja[0] + " x Rp " + 
                          String.format("%,.2f", getGajiPokok()) + " = Rp " + 
                          String.format("%,.2f", hitungTunjangan()));
    }
}
