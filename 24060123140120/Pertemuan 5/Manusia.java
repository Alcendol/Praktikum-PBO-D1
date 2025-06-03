/* Nama File : Manusia.java
*  Deskripsi : Atribut dan Method abstract class Manusia
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 20 / 03 / 2025
*/

package pertemuan5;
import java.time.LocalDate;

public abstract class Manusia {

    /*--------ATRIBUT--------*/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns; // Menghitung jumlah instansiasi objek manusia
    
    /*--------METHOD--------*/
    // Konstruktor tanpa parameter
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
    }
    
    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++; 
    }

    // Selektor nama
    public String getNama() {
        return nama;
    }

    // Selektor tgl_mulai_kerja
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    // Selektor alamat
    public String getAlamat() {
        return alamat;
    }

    // Selektor pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // Selektor counterMns
    public static int getCounterMns(){
        return counterMns;
    }

    // Mutator nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mutator tgl_mulai_kerja
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Mutator alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Mutator pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Abstract Method hitungMasaKerja()
    public abstract int hitungMasaKerja();
    
    // Method cetakInfo() yang menampilkan seluruh informasi atribut dari class Manusia
    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Mulai Kerja: " + getTgl_mulai_kerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
    }
}


