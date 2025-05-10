/**  
* File         : Pengusaha.java   
* Deskripsi    : Class yang mewakili Pengusaha, turunan dari Manusia
* Pembuat      : Muhammad Helmi Abdulbaqi
* NIM          : 24060123130076
* Tanggal      : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    // Constructors
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public Pengusaha(String nama, String tglMulaiKerja, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getters and setters
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Counter getter
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Implementing abstract methods
    @Override
    public int hitungMasaKerja() {
        int B = 1; // Ganti dengan digit ke-13 NIM

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(tglMulaiKerja, formatter);
        LocalDate now = LocalDate.now();

        Period period = Period.between(startDate, now);
        return period.getYears() + B;
    }

    // implementasi interface methods
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}