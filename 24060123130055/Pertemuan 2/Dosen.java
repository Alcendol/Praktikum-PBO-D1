/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class dosen
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 26 Februari 2025
 */

public class Dosen {
    // Atribut
    private String nip;
    private String nama;
    private String prodi;

    // Method
    // Konstruktortanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter nip,nama,prodi 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public String getNip() {
        return this.nip;
    } 

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    // Mutator
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
