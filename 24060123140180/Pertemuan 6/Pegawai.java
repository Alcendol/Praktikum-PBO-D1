package Pertemuan6;


public class Pegawai {
    /*=============== Atribut ===============*/
    private String nama;
    private int gajiPokok = 5000000;
    /*=============== Method ===============*/ 
    public Pegawai(){
        this.nama = "";
    }
    public Pegawai(String nama){
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama Pegawai    : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
    }
}