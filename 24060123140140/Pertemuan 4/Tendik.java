/* Nama File   : Tendik.java
 * Deskripsi   : Class Tendik adalah subclass dari Pegawai yang merepresentasikan seorang tenaga kependidikan.
 * Pembuat     : RADITYA SAPUTRA / 24060123140140
 * Tanggal     : 03/13/2025
 */

public class Tendik extends Pegawai {
  // Atribut tambahan
  private String bidang; // Bidang kerja (Akademik, Kemahasiswaan, Sumber Daya)
  private String BUP;    // Batas Usia Pensiun

  // Konstruktor
  public Tendik(String NIP, String Nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
    super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
    this.bidang = bidang;
    this.BUP = hitungBUP(tanggalLahir, 55); // BUP untuk tendik adalah 55 tahun
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
    return 0.01 * masaKerja * gajiPokok;
  }

  // Override method printInfo
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Jabatan : Tenaga Kependidikan");
    System.out.println("Bidang : " + bidang);
    System.out.println("BUP : " + BUP);
    System.out.println("Tunjangan : Rp." + hitungTunjangan());
  }
}