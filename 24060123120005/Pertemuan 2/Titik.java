/*  Nama File   : Titik.java
 *  Deskripsi   : Berisi atribut dan method dalam class Titik
 *  Pembuat     : Patricia Gabrielle Yudianto /24060123120005
 *  Tanggal     : 23 Februari 2025 
*/

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public int getKuadran() {
        int i;
        if (this.getAbsis() > 0 && this.getOrdinat() > 0) {
            i = 1;
        } else if (this.getAbsis() < 0 && this.getOrdinat() > 0) {
            i = 2;
        } else if (this.getAbsis() < 0 && this.getOrdinat() < 0) {
            i = 3;
        } else if (this.getAbsis() > 0 && this.getOrdinat() < 0) {
            i = 4;
        } else {
            i = 0;
        }
        return i;
    }

    public double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    public double getJarak(Titik T) {
        double dx = T.absis - this.absis;
        double dy = T.ordinat - this.ordinat;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}
