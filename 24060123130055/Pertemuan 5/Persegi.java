/*
File         : Persegi.java
Deskripsi    : Kelas Persegi yang meng-extend BangunDatar dan mengimplementasikan IResize
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 20 Maret 2025
*/

public class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    @Override
    public void zoomIn() {
        // Memperbesar sisi sebesar 10%
        this.sisi *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        // Memperkecil sisi sebesar 10%
        this.sisi *= 0.9;
    }
    
    public void cetakInfo() {
        System.out.println("Persegi dengan sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
