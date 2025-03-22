import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, formatter);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getName() {
        return this.nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return this.tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Mulai Kerja: " + this.tgl_mulai_kerja);
        System.out.println("Alamat: " + this.alamat);
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Pendapatan: Rp" + df.format(this.pendapatan));
    }

    public abstract int hitungMasaKerja();


}
