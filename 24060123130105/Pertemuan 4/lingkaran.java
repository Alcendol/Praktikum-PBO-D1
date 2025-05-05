/*
 * Nama File    : kibgjarab.java
 * Deskripsi    : Kelas lingkaran
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 10 Maret 2025
 */
public class lingkaran extends bangunDatar {
    private double jari;


    public lingkaran(){
        setJmlSisi(0);
    }

    public lingkaran(double diameter, String warna, String border){
        setWarna(warna);
        setBorder(border);
        this.jari = diameter/2;
        setJmlSisi(0);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }

    
}
