/*
 * Nama File    : Dosen.java
 * Deskripsi    : Program ini mendefinisikan kelas Dosen yang menyimpan data identitas dosen seperti NIP, nama, dan program studi, serta menyediakan method untuk mengakses dan memodifikasi data tersebut.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 16 Maret 2025
 */

class Dosen extends Pegawai {

    protected String Fakultas;

    public Dosen(String NIP, String nama, String tglLahir, String TMT, double gajiPokok, String Fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo() {
        // Implementasi method printInfo() dapat ditambahkan di sini
    }
}
