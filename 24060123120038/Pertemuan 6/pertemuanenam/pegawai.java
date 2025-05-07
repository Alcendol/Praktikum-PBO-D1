package pertemuanenam;
/*  Nama File   : pegawai.java
 *  Deskripsi   : Program untuk menunjukkan kelas pegawai
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

public class pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}