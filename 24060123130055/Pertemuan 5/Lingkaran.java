/*
File         : Lingkaran.java
Deskripsi    : Kelas Lingkaran yang meng-extend BangunDatar dan mengimplementasikan IResize
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 20 Maret 2025
*/

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double getJariJari() {
        return jariJari;
    }
    
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }
    
    @Override
    public void zoomIn() {
        this.jariJari *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        this.jariJari *= 0.9;
    }
    
    public void cetakInfo() {
        System.out.println("Lingkaran dengan jari-jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
