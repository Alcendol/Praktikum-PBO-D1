/*
 * Nama File    : Petani.java
 * Deskripsi    : Kelas Petani menyimpan atribut dan method untuk merepresentasikan data petani,
 *                termasuk asal kota, perhitungan masa kerja, dan perhitungan pajak (untuk petani, pajak = 0).
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 21 Maret 2025
 */

package per5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {

    /* --------------- ATRIBUT --------------- */
    private String asal_kota;
    private static int counterPetani;  // Menghitung jumlah objek Petani yang diinstansiasi

    /* --------------- KONSTRUKTOR ---------------- */
    // Konstruktor tanpa parameter: menginisialisasi atribut asal_kota dengan string kosong.
    public Petani() {
        this.asal_kota = "";
    }

    // Konstruktor dengan parameter: mengatur atribut dari superclass dan atribut khusus Petani,
    // serta menambah counter untuk objek Petani.
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /* --------------- SELEKTOR DAN MUTATOR --------------- */
    // Selektor untuk atribut asal_kota.
    public String getAsal_kota() {
        return asal_kota;
    }

    // Selektor untuk counterPetani.
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Mutator untuk mengubah nilai asal_kota.
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    /* --------------- IMPLEMENTASI METHOD ABSTRACT DAN INTERFACE --------------- */
    // Implementasi method hitungMasaKerja() dari kelas Manusia.
    // Menghitung selisih tahun antara tanggal mulai kerja dan hari ini, kemudian menambahkan 1.
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 1;
    }

    // Implementasi method hitungPajak() dari interface Pajak, yang untuk Petani menghasilkan 0.
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Method cetakInfo() untuk menampilkan informasi lengkap dari objek Petani.
    // Memanggil cetakInfo() dari superclass dan menambahkan informasi khusus Petani.
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota  : " + getAsal_kota());
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak      : " + hitungPajak());
    }
}
