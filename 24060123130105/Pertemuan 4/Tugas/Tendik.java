/*
 * Nama File    : Tendik.java
 * Deskripsi    : Kelas Tendik
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 16 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends pegawai{

    private String bidang;
    private LocalDate BUP;

    public Tendik() {
    }

    public Tendik(String NIP, String nama, LocalDate tglLahirDate, LocalDate tglMasukDate, double gaji, String bidang) {
        super(NIP, nama, tglLahirDate, tglMasukDate, gaji);
        this.bidang = bidang;
        setBUP();
        setTunjangan(0.01);
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public void setBUP() {
        this.BUP = getTglLahirDate().plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang          : " + getBidang());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));

        System.out.println("BUP             : " + formatter.format(getBUP()));
    }
    
}