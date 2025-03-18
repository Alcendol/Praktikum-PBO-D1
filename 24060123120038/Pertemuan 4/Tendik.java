package PerEmpat;
/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program untuk menunjukkan class tendik
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 18 Maret 2025
*/

import java.util.Calendar;
import java.util.Date;

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
        return 0.01 * hitungMasaKerja()[0] * getGajiPokok();
    }
    
    @Override
    public Date hitungBUP() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getTanggalLahir());
        calendar.add(Calendar.YEAR, BUP);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
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
