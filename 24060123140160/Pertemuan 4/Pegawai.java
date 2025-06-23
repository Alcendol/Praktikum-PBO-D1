/*
 * Nama File    : Pegawai.java
 * Deskripsi    : Program ini mendefinisikan kelas abstrak Pegawai yang menyimpan atribut umum seperti NIP, nama, tanggal lahir, TMT, dan gaji pokok, serta menyediakan kerangka dasar untuk pengembangan subclass seperti Dosen dan Tendik.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 16 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Pegawai {
    protected String NIP, nama;
    protected LocalDate tglLahir, TMT;
    protected double gajiPokok;


    public Pegawai(String NIP, String nama, String tglLahir, String TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir, DateTimeFormatter.ofPattern("d-M-yyyy"));
        this.TMT = LocalDate.parse(TMT, DateTimeFormatter.ofPattern("d-M-yyyy"));
        this.gajiPokok = gajiPokok;
    }


    public int getMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }


    public abstract void printInfo();
}
