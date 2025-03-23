/*  
    Nama File : PNS.java  
    Deskripsi : Kelas yang merepresentasikan PNS, turunan dari kelas Manusia.  
    Pembuat   : Patricia Gabrielle Yudianto  
    NIM       : 24060123120005  
    Tanggal   : 22 Maret 2025  
*/

import java.time.LocalDate;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}
