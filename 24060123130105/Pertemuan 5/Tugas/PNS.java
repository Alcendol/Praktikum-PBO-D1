import java.time.Period;
import java.time.LocalDate;


public class PNS extends Manusia implements Pajak{

    private String nip;
    private static int counterPNS = 0;


    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return this.nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return this.getPendapatan() *0.1;
    }

    public int hitungMasaKerja(){
        return Period.between(getTglMulaiKerja(), LocalDate.now()).getYears() + 5;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + this.nip);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja() + " tahun");
    }
    
}
