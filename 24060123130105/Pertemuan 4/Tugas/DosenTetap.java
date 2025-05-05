/*
 * Nama File    : DosenTetap.java
 * Deskripsi    : Kelas Dosen Tetap
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 15 Maret 2025
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DosenTetap extends pegawai {

    private String nidn;
    private static String jabatan = "Dosen Tetap";
    private String fakultas;
    private LocalDate BUP;


public DosenTetap() {
    this.nidn = "";
    this.fakultas = "";
    setTunjangan(0.02);
}

public DosenTetap(String NIP, String nama, LocalDate tglLahirDate, LocalDate tglMasukDate, double gaji, String nidn, String fakultas) {
    super(NIP, nama, tglLahirDate, tglMasukDate, gaji);    
    this.nidn = nidn;
    this.fakultas = fakultas;
    setBUP();
    setTunjangan(0.02);
}

public String getNidn() {
    return nidn;
}

public void setNidn(String nidn) {
    this.nidn = nidn;
}   

public static String getJabatan() {
    return jabatan;
}

public String getFakultas() {
    return fakultas;
}

public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
}

public LocalDate getBUP() {
    return BUP;
}

public void setBUP() {
    this.BUP = getTglLahirDate().plusYears(65).plusMonths(1).withDayOfMonth(1);
}


public void printInfo() {
    super.printInfo();
    System.out.println("NIDN            : " + getNidn());
    System.out.println("Fakultas        : " + getFakultas());
    System.out.println("Jabatan         : " + getJabatan());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));

    System.out.println("BUP             : " + formatter.format(getBUP()));

}

}