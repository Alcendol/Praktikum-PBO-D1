package PerEmpat;
/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program untuk menunjukkan class dosen tetap
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 18 Maret 2025
*/

import java.util.Calendar;
import java.util.Date;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;
    
    public DosenTetap(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }
    
    public String getNIDN() {
        return NIDN;
    }
    
    @Override
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja()[0] * getGajiPokok();
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
        System.out.println("NIDN           : " + getNIDN());
        System.out.println("Nama           : " + getNama());
        System.out.println("Tanggal Lahir  : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT            : " + formatTanggal(getTMT()));
        System.out.println("Jabatan        : Dosen Tetap");
        System.out.println("Fakultas       : " + getFakultas());
        System.out.println("Masa Kerja     : " + formatMasaKerja());
        System.out.println("BUP            : " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok     : Rp " + String.format("%,.2f", getGajiPokok()));
        
        int[] masaKerja = hitungMasaKerja();
        System.out.println("Tunjangan      : 2% x " + masaKerja[0] + " x Rp " + 
                           String.format("%,.2f", getGajiPokok()) + " = Rp " + 
                           String.format("%,.2f", hitungTunjangan()));
    }
}
