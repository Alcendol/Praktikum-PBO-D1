/* Nama File   : Pegawai.java
 * Deskripsi   : Class Pegawai adalah class dasar yang merepresentasikan seorang pegawai.
 * Pembuat     : RADITYA SAPUTRA / 24060123140140
 * Tanggal     : 03/13/2025
 */

public class Pegawai {
  // Atribut
  protected String NIP;
  protected String Nama;
  protected String tanggalLahir; // Format: "dd/MM/yyyy"
  protected String TMT; // Format: "dd/MM/yyyy"
  protected double gajiPokok;

  // Konstruktor
  public Pegawai(String NIP, String Nama, String tanggalLahir, String TMT, double gajiPokok) {
    this.NIP = NIP;
    this.Nama = Nama;
    this.tanggalLahir = tanggalLahir;
    this.TMT = TMT;
    this.gajiPokok = gajiPokok;
  }

  // Setter dan Getter
  public String getNIP() {
    return NIP;
  }

  public void setNIP(String NIP) {
    this.NIP = NIP;
  }

  public String getNama() {
    return Nama;
  }

  public void setNama(String Nama) {
    this.Nama = Nama;
  }

  public String getTanggalLahir() {
    return tanggalLahir;
  }

  public void setTanggalLahir(String tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
  }

  public String getTMT() {
    return TMT;
  }

  public void setTMT(String TMT) {
    this.TMT = TMT;
  }

  public double getGajiPokok() {
    return gajiPokok;
  }

  public void setGajiPokok(double gajiPokok) {
    this.gajiPokok = gajiPokok;
  }

  // Method
  public void printInfo() {
    System.out.println("NIP : " + getNIP());
    System.out.println("Nama : " + getNama());
    System.out.println("Tanggal Lahir : " + getTanggalLahir());
    System.out.println("TMT : " + getTMT());
    System.out.println("Gaji Pokok : Rp." + getGajiPokok());
  }
}