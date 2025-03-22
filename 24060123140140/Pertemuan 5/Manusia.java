/*
 * Nama File    : Manusia.java
 * Deskripsi    : Kelas abstrak Manusia yang memuat atribut dasar (nama, tgl_mulai_kerja, alamat, pendapatan)
 *                serta method untuk menghitung masa kerja (abstrak) dan mencetak informasi (cetakInfo).
 * Pembuat      : RADITYA SAPUTRA / 24060123140140
 * Tanggal      : 22 Maret 2025
 */
import java.time.LocalDate;

public abstract class Manusia {

    /* ------------------ ATRIBUT ------------------ */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns; // Menghitung jumlah instansiasi objek Manusia

    /* ------------------ KONSTRUKTOR ------------------ */

    // Konstruktor tanpa parameter
    public Manusia() {
        this.nama             = "";
        this.tgl_mulai_kerja  = LocalDate.now();
        this.alamat           = "";
        this.pendapatan       = 0.0;
    }

    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama             = nama;
        this.tgl_mulai_kerja  = tgl_mulai_kerja;
        this.alamat           = alamat;
        this.pendapatan       = pendapatan;
        counterMns++; 
    }

    /* ------------------ SELEKTOR (GETTER) ------------------ */

    public String getNama() {
        return nama;
    }

    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    /* ------------------ MUTATOR (SETTER) ------------------ */

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /* 
     * Abstract method hitungMasaKerja()
     * Implementasi spesifik diserahkan kepada subclass yang mewarisi kelas ini.
     */
    public abstract int hitungMasaKerja();

    /*
     * Method cetakInfo() menampilkan seluruh informasi atribut dari class Manusia,
     * sementara detail tambahan dapat ditambahkan di subclass (misal: NIP, No ID, dsb.).
     */
    public void cetakInfo() {
        System.out.println("Nama                : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());
    }
}
