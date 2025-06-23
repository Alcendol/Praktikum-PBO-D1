/*
File         : PNS.java
Deskripsi    : Kelas PNS yang merupakan subclass dari Manusia
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 22 Maret 2025
*/

public class PNS extends Manusia {
    private String nim; // NIM digunakan untuk mengambil digit ke-14
    private static int counterPNS = 0;
    
    public PNS(String nama, String tglMulaiKerja, String alamat, int pendapatan, String nim) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nim = nim;
        counterPNS++;
    }
    
    // Konstruktor tanpa alamat
    public PNS(String nama, String tglMulaiKerja, int pendapatan, String nim) {
        super(nama, tglMulaiKerja, "", pendapatan);
        this.nim = nim;
        counterPNS++;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    // Mengambil digit ke-14 dari nim (abaikan karakter non-digit)
    private int getDigitA() {
        String digits = nim.replaceAll("\\D", "");
        if(digits.length() >= 14) {
            return Character.getNumericValue(digits.charAt(13)); // indeks 13 untuk digit ke-14 (1-indexed)
        } else {
            return 0;
        }
    }
    
    // Pajak untuk PNS = 10% dari pendapatan
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    // Masa kerja = (tahun sekarang - tahun mulai kerja) + digit ke-14
    public int hitungMasaKerja() {
        return super.hitungMasaKerja(getDigitA());
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Info PNS ===");
        super.cetakInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
}
