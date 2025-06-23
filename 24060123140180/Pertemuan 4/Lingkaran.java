package Pertemuan4;
/*
 * Nama File    : Lingkaran.java
 * Deskripsi    : Membuat Subclass dari BangunDatar bernama Lingkaran
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */


public class Lingkaran extends BangunDatar {
    private double jari;

    // Constructor
    public Lingkaran(){
        setJmlSisi(1);
    }
    
    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        super(1, warna, border);
    }

    // Method Set dan get
    public double getJari(){
        return jari;
    }
    
    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return 3.14*(jari*jari);
    }

    public double getKeliling(){
        return 2*3.14*jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari : " + jari);
    }
}   
