/*
    Nama File : Pegawai.java
    Deskripsi : Kelas induk yang merepresentasikan data umum pegawai di perguruan tinggi
    Pembuat   : Muhammad Paruda Pradayan
    NIM       : 24060123140124
    Tanggal   : 17 Maret 2025
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
