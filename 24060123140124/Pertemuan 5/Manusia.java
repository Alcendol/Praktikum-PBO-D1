/*
 * Nama File    : Manusia.java
 * Deskripsi    : Program untuk class manusia
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 18 Maret 2025
 */
public class Manusia {
    private static int counterMns = 0;
    protected String nama;
    protected String alamat;
    protected String tglMulaiKerja;
    protected double pendapatan;

    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Pendapatan: " + pendapatan);
    }
}