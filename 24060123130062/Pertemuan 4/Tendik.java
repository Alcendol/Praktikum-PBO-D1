package employee;
/*
 * Nama File    : Tendik.java
 * Deskripsi    : Program untuk Tendik
 * Pembuat      : Muhammad Mahdi Buntarwatangan / 24060123130062
 * Tanggal      : 12 Maret 2025
 */
import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan(){
        return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
    }

    public LocalDate hitungBUP(){
        return tanggalLahir.plusYears(55).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang: " + bidang);
        System.out.printf("Gaji Pokok: Rp %,d%n", (int) gajiPokok);
        System.out.printf("Tunjangan: Rp %,d%n", (int) hitungTunjangan());
    }
    
}
