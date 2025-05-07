import java.util.Date;
public class Dosen extends pegawai {
    private String fakultas;

    public Dosen(String nip,String nama,Date tanggalLahir, Date tmt ,double gajiPokok,String fakultas){
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas=fakultas;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    } 

}
