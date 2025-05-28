/*
 * Nama File    : Petani.java
 * Deskripsi    : Program untuk class petani
  * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 18 Maret 2025
 */
class Petani extends Manusia {
    private static int counterPetani = 0;
    private String asalKota;

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public double hitungPajak() {
        return 0;  // Pajak 0%
    }

    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tglMulaiKerja.substring(6));
        return 2025 - tahunMulai;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}