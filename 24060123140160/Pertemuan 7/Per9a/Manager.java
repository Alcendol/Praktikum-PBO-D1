/*
 * Nama File    : Manager.java
 * Deskripsi    : Subclass Pegawai, menambahkan atribut tunjangan (700.000)
 *                dan meng-override tampilData().
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
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

