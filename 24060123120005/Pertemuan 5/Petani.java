/*  
    Nama File : Petani.java  
    Deskripsi : Kelas yang merepresentasikan Petani, turunan dari kelas Manusia.  
    Pembuat   : Patricia Gabrielle Yudianto  
    NIM       : 24060123120005  
    Tanggal   : 22 Maret 2025  
*/

import java.time.LocalDate;

public class Petani extends Manusia {
    private String daerah;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String daerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerah = daerah;
        counterPetani++;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Daerah: " + daerah);
    }
}
