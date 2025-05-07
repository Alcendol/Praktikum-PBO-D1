/*
File         : Pengusaha.java
Deskripsi    : Kelas Pengusaha yang merupakan subclass dari Manusia
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 22 Maret 2025
*/

public class Pengusaha extends Manusia {
    private String nim; // Untuk mengambil digit ke-13
    private static int counterPengusaha = 0;
    
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, int pendapatan, String nim) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nim = nim;
        counterPengusaha++;
    }
    
    private int getDigitB() {
        String digits = nim.replaceAll("\\D", "");
        if(digits.length() >= 13) {
            return Character.getNumericValue(digits.charAt(12)); // indeks 12 untuk digit ke-13
        } else {
            return 0;
        }
    }
    
    // Pajak untuk Pengusaha = 15% dari pendapatan
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    // Masa kerja = (tahun sekarang - tahun mulai kerja) + digit ke-13
    public int hitungMasaKerja() {
        return super.hitungMasaKerja(getDigitB());
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Info Pengusaha ===");
        super.cetakInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}
