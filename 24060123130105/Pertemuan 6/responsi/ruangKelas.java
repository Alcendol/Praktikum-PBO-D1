public class ruangKelas extends ruangFakultas{
    protected int kursiTersedia;
    protected int kursiRusak;
    private static int counterRuangKelas = 0;
    
    public static int getCounterRuangKelas() {
        return counterRuangKelas;
    }

    public ruangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursiTersedia = kursiTersedia;
        this.kursiRusak = kursiRusak;
        counterRuangKelas++;
    }
    public int getKursiTersedia() {
        return kursiTersedia;
    }
    public void setKursiTersedia(int kursiTersedia) {
        this.kursiTersedia = kursiTersedia;
    }

    public int getKursiRusak() {
        return kursiRusak;
    }
    public void setKursiRusak(int kursiRusak) {
        this.kursiRusak = kursiRusak;
    }

    @Override
    public void printRuang() {
        super.printRuang();
        System.out.println("Kursi Tersedia: " + kursiTersedia);
        System.out.println("Kursi Rusak: " + kursiRusak);
    }


    
}