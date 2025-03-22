package Pertemuan5;
import java.time.LocalDate;
public class Petani extends Manusia implements Pajak {
    /*========== Atribut ========== */
    private String asal_kota;
    private static int counterPetani = 0;
    /*========== Method ========== */
    public Petani(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0;
        this.asal_kota = "";
        counterPetani++;
        counterMns++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        this.asal_kota = asal_kota;
        counterPetani++;
        counterMns++;
    }

    public String getAsal_Kota(){
        return asal_kota;
    }

    public void setAsal_Kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        return now.getYear() - tgl_mulai_kerja.getYear() + 1;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kot           : " + getAsal_Kota());
        System.out.println("Masa Kerja         : " + hitungMasaKerja());
        System.out.println("\n");
    }


    
}
