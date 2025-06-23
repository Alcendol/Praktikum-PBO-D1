public abstract class ruangLab extends ruangFakultas{
    protected String namaLab;
    protected double sewa;
    private static int counterRuangLab = 0;

    public ruangLab(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double sewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.sewa = sewa;
        counterRuangLab++;
    }
    public static int getCounterRuangLab() {
        return counterRuangLab;
    }
    public String getNamaLab() {
        return namaLab;
    }
    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }
    public double getSewa() {
        return sewa;
    }
    public void setSewa(double sewa) {
        this.sewa = sewa;
    }
    @Override
    public void printRuang() {
        super.printRuang();
        System.out.println("Nama Lab: " + namaLab);
        System.out.println("Sewa: " + sewa);
    }
}
