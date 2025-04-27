public abstract class ruangFakultas extends ruang {
    protected static double biayaKebersihan = 10000;
    private static int counterRuangFakultas = 0;

    public ruangFakultas(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        counterRuangFakultas++;
    }

    public static int getCounterRuangFakultas() {
        return counterRuangFakultas;
    }
    public double getBiayaKebersihan() {
        return panjang * lebar * biayaKebersihan;
    }

    @Override
    public void printRuang() {
        super.printRuang();
        System.out.println("Biaya Kebersihan: " + getBiayaKebersihan());
    }


}
