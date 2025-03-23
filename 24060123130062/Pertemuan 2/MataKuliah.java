package petemuan2.permahasiswaan;
// Nama : Muhammad Mahdi Buntarwatangan
// NIM  : 24060123130062
// Lab : D1
// Nama File : MataKuliah.java
public class MataKuliah {
    //Atribut
    private String idMatkul;
    private String nama;
    private Integer sks;

    //Konstruktor
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, Integer sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor matkul
    public String getIdMatkul(){
        return this.idMatkul;
    }

    //selektor nama matkul
    public String getNamaMatkul(){
        return this.nama;
    }

    //selektor sks matkul
    public Integer getSKSMatkul(){
        return this.sks;
    }

    //mutator ID matkul
    public void setIDMatkul(String ID){
        this.idMatkul = ID;
    }

    //mutator nama matkul
    public void setNamaMatkul(String nama){
        this.nama = nama;
    }

    //mutator sks matkul
    public void setSKSMatkul(Integer sks){
        this.sks = sks;
    }



    
}
