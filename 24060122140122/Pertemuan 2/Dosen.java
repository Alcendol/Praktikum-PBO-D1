// Nama File : Dosen.java
// Nama : Rafi Deandra
// NIM : 240122140122

public  class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    //konstruktor
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //konstruktor dengan parameter 
    public Dosen(String nip,String nama,String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //getter (selektor)
    public String getnip(){
        return nip;
    }

    public String getnama(){
        return nama;
    }

    public String getprodi(){
        return prodi;
    }

    //setter 
    public void setnip(String nip){
        this.nip = nip;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

}