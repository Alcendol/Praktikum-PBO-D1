package pertemuan5;

public abstract class BangunDatar {
    private int jumlahSisi;
    private String warna;
    private String border;

    public BangunDatar(){

    }

    public int getJmlSisi(){
        return this.jumlahSisi;
    }

    public void setJmlSisi(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }

    public String getWarna(){
        return this.warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return this.border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public void printInfo(){
        System.out.println("Jumlah sisi : " + jumlahSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }

    public boolean isEqual(BangunDatar B){
        return this.getLuas() == B.getLuas();
    }

    
}