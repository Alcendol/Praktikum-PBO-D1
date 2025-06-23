/**
 * File         : Dosen.java
 * Deskripsi    : Superclass untuk DosenTetap dan DosenTamu, Subclass untuk pegawai
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 18 Maret 2025
 */

 public class Dosen extends Pegawai {
    private String jabatan;
    private String fakultas;
    private int BUP;

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String jabatan, String fakultas, int BUP) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.jabatan = jabatan;
        this.fakultas = fakultas;
        this.BUP = BUP;
    }

    // Getter & Setter
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getBUP() {
        return BUP;
    }

    public void setBUP(int BUP) {
        this.BUP = BUP;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("BUP : " + getBUP());
    }
}
