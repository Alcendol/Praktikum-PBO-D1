import java.util.Date;

public class Tendik extends pegawai {
    private String bidang;

    public Tendik (String nip,String nama,Date tanggalLahir, Date tmt ,double gajiPokok,String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang=bidang;
    }

    public String getBidang(){
        return this.bidang;
    }
    
    public void setBidang(String Bidang){
        this.bidang=Bidang;
    }

    public void printInfo() {
        
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + getBidang());
        
    }
}