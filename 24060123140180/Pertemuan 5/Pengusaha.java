package Pertemuan5;
/*
 * Nama File    : Pengusaha.java
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 22 Maret 2025
 */
import java.time.LocalDate;
public class Pengusaha extends Manusia implements Pajak {
    /*========== Atribut ========== */
    private String npwp;
    private static int counterPengusaha = 0;

    /*========== Method ========== */
    public Pengusaha(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0;
        this.npwp = "";
        counterPengusaha++;
        counterMns++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        this.npwp = npwp;
        counterPengusaha++;
        counterMns++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        return now.getYear() - tgl_mulai_kerja.getYear() + 8;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP               : " + getNpwp());
        System.out.println("Masa Kerja         : " + hitungMasaKerja());
        System.out.println("\n");
    }

    
}
