package PerEmpat;
/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program untuk menunjukkan abstract dosen tetap dan tamu
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 18 Maret 2025
*/

import java.util.Date;

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
