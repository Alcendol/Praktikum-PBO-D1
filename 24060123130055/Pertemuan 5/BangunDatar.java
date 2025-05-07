/*
File         : BangunDatar.java
Deskripsi    : Abstract class untuk bangun datar
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 20 Maret 2025
*/

public abstract class BangunDatar {
    protected String warna;
    protected String border;
    
    public BangunDatar() {
    }
    
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
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
