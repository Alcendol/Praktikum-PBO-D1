public class ruangDosen extends ruang {
    protected departemen departemen;
    protected String namaDosen;
    protected int kursi;
    protected int meja;
    private static int counterRuangDosen = 0;

    public ruangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, departemen departemen, String namaDosen, int kursi, int meja) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.namaDosen = namaDosen;
        this.kursi = kursi;
        this.meja = meja;
        counterRuangDosen++;
    }

    public static int getCounterRuangDosen() {
        return counterRuangDosen;
    }
    public double getBiayaKebersihan() {
        return panjang * lebar * departemen.getBiayaKebersihan(); 
    }

    public void printRuang() {
        super.printRuang();
        System.out.println("Biaya Kebersihan: " + getBiayaKebersihan());
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Kursi: " + kursi);
        System.out.println("Meja: " + meja);
    }


    
}
