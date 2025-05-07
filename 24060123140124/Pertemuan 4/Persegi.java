/*
    Nama File : Persegi.java
    Deskripsi : Kelas yang merepresentasikan bangun datar persegi, turunan dari kelas BangunDatar. Memiliki atribut tambahan berupa panjang sisi, serta metode untuk menghitung luas dan kelilingnya.
    Pembuat   : Muhammad Paruda Pradayan
    NIM       : 24060123140124
    Tanggal   : 17 Maret 2025
*/

public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    @Override

    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi = " + sisi);
    }

}