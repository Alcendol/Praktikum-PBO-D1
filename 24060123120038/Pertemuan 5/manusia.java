package pertemuanlima;
/*  Nama File   : manusia.java
 *  Deskripsi   : Program untuk menunjukkan kelas abstrak manusia
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 23 Maret 2025
*/
import java.time.LocalDate;

public abstract class manusia{
    //ATRIBUT
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    //KONSTRUKTOR
    public manusia(){
        this.nama = "";
        this.tglMulaiKerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
    }

    public manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //SELEKTOR (GETTER)
    public String getNama(){
        return nama;
    }

    public LocalDate getTglMulaiKerja(){
        return tglMulaiKerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    //MUTATOR (SETTER)
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja){
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    //ABSTRACT METHOD
    public abstract int hitungMasaKerja();

    //METHOD CETAK INFO
    public void cetakInfo() {
        System.out.println("Nama                : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + getTglMulaiKerja());
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());
    }
}
