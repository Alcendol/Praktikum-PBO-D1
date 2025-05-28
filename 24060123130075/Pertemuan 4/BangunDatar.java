/* Nama File    : BangunDatar.java
 * Deskripsi    : 
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 12/3/2025
 */ 

public class BangunDatar {
    /* Atribut */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /* Method */
    public BangunDatar () {
        counterBangunDatar++;
    }

    public BangunDatar (int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi () {
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public String getBorder () {
        return border;
    }

    public void setBorder (String border) {
        this.border = border;
    }

    public static int getCounterBangunDatar() {
        return counterBangunDatar;
    }

    public void printInfo () {
        System.out.println("Jumlah Sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
    }
}