/* Nama File    : Manusia.java
 * Deskripsi    : class abstract Manusia
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 22/3/2025
 */ 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja() {
        return this.tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(String tgl_mulai_kerja) {
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }
    
    public abstract int hitungMasaKerja();
    
    public abstract void cetakInfo();
    
    public static int getCounterMns() {
        return counterMns;
    }
}