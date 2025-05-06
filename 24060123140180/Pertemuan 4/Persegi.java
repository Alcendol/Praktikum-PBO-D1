package Pertemuan4;
/*
 * Nama File    : Persegi.java
 * Deskripsi    : Membuat Subclass dari BangunDatar bernama Persegi
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        super(4, warna, border);
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getLuas(){
        return sisi * sisi;
    }
    public double getKeliling(){
        return 4 * sisi;
    }
    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    
}
