// Nama File : Dosen.java
// Deskripsi : Atribut dan Method class Dosen
// Pembuat : Muhammad Shafwan Raihan S
// Tanggal : 27 / 02 / 2025

public class Dosen {

    /*----------ATRIBUT----------*/
    private String nip;
    private String nama;
    private String prodi;

    /*----------METHOD----------*/
    // Konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor NIP
    public String getNip() {
        return nip;
    }

    // Selektor Nama
    public String getNama() {
        return nama;
    }

    // Selektor Prodi
    public String getProdi() {
        return prodi;
    }

    // Mutator NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Mutator Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mutator Prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String toString() {
        return "Dosen Wali: " + nama + " (NIP: " + nip + ", Prodi: " + prodi + ")";
    }
}

