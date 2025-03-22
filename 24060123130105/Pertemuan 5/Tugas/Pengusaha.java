import java.time.LocalDate;
import java.time.Period;
public class Pengusaha extends Manusia implements Pajak{

    
    private String npwp;
    private static int counterPengusaha = 0;
    
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }
    
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public String getNpwp() {
        return this.npwp;
    }
    
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    @Override
    public double hitungPajak() {
        return this.getPendapatan() * 0.15;
    }

    public int hitungMasaKerja(){
        return Period.between(getTglMulaiKerja(), LocalDate.now()).getYears() + 0;
    }
    
    @Override  
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + this.npwp);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja() + " tahun");
    }
}
