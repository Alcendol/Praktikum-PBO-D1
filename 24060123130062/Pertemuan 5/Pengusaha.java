package pemetaanPajak;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    //Atribut
    private String npwp;
    private static Integer counterPengusaha = 0;

    //Konstruktor
    public Pengusaha(String npwp, String nama, String tgl_mulai_kerja, String alamat, Integer pendapatan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //selektor npwp
    public String getnpwp(){
        return this.npwp;
    }
    //mutator npwp
    public void setnpwp(String npwp){
        this.npwp = npwp;
    }

    //abstract method hitung masa kerja
    public Integer hitungMasaKerja(){
        return (int) ChronoUnit.MONTHS.between(tgl_mulai_kerja, LocalDate.now());
    }

    //selektor static 
    public static Integer getCounterPengusaha(){
        return counterPengusaha;
    }

    //print info Pengusaha
    @Override
    public void printInfo(){
        System.out.println("NPWP : " + getnpwp());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal mulai kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Pendapatan : Rp." + String.format("%,d", getPendapatan()).replace(',', '.'));
        System.out.println("Masa kerja : " + hitungMasaKerja() + " + (6)" + " bulan");
        System.out.println("Pajak : " + String.format("Rp %,.2f", hitungPajak()).replace(',', 'X').replace('.', ',').replace('X', '.'));
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }
}
