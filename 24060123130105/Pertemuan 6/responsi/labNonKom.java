
public class labNonKom extends ruangLab {
    protected String[] mataKuliah;
    private static int counterLabNonKom = 0;

    public labNonKom(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double sewa, String[] mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, sewa);
        this.mataKuliah = mataKuliah;
        counterLabNonKom++;
    }
    public static int getCounterLabNonKom() {
        return counterLabNonKom;
    }
    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Mata Kuliah: ");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
    }
    
}
