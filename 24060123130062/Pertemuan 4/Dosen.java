package employee;
/*
 * Nama File    : Dosen.java
 * Deskripsi    : Program untuk Dosen
 * Pembuat      : Muhammad Mahdi Buntarwatangan / 24060123130062
 * Tanggal      : 12 Maret 2025
 */
public class Dosen extends Pegawai {
    //Atribut
    protected String fakultas;

    //Konstruktor
    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
    
}
