/* Nama File : DosenTetap.java
*  Deskripsi : Atribut dan Method class DosenTetap
*  Pembuat : Muhammad Shafwan Raihan S
*  Tanggal : 18 / 03 / 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Pegawai {
    /*--------ATRIBUT--------*/
    private String NIDN;
    private static final int BUP = 65;
    private String fakultas;
    
    /*--------METHOD--------*/
    // Konstruktor DosenTetap
    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
        this.fakultas = fakultas;
    }
    
    // Selektor NIDN
    public String getNIDN() {
        return NIDN;
    }

    // Mutator NIDN
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    //  Selektor fakultas
    public String getfakultas() {
        return fakultas;
    }

    // Mutator fakultas
    public void setfakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    // Method menghitung Tunjangan
    private double getTunjanganDosenTetap() {
        return 0.02 * Period.between(TMT, LocalDate.now()).getYears() * gajiPokok;
    }

    // Method printInfo DosenTetap
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("NIDN: " + getNIDN() + "");
        System.out.println("Fakultas: " + getfakultas() + "");
        System.out.println("Masa Kerja: " + getMasaKerja() + "");
        System.out.println("BUP: " + getBUP(BUP));
        System.out.println("Tunjangan: 2% x " + getMasaKerja() + " x " + getgajiPokok() + " = " + getTunjanganDosenTetap() + "");
    }
}