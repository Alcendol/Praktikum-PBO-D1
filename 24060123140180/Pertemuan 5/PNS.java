package Pertemuan5;
import java.time.LocalDate;
/*
 * Nama File    : Pegawai.java
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 22 Maret 2025
 */

public class PNS extends Manusia implements Pajak {
    /*========== Atribut ========== */
    private String nip;
    private static int counterPNS = 0;

    /*========== Method ========== */
    public PNS(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0;
        this.nip = "";
        counterPNS++;
        counterMns++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        this.nip = nip;
        counterPNS++;
        counterMns++;

    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
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
        return now.getYear() - tgl_mulai_kerja.getYear() + 0;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }


    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.1;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP                : " + getNip());
        System.out.println("Masa Kerja         : " + hitungMasaKerja());
        System.out.println("\n");
    }
    
}
