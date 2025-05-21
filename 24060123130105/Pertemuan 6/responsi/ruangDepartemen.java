public class ruangDepartemen extends ruang {
    protected departemen departemen;
    protected int kursi;
    protected int meja;
    protected int lemari;
    private static int counterRuangDepartemen = 0;

    public ruangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, departemen departemen, int kursi, int meja, int lemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.kursi = kursi;
        this.meja = meja;
        this.lemari = lemari;
        counterRuangDepartemen++;
    }
    public static int getCounterRuangDepartemen() {
        return counterRuangDepartemen;
    }
    public double getBiayaKebersihan() {
        return panjang * lebar * departemen.getBiayaKebersihan(); 
    }

    public void printRuang() {
        super.printRuang();
        System.out.println("Biaya Kebersihan: " + getBiayaKebersihan());
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Kursi: " + kursi);
        System.out.println("Meja: " + meja);
        System.out.println("Lemari: " + lemari);
    }



}
