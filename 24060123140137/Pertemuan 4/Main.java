/* Nama : Noval Putra Barliyanda
 * NIM : 24060123140137
 * Tanggal : 16 Maret 2025
 * Nama File : Main.java
 * Deskripsi : Program ini berisi implementasi dari konsep inheritance pada Java
 */

import java.time.LocalDate;
import java.time.Period;

abstract class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public abstract void printInfo();

    protected int getMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }
}

class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        System.out.println("Dosen Info:");
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Fakultas: " + fakultas);
    }
}

class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Tunjangan: " + (0.02 * getMasaKerja() * gajiPokok));
    }
}

class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Tanggal Berakhir Kontrak: " + tanggalBerakhirKontrak);
        System.out.println("Tunjangan: " + (0.025 * gajiPokok));
    }
}

class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        System.out.println("Tendik Info:");
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Bidang: " + bidang);
    }
}

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("123456789", "Budi Santoso", LocalDate.of(1985, 5, 15), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains Dan Matematika", "NIDN123");
        DosenTamu dosenTamu = new DosenTamu("987654321", "Siti Aminah", LocalDate.of(1990, 3, 10), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Sains Dan Matematika", "NIDK456", LocalDate.of(2029, 12, 31));
        Tendik tendik = new Tendik("111222333", "Agung Prabowo", LocalDate.of(1995, 7, 20), LocalDate.of(2018, 6, 15), 3000000, "Akademik");

        dosenTetap.printInfo();
        dosenTamu.printInfo();
        tendik.printInfo();
    }
}
