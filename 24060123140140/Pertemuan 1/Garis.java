
public class Garis {
    
    private Titik awal, akhir;
    private static int counterGaris = 0;

    //konsturktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhhir denagn (1,1)//
    public Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        counterGaris++;
    }

    //konstruktor dengan parameter ternasuk titik awal dan titik akhir//
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }
    
    //selektor (getter)untuk setiap atribut beserta mutatornya (setter). di tambahkan pula sektor untuk mendapatkan atrinbut static couterGaris//
    public Titik getAwal() {
        return awal;
    }

    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    public Titik getAkhir() {
        return akhir;
    }

    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }
}

