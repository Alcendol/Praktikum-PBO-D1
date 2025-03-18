package employee;
/*
 * Nama File    : DosenTetap.java
 * Deskripsi    : Program untuk Dosen Tetap
 * Pembuat      : Muhammad Mahdi Buntarwatangan / 24060123130062
 * Tanggal      : 12 Maret 2025
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen{
    //Konstruktor
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan(){
        return 0.02 * hitungMasaKerja().getYears() * gajiPokok;
    }

    public LocalDate hitungBUP(){
        return tanggalLahir.plusYears(65).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP: " + NIP);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        System.out.println("TMT: " + TMT.format(fmt));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        Period masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP: " + hitungBUP().format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        System.out.printf("Gaji Pokok: Rp %,d%n", (int) gajiPokok);
        System.out.printf("Tunjangan: Rp %,d%n", (int) hitungTunjangan());
    }
}
