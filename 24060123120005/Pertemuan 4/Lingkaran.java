/*
    Nama File : Lingkaran.java
    Deskripsi : Kelas yang merepresentasikan bangun datar lingkaran, turunan dari kelas BangunDatar. Memiliki atribut tambahan berupa jari-jari, serta metode untuk menghitung luas dan kelilingnya.
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 17 Maret 2025
*/

public class Lingkaran extends BangunDatar {
    private double jari;

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