/*
 * Nama File    : DosenTetap.java
 * Deskripsi    : Membuat Subclass dari Pegawai bernama DosenTetap
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */

package Pertemuan4;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DosenTetap extends Pegawai{
    /*========== Atribut ========== */
    private String NIDN;
    private String Fakultas;
    private LocalDate BUP;
    private static String Jabatan = "Dosen Tetap";
    
    
    /*========== Method ========== */
    public DosenTetap(){
        this.NIDN = "";
        this.Fakultas = "";
        setTunjangan(0.02);
    }

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String NIDN, String Fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
        this.Fakultas = Fakultas;
        setBUP();
        setTunjangan(0.02);
        
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public String getFakultas(){
        return Fakultas; 
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    public String getJabatan(){
        return Jabatan;
    }

    public LocalDate getBUP() {
        return BUP;
    }
    
    public void setBUP() {
        this.BUP = getTanggalLahir().plusYears(65).plusMonths(1).withDayOfMonth(1);
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN          : " + NIDN);
        System.out.println("Jabatan       : " + Jabatan);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        System.out.println("BUP           : " + formatter.format(getBUP()));
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Tunjangan     : Rp" + df.format(getGajiPokok() * getTunjangan() * Period.between(getTMT(), LocalDate.now()).getYears()));
        System.out.println("Fakultas      : " + Fakultas);

        
    }
    

    

}
