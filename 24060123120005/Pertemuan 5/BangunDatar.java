/*  Nama File : BangunDatar.java
    Deskripsi : Kelas abstrak yang merepresentasikan bangun datar dengan atribut jumlah sisi, warna, dan border
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 22 Maret 2025
*/

public abstract class BangunDatar {
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

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

}
