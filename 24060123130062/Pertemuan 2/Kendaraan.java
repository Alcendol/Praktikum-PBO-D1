// Nama : Muhammad Mahdi Buntarwatangan
// NIM  : 24060123130062
// Lab : D1
// Nama File : Kendaraan.java
package petemuan2.permahasiswaan;

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String jenis;

    //Konstruktor
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor noPlat
    public String getNoPlat(){
        return this.noPlat;
    }

    //selektor jenis kendaraan
    public String getJenisKendaraan(){
        return this.jenis;
    }

    //mutator noPlat 
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //mutator jenis kendaraan
    public void setJenisKendaraan(String jenis){
        this.jenis = jenis;
    }

}
