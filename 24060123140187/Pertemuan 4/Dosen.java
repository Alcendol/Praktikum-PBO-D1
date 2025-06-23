/*Nama File  : Dosen.java
 * Deskripsi : Program penggunaan inheritance pada class dosen
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : 15 Maret 2025
 * */

package pertemuanEmpat;

import java.util.Date;

/**
 * Class abstract Dosen sebagai subclass dari Pegawai
 */
public abstract class Dosen extends Pegawai {
    private String fakultas;
    
    public Dosen(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
    
    public String getFakultas() {
        return fakultas;
    }
}
