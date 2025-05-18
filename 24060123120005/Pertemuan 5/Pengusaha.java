/*  
    Nama File : Pengusaha.java  
    Deskripsi : Kelas yang merepresentasikan Pengusaha, turunan dari kelas Manusia.  
    Pembuat   : Patricia Gabrielle Yudianto  
    NIM       : 24060123120005  
    Tanggal   : 22 Maret 2025  
*/

import java.time.LocalDate;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}
