package employee;
/*
 * Nama File    : Pegawai.java
 * Deskripsi    : Program untuk pegawai
 * Pembuat      : Muhammad Mahdi Buntarwatangan / 24060123130062
 * Tanggal      : 12 Maret 2025
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    //Atribut
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;

    //Konstruktor
    public Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.TMT = LocalDate.parse(TMT, DateTimeFormatter.ofPattern("d-M-yyyy"));
        this.tanggalLahir = LocalDate.parse(tanggalLahir, DateTimeFormatter.ofPattern("d-M-yyyy"));
        this.gajiPokok = gajiPokok;
    }

    //Method menghitung masa kerja
    public Period hitungMasaKerja(){
        return Period.between(TMT, LocalDate.now());
    }

    //Print info pegawai
    public void printInfo(){
        
    }
}
