/*
 * Nama File    : Tendik.java
 * Deskripsi    : Membuat Subclass dari Pegawai bernama Tendik
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */

package Pertemuan4;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    /*========== Atribut ========== */
    private String Bidang;
    private LocalDate BUP;

    /*========== Method ========== */
    public Tendik(){
    }

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.Bidang = Bidang;
        setBUP();
        setTunjangan(0.01);
    }

    public String getBidang(){
        return Bidang;
    }

    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    public LocalDate getBUP(){
        return BUP;
    }

    public void setBUP() {
        this.BUP = getTanggalLahir().plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang        : " + Bidang);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        System.out.println("BUP           : " + formatter.format(getBUP()));
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Tunjangan     : Rp" + df.format(getGajiPokok() * getTunjangan() * Period.between(getTMT(), LocalDate.now()).getYears()));
    }

    
}
