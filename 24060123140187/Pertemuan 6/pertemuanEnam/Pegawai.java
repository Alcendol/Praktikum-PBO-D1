/* Nama File : Pegawai.java
 * Deskripsi : Berisi class pegawai
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam;

 public class Pegawai {
    protected String Nama;
    protected int gajiPokok = 5000000;

    public Pegawai(String Nama) {
        this.Nama = Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + Nama + ", Gaji pokok : " + gajiPokok);
    }
}
