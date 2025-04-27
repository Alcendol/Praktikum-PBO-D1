/*
 * Nama File    : Pegawai.java
 * Deskripsi    : Program untuk class pegawai
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 24 April 2025
 */
class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}