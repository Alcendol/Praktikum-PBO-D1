// Nama File : Kendaraan.java
// Nama : Rafi Deandra
// NIM : 240122140122

public class Kendaraan {
    //atribut 
    private String noPlat;
    private String jenis;

    //konstruktor 
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat,String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //getter 
    public String getnoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }
    
    //setter 
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }
}