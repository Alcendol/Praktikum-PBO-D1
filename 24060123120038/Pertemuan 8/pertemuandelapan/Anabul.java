package pertemuandelapan;
/*  Nama File   : Anabul.java
 *  Deskripsi   : Program untuk menunjukkan kelas Anabul sebagai kelas induk dari hewan peliharaan
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 07 Mei 2025
*/

public abstract class Anabul {
    protected String nama;

    protected Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void bergerak();   
    public abstract void bersuara();   
}
