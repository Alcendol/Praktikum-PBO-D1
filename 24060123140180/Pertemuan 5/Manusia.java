package Pertemuan5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.DecimalFormat;

public abstract class Manusia {
    /*========== Atribut ========== */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /*========== Method ========== */
    public abstract String getNama();
    public abstract void setNama(String nama);
    public abstract LocalDate getTgl_mulai_kerja();
    public abstract void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja);
    public abstract String getAlamat();
    public abstract void setAlamat(String alamat);
    public abstract double getPendapatan();
    public abstract void setPendapatan(double pendapatan);
    public abstract int hitungMasaKerja();
    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama               : " + getNama());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        System.out.println("Tanggal Mulai Kerja: " + formatter.format(tgl_mulai_kerja));
        System.out.println("Alamat             : " + getAlamat());
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Pendapatan         : " + df.format(getPendapatan()));
    }
    

}
