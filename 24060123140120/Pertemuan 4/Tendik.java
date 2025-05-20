/* Nama File : Tendik.java
*  Deskripsi : Atribut dan Method class Tendik
*  Pembuat : Muhammad Shafwan Raihan S
*  Tanggal : 18 / 03 / 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    /*--------ATRIBUT--------*/
    private String bidang;
    private static final int BUP = 55;
    
    /*--------METHOD--------*/
    // Konstruktor Tendik
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    
    // Selektor bidang
    public String getbidang() {
        return bidang;
    }

    // Mutator bidang
    public void setbidang(String bidang) {
        this.bidang = bidang;
    }

    // Method menghitung Tunjangan
    private double getTunjanganTendik() {
        return 0.01 * Period.between(getTMT(), LocalDate.now()).getYears() * getgajiPokok();
    }
    
    // Method printInfo Tendik
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tenaga Kependidikan");
        System.out.println("Bidang: " + getbidang() + "");
        System.out.println("Masa Kerja: " + getMasaKerja() + "");
        System.out.println("BUP: " + getBUP(BUP));
        System.out.println("Tunjangan: 1% x " + getMasaKerja() + " x " + getgajiPokok() + " = " + getTunjanganTendik() + "");
    }
}