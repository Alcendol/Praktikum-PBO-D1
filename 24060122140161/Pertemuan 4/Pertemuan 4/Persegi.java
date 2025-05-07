public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi,String warna,String border){
        super(4, warna, border);
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi; 
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    public void printInfo(){
        System.out.println("Warna Bangun Datar : "+getWarna());
        System.out.println("Border Bangun Datar : "+getBorder());
        System.out.println("Jumlah Sisi Bangun Datar : "+getJmlSisi());
        System.out.println("sisi " + sisi);
    }
}