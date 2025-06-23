/**
 * File         : Tendik.java
 * Deskripsi    : Subclass untuk Pegawai.java
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 18 Maret 2025
 */

 public class Tendik extends Pegawai {
    private String bidang;
    private int BUP = 55;

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public int getBUP() {
        return BUP;
    }

    public void setBUP(int BUP) {
        this.BUP = BUP;
    }

    public double tunjangan(int masaKerja) {
        return 0.01 * masaKerja * getgajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang : " + getBidang());
        System.out.println("BUP : " + getBUP());
        int masaKerja = 10; // bisa dijadikan parameter
        System.out.println("Tunjangan : Rp" + tunjangan(masaKerja));
    }
}
