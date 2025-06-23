/* Nama File    : Pengusaha.java
 * Deskripsi    : class Pengusaha
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 22/3/2025
 */ 

import java.time.LocalDate;
import java.time.Period;

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;
    
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 7;
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NPWP: " + npwp);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}