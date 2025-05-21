/*
    Nama File : BangunDatar.java
    Deskripsi : Kelas yang merepresentasikan bangun datar lingkaran, turunan dari kelas BangunDatar. Memiliki atribut tambahan berupa jari-jari, serta metode untuk menghitung luas dan kelilingnya.
    Pembuat   : Muhammad Paruda Pradayan
    NIM       : 24060123140124
    Tanggal   : 17 Maret 2025
*/

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String border) {
        this.jmlSisi = jmlSisi;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public static int getCounterBangunDatar() {
        return counterBangunDatar;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi = " + jmlSisi);
        System.out.println("Warna = " + warna);
        System.out.println("Border = " + border);
    }
}