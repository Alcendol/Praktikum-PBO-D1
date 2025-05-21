/**  
* File         : Manusia.java   
* Deskripsi    : Abstract class yang mewakili entitas Manusia dengan atribut dasar
*                dan method abstract untuk perhitungan masa kerja
* Pembuat      : Muhammad Helmi Abdulbaqi
* NIM          : 24060123130076
* Tanggal      : 22 Maret 2025  
*/

public abstract class Manusia {
    protected String nama;
    protected String tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;
    
    // Constructor
    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    // Constructor with null alamat
    public Manusia(String nama, String tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, null, pendapatan);
    }
    
    // Getters and setters
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(String tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    // Counter getter
    public static int getCounterMns() {
        return counterMns;
    }
    
    // Abstract methods
    public abstract int hitungMasaKerja();
    
    // Common methods
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
