package pemetaanPajak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    //Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected Integer pendapatan;

    //Static
    private static Integer counterMns = 0;

    //Konstruktor
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, Integer pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, DateTimeFormatter.ofPattern("d-M-yyyy"));
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    

    //Selektor nama
    public String getNama(){
        return this.nama;
    }
    //Mutator nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Selektor tanggal kerja
    public String getTgl_mulai_kerja(){
        return tgl_mulai_kerja.toString();
    }

    //Mutator tanggal kerja
    public void  setTgl_mulai_kerja(String tgl_mulai_kerja){
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    //Selektor alamat
    public String getAlamat(){
        return this.alamat;
    }
    //Mutator alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //Selektor pendapatan
    public Integer getPendapatan(){
        return this.pendapatan;
    }
    //Mutator pendapatan
    public void setPendapatan(Integer pendapatan){
        this.pendapatan = pendapatan;
    }

    //Selektor static
    public static Integer getCounterMns(){
        return counterMns;
    }

    //print info
    public void printInfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal mulai kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Pendapatan : " + getPendapatan());
    }

    //hitung masa kerja
    public abstract Integer hitungMasaKerja();
}
