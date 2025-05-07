/* Nama File    : PNS.java
 * Deskripsi    : class PNS
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 22/3/2025
 */ 

import java.time.LocalDate;
import java.time.Period;

class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 5;
    }
    
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    
    public static int getCounterPNS() {
        return counterPNS;
    }
}