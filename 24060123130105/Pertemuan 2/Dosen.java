    
public class Dosen {
    
    private String nip;
    private String nama;
    private String prodi;


    //Metod
    public Dosen(){
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi ){
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }


    public String getNip()
    {
        return nip;
    }
    public String getProdi()
    {
        return prodi;
    }
    public String getNama()
    {
        return this.nama;
    }
}
