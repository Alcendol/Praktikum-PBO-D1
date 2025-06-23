package Pertemuan6;

public class Kucing extends Anabul{
    /*=============== Atribut ===============*/
    private String JenisKucing;
    private String WarnaKucing;
    
    /*=============== Method ===============*/
    public Kucing() {
        super();
        this.JenisKucing = "";
        this.WarnaKucing = "";
    }
    
    public Kucing(String Nama, String JenisKucing, String WarnaKucing) {
        super(Nama);
        this.JenisKucing = JenisKucing;
        this.WarnaKucing = WarnaKucing;
    }
    
    public String getJenisKucing() {
        return JenisKucing;
    }

    public void setJenisKucing(String JenisKucing) {
        this.JenisKucing = JenisKucing;
    }

    public String getWarnaKucing() {
        return WarnaKucing;
    }

    public void setWarnaKucing(String WarnaKucing) {
        this.WarnaKucing = WarnaKucing;
    }
    
    @Override
    public void Gerak(){
        System.out.println(getNama() + " Berlari/berjalan lincah");
    }
    
    @Override
    public void Suara(){
        System.out.println(getNama() + " Bersuara Miaw Miaw Nigga");
    }


    
}
