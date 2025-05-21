/*
 * Nama File    : DosenTamu.java
 * Deskripsi    : Kelas Dosen Tamu
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 15 Maret 2025
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class DosenTamu extends pegawai {

    private String NIDK;
    private static String jabatan = "Dosen Tamu";
    private String fakultas;
    private LocalDate akhirKontrak;

    public DosenTamu() {
        this.akhirKontrak = LocalDate.now();
    }

    public DosenTamu(String NIP, String nama, LocalDate tglLahirDate, LocalDate tglMasukDate, double gaji, String NIDK,String fakultas,  LocalDate akhirKontrak) {
        super(NIP, nama, tglLahirDate, tglMasukDate, gaji);
        this.NIDK = NIDK;
        this.fakultas = fakultas;
        this.akhirKontrak = akhirKontrak;
        setTunjangan(0.01);
    }

    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    public static String getJabatan() {
        return jabatan;
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK            : " + getNIDK());
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Jabatan         : " + getJabatan());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));

        System.out.println("Akhir Kontrak   : " + formatter.format(getAkhirKontrak()));  
    }
}
