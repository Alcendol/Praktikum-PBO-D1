/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi class BangunDatar
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 12 Maret 2025
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public BangunDatar(int jmlSisi, String border) {
        this.jmlSisi = jmlSisi;
        this.border = border;
    } 

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    protected void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }
}
