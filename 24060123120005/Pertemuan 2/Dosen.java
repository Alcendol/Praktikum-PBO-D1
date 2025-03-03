/*  Nama File   : Dosen.java
 *  Deskripsi   : Berisi atribut dan method dalam class Dosen
 *  Pembuat     : Patricia Gabrielle Yudianto
 *  Tanggal     : 2 Maret 2025 
*/

public class Dosen {
    // ATRIBUT
    private String nip;
    private String nama;
    private String prodi;

    // METHOD

    // konstruktor
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor
    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    // mutator
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
