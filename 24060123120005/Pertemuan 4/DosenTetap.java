/*
    Nama File : DosenTetap.java
    Deskripsi : Kelas yang merepresentasikan dosen tetap dengan NIDN dan tunjangan berdasarkan masa kerja
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 17 Maret 2025
*/


import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Pegawai {
    private String nidn;
    private String fakultas;
    private static final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String nidn,
            String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public LocalDate hitungBUP() {
        LocalDate bup = tglLahir.plusYears(BUP);
        return bup.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        Period masaKerja = hitungMasaKerja();
        System.out.println("NIDN: " + nidn);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kerja: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP: " + hitungBUP().format(formatter));
        System.out.println();
    }
}
