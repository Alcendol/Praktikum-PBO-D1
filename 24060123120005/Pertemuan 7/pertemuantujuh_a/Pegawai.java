/*
 * Nama File : Pegawai.java
 * Deskripsi : Superclass yang merepresentasikan karyawan umum
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + "Gaji Pokok : " + gajiPokok);
    }
}
