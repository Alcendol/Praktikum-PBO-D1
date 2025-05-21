/**
 * File         : DosenTetap.java
 * Deskripsi    : Subclass untuk Dosen.java
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 18 Maret 2025
 */

 public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Dosen Tetap", fakultas, 65);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public double tunjangan(int masaKerja) {
        return 0.02 * masaKerja * getgajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN : " + getNIDN());
        int masaKerja = 10; // bisa disesuaikan
        System.out.println("Tunjangan : Rp" + tunjangan(masaKerja));
    }
}
