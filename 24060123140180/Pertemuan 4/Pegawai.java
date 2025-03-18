/*
 * Nama File    : Pegawai.java
 * Deskripsi    : Membuat Superclass bernama Pegawai
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */

package Pertemuan4;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /*========== Atribut ========== */
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    protected double Tunjangan;
    /*========== Method ========== */
    public Pegawai(){
        this.NIP = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.gajiPokok = 0;
        
    }
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this. gajiPokok = gajiPokok;
    }

    // Setter dan Getter
    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return Tunjangan;
    }

    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    // PrintInfo
    public void printInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        System.out.println("NIP           : " + getNIP());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + formatter.format(tanggalLahir));
        System.out.println("TMT           : " + formatter.format(TMT));
        System.out.println("Masa kerja    : " + Period.between(getTMT(), LocalDate.now()).getYears() + " tahun"
                                            + " " + Period.between(getTMT(), LocalDate.now()).getMonths() + " bulan");

        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Gaji          : Rp." + df.format(getGajiPokok()));
        

    }


}
