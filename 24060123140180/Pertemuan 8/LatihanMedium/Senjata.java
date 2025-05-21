package LatihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int pelor;


    public Senjata(String bunyi){
        this.bunyi = bunyi;
        menusuk = false;
        pelor = 0;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void setPeluru(int pelor) {
        this.pelor = pelor;
    }

    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public int getPeluru() {
        return pelor;
    }
    
}
