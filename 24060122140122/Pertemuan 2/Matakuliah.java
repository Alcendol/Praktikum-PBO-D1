


// Nama File : Matakuliah.java
// Nama : Rafi Deandra
// NIM : 240122140122

public class Matakuliah {
    // Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    public  Matakuliah(){
        this.idMatkul = ""; 
        this.nama = "";
        this.sks = 0 ;
    }

    // Konstruktor dengan parameter
    public Matakuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor (Getter)
    public String getidMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public Integer getSks() {
        return sks;
    }

    // Mutator (Setter)
    public void setidMatkul(String nip) {
        this.idMatkul = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}