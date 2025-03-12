public class MataKuliah {
    
    private String idMatkul;
    private String nama;
    private Integer sks;

    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0 ;
    }

    public MataKuliah(String idMatkul, String nama, Integer sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(Integer sks){
        this.sks = sks;
    }   

    public String getNama() {
        return this.nama;
    }
    
    public String getIdMatkul() {
        return this.idMatkul;
    }
    
    public Integer getSks() {
        return this.sks;
    }


}
