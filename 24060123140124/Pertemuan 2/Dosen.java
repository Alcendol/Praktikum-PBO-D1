/*  Nama File   : Dosen.java 
    Deskripsi   : Kodingan ini adalah atribut dan method dalam class Dosen
    Pembuat     : Muhammad Paruda Pradayan / 24060123140124
    Tanggal     : 28 - Februari - 2025
*/

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    
    //Konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this. prodi = "";
    }
    
    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor masing-masing atribut
    public String getnip() {
        return nip;
    }

    public String getnama() {
        return nama;
    }

    public String getprodi() {
        return prodi;
    }

    //Mutator masing-masing atribut
    public void setnip(String nip) {
        this.nip = nip;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }








}