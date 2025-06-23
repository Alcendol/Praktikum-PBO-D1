import java.util.Date;

public class DosenTamu extends Dosen {
    private String nidk;

    public DosenTamu(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas, String nidk) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
    }

    public String getNidk(){
        return this.nidk;
    }
    
    public void setNidk(String nidk){
        this.nidk=nidk;
    }

     public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("NIDK : " + getNidk());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + formatDate(getTanggalLahir()));
        System.out.println("TMT : " + formatDate(getTmt()));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        
    }


}
