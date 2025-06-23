/*
    Nama File : Tendik.java
    Deskripsi : Kelas yang merepresentasikan tenaga kependidikan dengan bidang kerja tertentu
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 17 Maret 2025
*/
    

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public LocalDate hitungBUP() {
        LocalDate bup = tglLahir.plusYears(BUP);
        return bup.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        Period masaKerja = hitungMasaKerja();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP: " + hitungBUP().format(formatter));
        System.out.println();
    }
}
