/*
 File         : Pegawai.java
 Deskripsi    : Superclass yang merepresentasikan pegawai, dengan gaji pokok dan metode tampilData().
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5_000_000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama     : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}

