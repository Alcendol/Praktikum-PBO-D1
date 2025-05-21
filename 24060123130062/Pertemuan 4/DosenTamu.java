package employee;
/*
 * Nama File    : DosenTamu.java
 * Deskripsi    : Program untuk Dosen Tamu
 * Pembuat      : Muhammad Mahdi Buntarwatangan / 24060123130062
 * Tanggal      : 12 Maret 2025
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen{
    //Atribut
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String NIP, String NIDK, String nama, String tangggalLahir, String TMT, Integer gajiPokok, String fakultas, String tanggalAkhirKontrak){
        super(NIP, nama, tangggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = LocalDate.parse(tanggalAkhirKontrak, DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    public int hitungMasaKontrak(){
        return Period.between(LocalDate.now(), tanggalAkhirKontrak).getMonths();
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        System.out.println("TMT: " + TMT.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kontrak Berakhir: " + tanggalAkhirKontrak.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        System.out.printf("Gaji Pokok: Rp %,d%n", (int) gajiPokok);
        System.out.printf("Tunjangan: Rp %,d%n", (int) hitungTunjangan());
    }
}
