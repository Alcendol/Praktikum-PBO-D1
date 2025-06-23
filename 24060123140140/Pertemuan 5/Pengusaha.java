/*
 * Nama File    : Pengusaha.java
 * Deskripsi    : Kelas Pengusaha memuat atribut dan method untuk merepresentasikan objek Pengusaha.
 *                Kelas ini merupakan subclass dari Manusia dan mengimplementasikan interface Pajak,
 *                sehingga menyediakan fungsi untuk menghitung masa kerja dan pajak, serta menampilkan
 *                informasi lengkap tentang Pengusaha.
 * Pembuat      : RADITYA SAPUTRA / 24060123140140
 * Tanggal      : 22 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {

    /* ---------- ATRIBUT ---------- */
    private String npwp;
    private static int counterPengusaha;   // Menyimpan jumlah instansi objek Pengusaha yang telah dibuat

    /* ---------- METHOD ---------- */

    // Konstruktor kosong: Menginisialisasi atribut npwp dengan string kosong.
    public Pengusaha() {
        this.npwp = "";
    }

    // Konstruktor dengan parameter: Menginisialisasi objek Pengusaha dengan nilai-nilai yang diberikan,
    // serta menambahkan jumlah counter untuk setiap instansi yang dibuat.
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter untuk atribut npwp.
    public String getNpwp() {
        return npwp;
    }

    // Getter static untuk mendapatkan jumlah objek Pengusaha.
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Setter untuk mengubah nilai npwp.
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Mengimplementasikan method abstrak hitungMasaKerja() dari kelas Manusia,
    // dengan menambahkan nilai SHIFT sebesar 2 ke hasil perhitungan selisih tahun.
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 2;
    }

    // Mengimplementasikan method hitungPajak() dari interface Pajak,
    // yang menghitung pajak sebesar 15% dari pendapatan.
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    // Method cetakInfo() menampilkan informasi lengkap objek Pengusaha,
    // dengan memanggil cetakInfo() dari superclass Manusia dan menambahkan detail khusus.
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP        : " + getNpwp());
        System.out.println("Masa Kerja  : " + hitungMasaKerja());
        System.out.println("Pajak       : " + hitungPajak());
    }
}
