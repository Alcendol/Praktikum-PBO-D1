/*
 * Nama File    : PNS.java
 * Deskripsi    : Kelas PNS menyimpan atribut dan method untuk merepresentasikan data PNS.
 *                Kelas ini merupakan subclass dari Manusia dan mengimplementasikan interface Pajak,
 *                sehingga menyediakan perhitungan masa kerja dan pajak sesuai ketentuan.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : 21 Maret 2025
 */

package per5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {

    /* ------------------ ATRIBUT ------------------ */
    private String nip;
    private static int counterPNS;   // Menyimpan jumlah instansiasi objek PNS

    /* ------------------ KONSTRUKTOR ------------------ */
    // Konstruktor tanpa parameter: menginisialisasi atribut nip dengan string kosong.
    public PNS() {
        this.nip = "";
    }

    // Konstruktor dengan parameter: 
    // Mengatur nilai-nilai atribut dari superclass dan atribut khusus PNS,
    // serta menambahkan counterPNS setiap kali objek baru dibuat.
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /* ------------------ SELEKTOR DAN MUTATOR ------------------ */
    // Mengembalikan nilai nip
    public String getNip() {
        return nip;
    }

    // Mengembalikan jumlah objek PNS yang telah diinstansiasi
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Mengubah nilai nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    /* ------------------ IMPLEMENTASI METHOD ABSTRACT/INTERFACE ------------------ */
    // Menghitung masa kerja PNS dengan menghitung selisih tahun antara tgl_mulai_kerja dan hari ini.
    // Nilai tambahan 0 digunakan sesuai ketentuan.
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 0;
    }

    // Menghitung pajak PNS sebagai 10% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    // Menampilkan seluruh informasi PNS, dengan memanggil cetakInfo() dari superclass
    // dan menambahkan informasi khusus untuk PNS seperti NIP, masa kerja, dan pajak.
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP        : " + getNip());
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak      : " + hitungPajak());
    }
}
