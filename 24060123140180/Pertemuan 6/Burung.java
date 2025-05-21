package Pertemuan6;

public class Burung extends Anabul {
    /*=============== Atribut ===============*/
    private String JenisBurung;
    private String WarnaBurung;

    /*=============== Method ===============*/
    public Burung() {
        super();
        this.JenisBurung = "";
        this.WarnaBurung = "";
    }

    public Burung(String Nama, String JenisBurung, String WarnaBurung) {
        super(Nama);
        this.JenisBurung = JenisBurung;
        this.WarnaBurung = WarnaBurung;
    }

    public String getJenisBurung() {
        return JenisBurung;
    }

    public void setJenisBurung(String JenisBurung) {
        this.JenisBurung = JenisBurung;
    }

    public String getWarnaBurung() {
        return WarnaBurung;
    }

    public void setWarnaBurung(String WarnaBurung) {
        this.WarnaBurung = WarnaBurung;
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " Terbang  ");
    }

    @Override
    public void Suara() {
        System.out.println(getNama() + " Bersuara Cuit Cuit");
    }
}
