/* Nama File    : MataKuliah.java
 * Deskripsi    : Berisi atribut dan method dari class MataKuliah
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/2/2025
 */ 

public class MataKuliah {
    /* ATRIBUT */
    private String idMatkul;
    private String nama;
    private int sks;

    /* METHOD */
    //konstruktor
    public MataKuliah () {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah (String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor
    public String getIdMatkul () {
        return this.idMatkul;
    }

    public String getNama () {
        return this.nama;
    }

    public int getSks () {
        return this.sks;
    }

    //mutator
    public void setIdMatkul (String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setSks (int sks) {
        this.sks = sks;
    }
}
