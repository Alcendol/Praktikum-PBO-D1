/**  
* File         : PNS.java   
* Deskripsi    : Class yang mewakili Pegawai Negeri Sipil
* Pembuat      : Muhammad Helmi Abdulbaqi
* NIM          : 24060123130076
* Tanggal      : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    // Constructors
    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        int A = 4; // Ganti dengan digit ke-14 NIM

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(tglMulaiKerja, formatter);
        LocalDate now = LocalDate.now();

        Period period = Period.between(startDate, now);
        return period.getYears() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
