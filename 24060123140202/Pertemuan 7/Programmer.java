/*
 * Nama File    : Programmer.java
 * Deskripsi    : Program untuk class programmer
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
    }
}
