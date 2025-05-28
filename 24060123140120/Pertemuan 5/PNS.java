/* Nama File : PNS.java
*  Deskripsi : Atribut dan Method class PNS
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 20 / 03 / 2025
*/
package pertemuan5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {

    /*--------ATRIBUT--------*/
    private String nip;
    private static int counterPNS; // Menghitung jumlah instansiasi objek PNS
    
    /*--------METHOD--------*/
    // Konstruktor tanpa parameter
    public PNS() {
        this.nip = "";
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor nip
    public String getNip() {
        return nip;
    }

    // Selektor counterPNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Mutator nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Implementasi Abstract Method hitungMasaKerja() yang mengembalikan hasil perhitungan masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 0;
    }
    
    // Implementasi Interface Method hitungPajak() yang mengembalikan hasil perhitungan pajak PNS
    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }
    
    // Method cetakInfo() yang menampilkan seluruh informasi atribut dari class PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + getNip());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}

