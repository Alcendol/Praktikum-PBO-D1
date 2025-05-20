public class Kendaraan {
    
    private String noPlat;
    private String jenis;
    
    public Kendaraan(){
        this.jenis = "";
        this.noPlat = "";
    }
    
    public Kendaraan(String noPlat, String jenis){
        this.jenis = jenis;
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }
}
