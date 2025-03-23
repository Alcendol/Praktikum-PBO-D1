// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : Dosen.java

package pertemuan2;

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    
      // Konstruktor tanpa parameter
      public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Getter
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    // Setter
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
