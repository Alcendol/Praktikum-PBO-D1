/* Nama File   : DosenTetap.java
 * Deskripsi   : Class DosenTetap adalah subclass dari Dosen yang merepresentasikan seorang dosen tetap.
 * Pembuat     : RADITYA SAPUTRA / 24060123140140
 * Tanggal     : 03/13/2025
 */

public class DosenTetap extends Dosen {
  // Atribut tambahan
  private String NIDN; // Nomor Induk Dosen Nasional
  private String BUP;  // Batas Usia Pensiun

  // Konstruktor
  public DosenTetap(String NIP, String Nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDN) {
    super(NIP, Nama, tanggalLahir, TMT, gajiPokok, fakultas);
    this.NIDN = NIDN;
    this.BUP = hitungBUP(tanggalLahir, 65); // BUP untuk dosen tetap adalah 65 tahun
  }

  // Method untuk menghitung BUP
  private String hitungBUP(String tanggalLahir, int usiaPensiun) {
    String[] parts = tanggalLahir.split("/");
    int tahunLahir = Integer.parseInt(parts[2]);
    int tahunPensiun = tahunLahir + usiaPensiun;
    return "01/06/" + tahunPensiun; // Tanggal 1 bulan Juni tahun pensiun
  }

  // Method untuk menghitung masa kerja
  private int hitungMasaKerja(String TMT) {
    String[] parts = TMT.split("/");
    int tahunMulai = Integer.parseInt(parts[2]);
    int tahunSekarang = 2025; // Contoh tahun sekarang
    return tahunSekarang - tahunMulai;
  }

  // Method untuk menghitung tunjangan
  public double hitungTunjangan() {
    int masaKerja = hitungMasaKerja(TMT);
    return 0.02 * masaKerja * 5000000;
  }

  // Override method printInfo
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Jabatan : Dosen Tetap");
    System.out.println("NIDN : " + NIDN);
    System.out.println("BUP : " + BUP);
    System.out.println("Tunjangan : Rp." + hitungTunjangan());
  }
}