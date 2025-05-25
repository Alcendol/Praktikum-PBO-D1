/*
 * Nama File    : Manager.java
 * Deskripsi    : Subclass Pegawai, menambahkan atribut tunjangan (700.000)
 *                dan meng-override tampilData().
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */

public class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama) {
        setNama(nama);
    }
    @Override
    public void tampilData() {
        System.out.println("Nama:"+nama+",Gaji pokok:"+gajiPokok);
        System.out.println("Tunjangan:"+tunjangan);
    }
}
