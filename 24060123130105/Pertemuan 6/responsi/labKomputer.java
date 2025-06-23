public class labKomputer extends ruangLab {
    protected int jumlahKomputer;
    private static int counterLabKomputer = 0;

    public labKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double sewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, sewa);
        this.jumlahKomputer = jumlahKomputer;
        counterLabKomputer++;
    }
    public static int getCounterLabKomputer() {
        return counterLabKomputer;
    }
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }
    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    @Override
    public void printRuang() {
        super.printRuang();
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}
