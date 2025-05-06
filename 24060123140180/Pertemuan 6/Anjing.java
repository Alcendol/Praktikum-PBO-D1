package Pertemuan6;

public class Anjing extends Anabul{
    /*=============== Atribut ===============*/
    private String JenisAnjing;
    private String WarnaAnjing;

    /*=============== Method ===============*/
    public Anjing() {
        super();
        this.JenisAnjing = "";
        this.WarnaAnjing = "";
    }

    public Anjing(String Nama, String JenisAnjing, String WarnaAnjing) {
        super(Nama);
        this.JenisAnjing = JenisAnjing;
        this.WarnaAnjing = WarnaAnjing;
    }

    public String getJenisAnjing() {
        return JenisAnjing;
    }

    public void setJenisAnjing(String JenisAnjing) {
        this.JenisAnjing = JenisAnjing;
    }

    public String getWarnaAnjing() {
        return WarnaAnjing;
    }

    public void setWarnaAnjing(String WarnaAnjing) {
        this.WarnaAnjing = WarnaAnjing;
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " Berlari/berjalan gagah dan elegan");
    }

    @Override
    public void Suara(){
        System.out.println(getNama() + " Bersuara Guk Guk");
    }
        
}
