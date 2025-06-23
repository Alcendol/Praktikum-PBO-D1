/*
 * Nama File    : Manager.java
 * Deskripsi    : Program untuk class Manager
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}
