/*
 * Nama File    : Petani.java
 * Deskripsi    : Kelas yang merepresentasikan petani
 * Pembuat      : Nadzif Silakhudin / 24060123130105
 * Tanggal      : 22 Maret 2025
 */
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {

    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    public String getAsalKota() {
        return this.asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    public int hitungMasaKerja() {
        return Period.between(getTglMulaiKerja(), LocalDate.now()).getYears() + 1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + this.asal_kota);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja() + " tahun");
    }
    
}
