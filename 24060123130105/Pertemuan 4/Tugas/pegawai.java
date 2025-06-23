/*
 * Nama File    : pegawai.java
 * Deskripsi    : Kelas pegawai
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 10 Maret 2025
 */

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.time.format.DateTimeFormatter;


public class pegawai {
    private String  NIP;
    private String  nama;
    private LocalDate tglLahirDate;  
    private LocalDate tglMasukDate; 
    private double  gaji;
    private double tunjangan;


public pegawai() {
    this.NIP = "";
    this.nama = "";
    this.tglLahirDate = LocalDate.now();
    this.tglMasukDate = LocalDate.now();
    this.gaji = 0;
}

public pegawai(String NIP, String nama, LocalDate tglLahirDate, LocalDate tglMasukDate, double gaji) {
    this.NIP = NIP;
    this.nama = nama;
    this.tglLahirDate = tglLahirDate;
    this.tglMasukDate = tglMasukDate;
    this.gaji = gaji;
}

public String getNIP() {
    return NIP;
}

public void setNIP(String NIP) {
    this.NIP = NIP;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public LocalDate getTglLahirDate() {
    return tglLahirDate;
}

public void setTglLahirDate(LocalDate tglLahirDate) {
    this.tglLahirDate = tglLahirDate;
}

public LocalDate getTglMasukDate() {
    return tglMasukDate;
}

public void setTglMasukDate(LocalDate tglMasukDate) {
    this.tglMasukDate = tglMasukDate;
}

public double getGaji() {
    return gaji;
}

public void setGaji(double gaji) {
    this.gaji = gaji;
}

public double getTunjangan() {
    return tunjangan;
}

public void setTunjangan(double tunjangan) {
    this.tunjangan = tunjangan;
}

public void printInfo() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));

    System.out.println("NIP             : " + getNIP());
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + formatter.format(getTglLahirDate()));
    System.out.println("TMT             : " + formatter.format(getTglMasukDate()));
    System.out.println("Masa kerja      : " + Period.between(getTglMasukDate(), LocalDate.now()).getYears() + " tahun"
                                            + " " + Period.between(getTglMasukDate(), LocalDate.now()).getMonths() + " bulan");
    DecimalFormat df = new DecimalFormat("#,###");
    System.out.println("Gaji            : Rp" + df.format(getGaji()));
    System.out.println("Tunjangan       : Rp" + df.format(getGaji() * getTunjangan() * Period.between(getTglMasukDate(), LocalDate.now()).getYears()));
}
}
