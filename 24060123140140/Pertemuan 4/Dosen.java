/* Nama File   : Dosen.java
 * Deskripsi   : Class Dosen adalah subclass dari Pegawai yang merepresentasikan seorang dosen.
 * Pembuat     : RADITYA SAPUTRA / 24060123140140
 * Tanggal     : 03/13/2025
 */

 public class Dosen extends Pegawai {
  // Atribut tambahan
  protected String fakultas;

  // Konstruktor
  public Dosen(String NIP, String Nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas) {
    super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
    this.fakultas = fakultas;
  }

  // Setter dan Getter
  public String getFakultas() {
    return fakultas;
  }

  public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
  }

  // Override method printInfo
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Fakultas : " + getFakultas());
  }
}