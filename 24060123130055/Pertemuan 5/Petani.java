/*
File         : Petani.java
Deskripsi    : Kelas Petani yang merupakan subclass dari Manusia
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 22 Maret 2025
*/

public class Petani extends Manusia {
    private String daerah; // misalnya informasi daerah
    private static int counterPetani = 0;
    
    public Petani(String nama, String tglMulaiKerja, String alamat, int pendapatan, String daerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerah = daerah;
        counterPetani++;
    }
    
    public double hitungPajak() {
        return 0.0;
    }
    
    // Masa kerja = (tahun sekarang - tahun mulai kerja) + 0
    public int hitungMasaKerja() {
        return super.hitungMasaKerja(0);
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Info Petani ===");
        super.cetakInfo();
        System.out.println("Daerah: " + daerah);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
}
