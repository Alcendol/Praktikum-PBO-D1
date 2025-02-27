// Nama File : Matkul.java
// Deskripsi : berisis atribut dan method dalam class Matkul
// Pembuat   : Pramudya Jati Pamungkas
// Tanggal   : 27 Februari 2025

public class Matkul {
    /*************** Atribut *****************/
    private String idMatkul;
    private String namaMatkul;
    private int sks;
    /*************** Method *****************/
    // Constructor
    protected Matkul(){
        this.idMatkul = "00000";
        this.namaMatkul = "Nama Matkul";
        this.sks = 0;
    }

    protected Matkul(String idMatkul, String namaMatkul, int sks){
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }
    // Selector / getter
    protected String getIdMatkul(){
        return idMatkul;
    }

    protected String getNamaMatkul(){
        return namaMatkul;
    }

    protected int getSks(){
        return sks;
    }

    // Mutator / Setter
    protected void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    protected void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }
    
    protected void setSks(int sks){
        this.sks = sks;
    }
}
