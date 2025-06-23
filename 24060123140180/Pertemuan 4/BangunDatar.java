package Pertemuan4;
/*
 * Nama File    : BangunDatar.java
 * Deskripsi    : Membuat Superclass bernama BangunDatar
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */
public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;
    

    protected BangunDatar(){
        counterBangunDatar++;
    }

    protected BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    protected int getJmlSisi(){
        return jmlSisi;
    }
    protected void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }
    protected String getWarna(){
        return warna;
    }
    protected String getBorder(){
        return border;
    }
    protected void setWarna(String warna){
        this.warna = warna;
    }
    protected void setBorder(String border){
        this.border = border;
    }

    protected void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: "+ border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }
}
