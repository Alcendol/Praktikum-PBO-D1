/* Nama File : DosenTamu.java
*  Deskripsi : Atribut dan Method class DosenTamu
*  Pembuat : Muhammad Shafwan Raihan S
*  Tanggal : 18 / 03 / 2025
*/

import java.time.LocalDate;

public class DosenTamu extends Pegawai {
    /*--------ATRIBUT--------*/
    private String NIDK;
    private LocalDate AkhirKontrak;
    private String fakultas;
    
    /*--------METHOD--------*/
    // Konstruktor DosenTamu
    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate AkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.AkhirKontrak = AkhirKontrak;
        this.fakultas = fakultas;
    }

    // Selektor NIDK
    public String getNIDK() {
        return NIDK;
    }

    // Mutator NIDK
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    // Selektor fakultas
    public String getfakultas() {
        return fakultas;
    }

    // Mutator fakultas
    public void setfakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Selektor AkhirKontrak
    public LocalDate getAkhirKontrak() {
        return AkhirKontrak;
    }

    // Method menghitung Tunjangan 
    private double getTunjanganDosenTamu() {
        return 0.025 * getgajiPokok();
    }
    
    // Method PrintInfo DosenTamu
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("NIDK: " + getNIDK() + "");
        System.out.println("Fakultas: " + getfakultas() + "");
        System.out.println("Masa Kerja : " + getMasaKerja());
        System.out.println("Kontrak Berakhir: " + getFormattedDate(getAkhirKontrak()));
        System.out.println("Tunjangan: 2,5% x " + getgajiPokok() + " = " + getTunjanganDosenTamu() + "");
    }
}