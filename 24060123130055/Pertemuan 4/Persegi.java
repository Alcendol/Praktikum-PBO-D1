/* Nama File    : Persegi.java
 * Deskripsi    : berisi class Persegi
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 12 Maret 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;


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

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
    }
}
