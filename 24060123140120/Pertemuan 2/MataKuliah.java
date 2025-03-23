// Nama File : MataKuliah.java
// Deskripsi : Atribut dan Method class MataKuliah
// Pembuat : Muhammad Shafwan Raihan S
// Tanggal : 27 / 02 / 2025

public class MataKuliah {

    /*----------ATRIBUT----------*/
    private String idMatKul;
    private String nama;
    private int sks;

    /*----------METHOD----------*/
    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor IdMatkul
    public String getIdMatKul() {
        return idMatKul;
    }

    // Selektor Nama
    public String getNama() {
        return nama;
    }

    // Selektor SKS
    public int getSks() {
        return sks;
    }

    // Mutator IdMatkul
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // Mutator Nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Mutator SKS
    public void setSks(int sks) {
        this.sks = sks;
    }

    public String toString() {
        return nama + " (" + idMatKul + ") " + sks + " SKS";
    }
}