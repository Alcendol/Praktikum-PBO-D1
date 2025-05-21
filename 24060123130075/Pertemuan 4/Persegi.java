/* Nama File    : Persegi.java
 * Deskripsi    : 
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 12/3/2025
 */ 

public class Persegi extends BangunDatar {
    /* Atribut */
    private double sisi;

    /* Method */
    public Persegi () {
        setJmlSisi(4);
    }

    // public Persegi (double sisi, String warna, String border) {
    //     this.sisi = sisi;
    //     setWarna(warna);
    //     setBorder(border);
    //     setJmlSisi(4);
    // }

    // public Persegi (double sisi, String warna, String border) {
    //     this.sisi = sisi;
    //     this.warna = warna;
    //     this.border = border;
    //     this.jmlSisi = 4;
    // }

    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi () {
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    public double getKeliling () {
        return sisi * 4;
    }

    public double getLuas () {
        return sisi * sisi;
    }

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.println("Sisi: " + sisi);

    }
}