package pemetaanPajak;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia{
    //Atribut
    private String asal_kota;
    private static Integer counterPetani= 0;

    //Konstruktor
    public Petani(String asal_kota, String nama, String tgl_mulai_kerja, String alamat, Integer pendapatan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //selektor asal_kota
    public String getasal_kota(){
        return this.asal_kota;
    }
    //mutator asal_kota
    public void setasal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    //abstract method hitung masa kerja
    public Integer hitungMasaKerja(){
        return (int) ChronoUnit.MONTHS.between(tgl_mulai_kerja, LocalDate.now());
    }

    //selektor static 
    public static Integer getCounterPetani(){
        return counterPetani;
    }

    //print info Petani
    @Override
    public void printInfo(){
        System.out.println("Asal Kota : " + getasal_kota());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal mulai kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Pendapatan : Rp." + String.format("%,d", getPendapatan()).replace(',', '.'));
        System.out.println("Masa kerja : " + hitungMasaKerja() + " + (6)" + " bulan");
    }

    
}
