/*
 * Nama file: MainManusia.java
 * Nama: Noval Putra Barliyanda
 * NIM: 24060123140137
 */

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

abstract class Manusia {
    String nama;
    String tglMulaiKerja; // format: dd.MM.yyyy
    double pendapatan;
    static int counterPNS = 0;
    static int counterPengusaha = 0;
    static int counterPetani = 0;

    abstract int hitungMasaKerja();
    abstract void cetakInfo();
}

interface Pajak {
    double hitungPajak();
}

class PNS extends Manusia implements Pajak {
    String nip;

    public PNS(String nama, String tglMulaiKerja, double pendapatan, String nip) {
        if (pendapatan < 0) {
            throw new IllegalArgumentException("Pendapatan tidak boleh negatif");
        }
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.pendapatan = pendapatan;
        this.nip = nip;
        counterPNS++;
    }

    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate startDate = LocalDate.parse(tglMulaiKerja, formatter);
            int currentYear = Year.now().getValue();
            return currentYear - startDate.getYear();
        } catch (DateTimeParseException e) {
            System.err.println("Format tanggal tidak valid: " + tglMulaiKerja);
            return 0;
        }
    }

    public double hitungPajak() {
        return 0.1 * pendapatan; // 10% dari pendapatan
    }

    public void cetakInfo() {
        System.out.println(String.format("PNS: %s, NIP: %s, Masa Kerja: %d tahun", nama, nip, hitungMasaKerja()));
    }

    public int getCounterPNS() {
        return counterPNS;
    }
}

class Pengusaha extends Manusia implements Pajak {
    String aka;

    public Pengusaha(String nama, String tglMulaiKerja, double pendapatan, String aka) {
        if (pendapatan < 0) {
            throw new IllegalArgumentException("Pendapatan tidak boleh negatif");
        }
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.pendapatan = pendapatan;
        this.aka = aka;
        counterPengusaha++;
    }

    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate startDate = LocalDate.parse(tglMulaiKerja, formatter);
            int currentYear = Year.now().getValue();
            return currentYear - startDate.getYear();
        } catch (DateTimeParseException e) {
            System.err.println("Format tanggal tidak valid: " + tglMulaiKerja);
            return 0; 
        }
    }

    public double hitungPajak() {
        return 0.15 * pendapatan; // 15% dari pendapatan
    }

    public void cetakInfo() {
        System.out.println(String.format("Pengusaha: %s, A.K.A: %s, Masa Kerja: %d tahun", nama, aka, hitungMasaKerja()));
    }

    public int getCounterPengusaha() {
        return counterPengusaha;
    }
}

class Petani extends Manusia implements Pajak {
    String kelompok;

    public Petani(String nama, String tglMulaiKerja, double pendapatan, String kelompok) {
        if (pendapatan < 0) {
            throw new IllegalArgumentException("Pendapatan tidak boleh negatif");
        }
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.pendapatan = pendapatan;
        this.kelompok = kelompok;
        counterPetani++;
    }

    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate startDate = LocalDate.parse(tglMulaiKerja, formatter);
            int currentYear = Year.now().getValue();
            return currentYear - startDate.getYear();
        } catch (DateTimeParseException e) {
            System.err.println("Format tanggal tidak valid: " + tglMulaiKerja);
            return 0; 
        }
    }

    public double hitungPajak() {
        return 0.05 * pendapatan; // 5% dari pendapatan
    }

    public void cetakInfo() {
        System.out.println(String.format("Petani: %s, Kelompok: %s, Masa Kerja: %d tahun", nama, kelompok, hitungMasaKerja()));
    }

    public int getCounterPetani() {
        return counterPetani;
    }
}

public class MainManusia {
    public static void main(String[] args) {
        // Membuat objek
        PNS p1 = new PNS("Sartiyo", "01.04.1999", 15000000, "198302320266410022");
        Pengusaha pel = new Pengusaha("Adhy", "01.01.1997", 5000000, "A.K.A");
        Petani p1t = new Petani("Nugrah", "01.01.1976", 500000, "wongiri");

        // Menampilkan jumlah objek
        System.out.println("Jumlah PNS: " + PNS.counterPNS);
        System.out.println("Jumlah Pengusaha: " + Pengusaha.counterPengusaha);
        System.out.println("Jumlah Petani: " + Petani.counterPetani);

        // Menampilkan pajak
        System.out.println("Pajak PNS p1: " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pel: " + pel.hitungPajak());
        System.out.println("Pajak Petani p1t: " + p1t.hitungPajak());

        // Menampilkan informasi
        p1.cetakInfo();
        pel.cetakInfo();
        p1t.cetakInfo();
    }
}