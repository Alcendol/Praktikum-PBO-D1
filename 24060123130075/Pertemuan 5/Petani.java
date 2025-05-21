/* Nama File    : Petani.java
 * Deskripsi    : class Petani
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 22/3/2025
 */ 

import java.time.LocalDate;
import java.time.Period;

class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;
    
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
}