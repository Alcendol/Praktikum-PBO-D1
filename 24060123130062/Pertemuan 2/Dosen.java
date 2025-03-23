// Nama : Muhammad Mahdi Buntarwatangan
// NIM  : 24060123130062
// Lab : D1
// Nama File : Dosen.java
package petemuan2.permahasiswaan;

public class Dosen {
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
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor untuk getnip
    public String get_nip(){
        return this.nip;
    }

    //selektor untuk getnama
    public String get_nama(){
        return this.nama;
    }

    //selektor untuk getprodi
    public String get_prodi(){
        return this.prodi;
    }

    //mutator untuk nip
    public void set_nip(String nip){
        this.nip = nip;
    }

    //mutator untuk nama
    public void set_nama(String nama){
        this.nama = nama;
    }

    //mutator untuk prodi
    public void set_prodi(String prodi){
        this.prodi = prodi;
    }

    //print detail dosen
    public void printDetailDosen(){
        System.out.println("NIP : " + get_nip());
        System.out.println("Nama : " + get_nama());
        System.out.println("Prodi : " + get_prodi());
    }
}



