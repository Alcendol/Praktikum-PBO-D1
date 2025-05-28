/*
 * Nama File    : DosenTetap.java
 * Deskripsi    : Program ini mengimplementasikan kelas DosenTetap sebagai representasi dosen tetap, dengan atribut tambahan seperti NIDN dan mekanisme perhitungan BUP serta tunjangan berdasarkan masa kerja.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 16 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {

    private String NIDN;
    private static final int BUP = 65;


    public DosenTetap(String NIP, String NIDN, String nama, String tglLahir, String TMT, double gajiPokok, String Fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }


    public double getTunjangan() {
        return 0.02 * getMasaKerja() * gajiPokok;
    }


    public LocalDate getBUP() {
        return tglLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }


    @Override
    public void printInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP : " + NIP);
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir.format(fmt));
        System.out.println("TMT : " + TMT.format(fmt));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + Fakultas);
        System.out.println("Masa Kerja : " + getMasaKerja() + " tahun");
        System.out.println("BUP : " + getBUP().format(fmt));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}
