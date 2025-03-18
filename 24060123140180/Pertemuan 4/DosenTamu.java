/*
 * Nama File    : DosenTamu.java
 * Deskripsi    : Membuat Subclass dari Pegawai bernama DosenTamu
 * Pembuat      : Pramudya Jati Pamungkas / 24060123140180
 * Tanggal      : 16 Maret 2025
 */

package Pertemuan4;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DosenTamu extends Pegawai {
    /*========== Atribut ========== */
    private String NIDK;
    private LocalDate kontrak ;
    private String Fakultas;
    private static String Jabatan = "Dosen Tamu";

    /*========== Method ========== */
    public DosenTamu(){
        this.kontrak = LocalDate.now();
    }

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String NIDK,String Fakultas,  LocalDate kontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.Fakultas = Fakultas;
        this.kontrak = kontrak;
        setTunjangan(0.025);
    }

    // Setter dan Getter
    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public String getFakultas(){
        return Fakultas; 
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    public LocalDate getKontrak(){
        return kontrak;
    }

    public void setKontrak(LocalDate kontrak){
        this.kontrak = kontrak;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK          : " + NIDK);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        System.out.println("Kontrak Kerja : "+ formatter.format(kontrak));
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Tunjangan     : Rp" + df.format(getGajiPokok() * getTunjangan()));
        System.out.println("Jabatan       : " + Jabatan);
        System.out.println("Fakultas      : " + Fakultas);
    
    }
    

    
}
