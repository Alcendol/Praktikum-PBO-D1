/*
 * Nama File    : PNS.java
 * Deskripsi    : Program untuk class PNS
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 18 Maret 2025
 */
class PNS extends Manusia {
    private static int counterPNS = 0;
    private String NIP;

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String NIP) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public double hitungPajak() {
        return 0.10 * pendapatan;  // Pajak 10%
    }

    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tglMulaiKerja.substring(6));
        return 2025 - tahunMulai;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + NIP);
    }
}
