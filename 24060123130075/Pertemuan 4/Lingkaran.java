/* Nama File    : Lingkaran.java
 * Deskripsi    : 
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 12/3/2025
 */ 

public class Lingkaran extends BangunDatar {
    /* Atribut */
    private double jari;

    /* Method */
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari :" + jari);
    }
}