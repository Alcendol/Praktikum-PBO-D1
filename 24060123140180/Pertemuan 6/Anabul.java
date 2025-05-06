package Pertemuan6;

public class Anabul {
    /*=============== Atribut ===============*/
    private String Nama;

    /*=============== Method ===============*/
    public Anabul() {
        this.Nama = "Anabul";
    }
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void Gerak(){
        System.out.println(Nama + "bergerak");
    }

    public void Suara(){
        System.out.println(Nama + "bersuara");
    }

    
}
