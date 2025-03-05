// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : MataKuliah.java

package pertemuan2;

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    // Konstruktor
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    
    }

    // Getter
    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Setter
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
