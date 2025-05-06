/* Nama File   : DosenTamu.java
 * Deskripsi   : Class DosenTamu adalah subclass dari Dosen yang merepresentasikan seorang dosen tamu.
 * Pembuat     : RADITYA SAPUTRA / 24060123140140
 * Tanggal     : 03/13/2025
 */

 public class DosenTamu extends Dosen {
  // Atribut tambahan
  private String NIDK; // Nomor Induk Dosen Khusus
  private String tanggalBerakhirKontrak; // Format: "dd/MM/yyyy"

  // Konstruktor
  public DosenTamu(String NIP, String Nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDK, String tanggalBerakhirKontrak) {
    super(NIP, Nama, tanggalLahir, TMT, gajiPokok, fakultas);
    this.NIDK = NIDK;
    this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
  }

  // Method untuk menghitung tunjangan
  public double hitungTunjangan() {
    // Menggunakan getter jika gajiPokok di kelas induk bersifat private
    return 0.025 * getGajiPokok();
  }

  // Override method printInfo
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Jabatan : Dosen Tamu");
    System.out.println("NIDK : " + NIDK);
    System.out.println("Tanggal Berakhir Kontrak : " + tanggalBerakhirKontrak);
    System.out.println("Tunjangan : Rp." + hitungTunjangan());
  }
}