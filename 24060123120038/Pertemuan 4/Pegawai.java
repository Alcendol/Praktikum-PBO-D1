package PerEmpat;
/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program untuk menunjukkan class pegawai
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 18 Maret 2025
*/
import java.util.Calendar;
import java.util.Date;
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
    
    public abstract double hitungTunjangan();
    public abstract Date hitungBUP();
    public abstract void printInfo();
    

    protected String formatTanggal(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                         "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        return cal.get(Calendar.DATE) + " " + bulan[cal.get(Calendar.MONTH)] + " " + cal.get(Calendar.YEAR);
    }
    
    protected String formatMasaKerja() {
        int[] masaKerja = hitungMasaKerja();
        return masaKerja[0] + " tahun " + masaKerja[1] + " bulan";
    }
}