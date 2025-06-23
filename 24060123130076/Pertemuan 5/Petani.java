/**  
* File         : Petani.java   
* Deskripsi    : Class yang mewakili Petani, turunan dari Manusia
* Pembuat      : Muhammad Helmi Abdulbaqi
* NIM          : 24060123130076
* Tanggal      : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Petani extends Manusia implements Pajak {
    private String kotaLadang;
    private static int counterPetani = 0;

    // Constructors
    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String kotaLadang) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.kotaLadang = kotaLadang;
        counterPetani++;
    }

    public Petani(String nama, String tglMulaiKerja, double pendapatan, String kotaLadang) {
        super(nama, tglMulaiKerja, pendapatan);
        this.kotaLadang = kotaLadang;
        counterPetani++;
    }

    // Getter dan setter
    public String getKotaLadang() {
        return kotaLadang;
    }

    public void setKotaLadang(String kotaLadang) {
        this.kotaLadang = kotaLadang;
    }

    // Counter getter
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Implementasi metode Abstrak
    @Override
    public int hitungMasaKerja() {
        int C = 2; // Ganti dengan digit ke-12 NIM

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(tglMulaiKerja, formatter);
        LocalDate now = LocalDate.now();

        Period period = Period.between(startDate, now);
        return period.getYears() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kota Ladang: " + kotaLadang);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
