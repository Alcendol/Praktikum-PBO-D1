import java.util.Date;
public class DosenTetap extends Dosen{
    private String nidn;
    
    public DosenTetap(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    public String getNidn(){
        return this.nidn;
    }
    
    public void setNidn(String nidn){
        this.nidn=nidn;
    }
    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("NIDN : " + getNidn());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + (getTanggalLahir()));
        System.out.println("TMT : " + getTmt());
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());
        
    }
}
