
public abstract class ruang {
    protected String kode;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected int kapasitas;
    private static int counterRuang = 0;

    

    public ruang(String kode, double panjang, double lebar, double tinggi ,int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        counterRuang++;
    }

    public static int getCounterRuang() {
        return counterRuang;
    }

    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getKapasitas(){
        return kapasitas;
    }
    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public abstract double getBiayaKebersihan();
    public void printRuang(){
        System.out.println("Kode Ruang: " + kode);
        System.out.println("Panjang Ruang: " + panjang);
        System.out.println("Lebar Ruang: " + lebar);
        System.out.println("Tinggi Ruang: " + tinggi);
        System.out.println("Kapasitas Ruang: " + kapasitas);
    }

}
