/*  
    Nama File : Manusia.java  
    Deskripsi : Kelas abstrak yang merepresentasikan manusia dengan atribut nama, tanggal mulai kerja, alamat, dan pendapatan.  
    Pembuat   : Patricia Gabrielle Yudianto  
    NIM       : 24060123120005  
    Tanggal   : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.tglMulaiKerja, LocalDate.now());
    }

    public abstract double hitungPajak();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public static int getCounterMns() {
        return counterMns;
    }
}
