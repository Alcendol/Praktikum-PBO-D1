/**
 * File         : DosenTamu.java
 * Deskripsi    : Subclass untuk Dosen.java
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 18 Maret 2025
 */

 public class DosenTamu extends Dosen {
    private String NIDK;
    private int masaKontrak;

    public DosenTamu(String NIP, String NIDK, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, int masaKontrak){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Dosen Tamu", fakultas, 60);
        this.NIDK = NIDK;
        this.masaKontrak = masaKontrak;
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public int getMasaKontrak() {
        return masaKontrak;
    }

    public void setMasaKontrak(int masaKontrak) {
        this.masaKontrak = masaKontrak;
    }

    public double getTunjangan(){
        return 0.025 * getgajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK : " + getNIDK());
        System.out.println("Masa Kontrak : " + getMasaKontrak() + " bulan");
        System.out.println("Tunjangan : Rp" + getTunjangan());
    }
}
