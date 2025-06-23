package pemetaanPajak;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    //Atribut
    private String nip;
    //static
    private static Integer counterPNS = 0;

    //Konstruktor
    public PNS(String nip, String nama, String tgl_mulai_kerja, String alamat, Integer pendapatan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //selektor nip
    public String getNip(){
        return this.nip;
    }
    //mutator nip
    public void setNip(String nip){
        this.nip = nip;
    }

    //abstract method hitung masa kerja
    public Integer hitungMasaKerja(){
        return (int) ChronoUnit.MONTHS.between(tgl_mulai_kerja, LocalDate.now());
    }

    //selektor static 
    public static Integer getCounterPNS(){
        return counterPNS;
    }

    //print info PNS
    @Override
    public void printInfo(){
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal mulai kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Pendapatan : Rp." + String.format("%,d", getPendapatan()).replace(',', '.'));
        System.out.println("Masa kerja : " + hitungMasaKerja() + " + (2)" + " bulan");
        System.out.println("Pajak : " + String.format("Rp %,.2f", hitungPajak()).replace(',', 'X').replace('.', ',').replace('X', '.'));
    }

    //Hitung pajak
    @Override
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }
}
