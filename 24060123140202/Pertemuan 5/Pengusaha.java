/*
 * Nama File    : Pengusaha.java
 * Deskripsi    : Program untuk class pengusaha
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 18 Maret 2025
 */
class Pengusaha extends Manusia {
    private static int counterPengusaha = 0;
    private String NPWP;

    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String NPWP) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public double hitungPajak() {
        return 0.15 * pendapatan;  // Pajak 15%
    }

    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tglMulaiKerja.substring(6));
        return 2025 - tahunMulai;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + NPWP);
    }
}