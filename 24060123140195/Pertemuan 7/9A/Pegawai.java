/*
 * Nama File    : Pegawai.java
 * Deskripsi    : Kelas dasar untuk mewakili pegawai dengan atribut nama dan gaji pokok, serta method tampilData().
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 26 april 2025
 */

 class Pegawai {

    protected String nama;

    protected final int gajiPokok = 5000000;


    // Constructor
    public Pegawai(String nama) {
        this.nama = nama;
    }


    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }


    // Method untuk menampilkan data pegawai
    public void tampilData() {
        System.out.println(
            "Nama : " + this.nama +
            ", Gaji pokok : " + this.gajiPokok
        );
    }

}
