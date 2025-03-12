public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }

    public Dosen (String nip, String nama, String prodi){
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNip(){
        return this.nip;
    }

    public String getProdi(){
        return this.prodi;
    }
}
