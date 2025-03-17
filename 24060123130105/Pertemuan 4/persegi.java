/*
 * Nama File    : persegi.java
 * Deskripsi    : Kelas persegi
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 10 Maret 2025
 */

public class persegi extends bangunDatar {
    
    private double sisi;
    
    public persegi(){
        setJmlSisi(4);   
    }

    public persegi(double sisi, String warna, String border){
        setWarna(warna);
        setBorder(border);       
        this.sisi = sisi;
        setJmlSisi(4);
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public double diagonal(){
        return Math.sqrt(sisi*sisi*2);
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }
}
