/*
    Nama File : Pegawai.java
    Deskripsi : Kelas induk yang merepresentasikan data umum pegawai di perguruan tinggi
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 17 Maret 2025
*/


import java.time.LocalDate; // Untuk ambil tanggal tanpa jam
import java.time.Period; // Untuk hitung selisih waktu antara dua tanggal
import java.time.format.DateTimeFormatter; // Bikin tampilan tanggal agar rapi dan mudah dibaca

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // Formatter buat tampilan tanggal yang lebih rapi
    protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public LocalDate hitungBUP(int usiaBUP) {
        LocalDate bup = tglLahir.plusYears(usiaBUP);
        return bup.plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir.format(formatter));
        System.out.println("TMT: " + tmt.format(formatter));
        System.out.printf("Gaji Pokok: Rp %,.2f%n", gajiPokok);
    }
}
