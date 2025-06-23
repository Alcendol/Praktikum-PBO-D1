/*
 * Nama File    : Programmer.java
 * Deskripsi    : Subclass Pegawai, menambahkan atribut bonus (450.000)
 *                dan meng-override tampilData().
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 26 April 2025
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;
    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama:"+nama+",Gaji pokok:"+gajiPokok);
        System.out.println("Bonus:"+bonus);
    }
}
