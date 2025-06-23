/*
 * Nama File    : Pegawai.java
 * Deskripsi    : Superclass Pegawai dengan atribut nama dan gajiPokok (default 5.000.000),
 *                serta method setNama() dan tampilData() (akan di-override).
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama:"+nama+",Gaji pokok:"+gajiPokok);
    }
}