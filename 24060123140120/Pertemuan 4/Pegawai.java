/* Nama File : Pegawai.java
*  Deskripsi : Atribut dan Method class Pegawai
*  Pembuat : Muhammad Shafwan Raihan S
*  Tanggal : 18 / 03 / 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    /*--------ATRIBUT--------*/
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

    /*--------METHOD--------*/
    // Konstruktor pegawai
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }
    
    // Selektor NIP
    public String getNIP() {
        return NIP;
    }

    // Selektor nama
    public String getnama() {
        return nama;
    }

    // Selektor tanggalLahir
    public LocalDate gettanggalLahir() {
        return tanggalLahir;
    }

    // Selektor TMT
    public LocalDate getTMT() {
        return TMT;
    }

    // Selektor gajiPokok
    public double getgajiPokok() {
        return gajiPokok;
    }

    // Mutator NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Mutator nama
    public void setnama(String nama) {
        this.nama = nama;
    }

    // Mutator tanggalLahir
    public void settanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    // Mutator TMT
    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    // Mutator gajiPokok
    public void setgajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method MasaKerja
    protected String getMasaKerja() {
        Period period = Period.between(getTMT(), LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }
    
    // Selektor format tanggal
    protected String getFormattedDate(LocalDate date) {
        return date.format(formatter);
    }

    // Method BUP
    protected String getBUP(int bup) {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1).format(formatter);
    }

    // Method printInfo pegawai
    public void printInfo() {
        System.out.println("NIP: " + getNIP() + "");
        System.out.println("Nama: " + getnama() + "");
        System.out.println("Tanggal Lahir: " + getFormattedDate(gettanggalLahir()));
        System.out.println("TMT: " + getFormattedDate(getTMT()));
        System.out.println("Gaji Pokok: Rp." + getgajiPokok());
    }
}





