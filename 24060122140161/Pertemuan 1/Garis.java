public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    static int counterGaris = 0;

    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public Titik geTitikAwal() {
        return this.titikAwal;
    }

    public Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    public int getCounterGaris() {
        return counterGaris;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double hitungPanjang() {
        return Math.sqrt(Math.pow(getTitikAkhir().getAbsis() - geTitikAwal().getAbsis(), 2) + 
                         Math.pow(getTitikAkhir().getOrdinat() - geTitikAwal().getOrdinat(), 2));
    }
    
    public double hitungGradien() {
        return (getTitikAkhir().getOrdinat() - geTitikAwal().getOrdinat()) / 
               (getTitikAkhir().getAbsis() - geTitikAwal().getAbsis());
    }

    public Titik getTitikTengah(){
        double absis = (geTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2;
        double ordinat = (geTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2;
        return new Titik(absis, ordinat);
    }

    public boolean isSejajar(Garis garis) {
        return this.hitungGradien() == garis.hitungGradien();
    }

    public boolean isTegakLurus(Garis garis) {
        return this.hitungGradien() * garis.hitungGradien() == -1;
    }

    public void printPersamaanGaris() {
        double m = hitungGradien();
        double c = geTitikAwal().getOrdinat() - m * geTitikAwal().getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }

    public void printGaris() {
        System.out.println("Titik Awal: ");
        geTitikAwal().printTitik();
        System.out.println("Titik Akhir: ");
        getTitikAkhir().printTitik();
    }
}
