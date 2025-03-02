package pertemuandua;
/*  Nama File   : Titik.java
 *  Deskripsi   : Berisi atribut dan method dalam class titik
 *  Pembuat     : Nazla Azzahra Hermana 
 *  Tanggal     : 26 Februari 2025
*/

public class Titik {
    private double absis; 
    private double  ordinat;
    private static int counterTitik = 0;

    //Konstruktor untuk membuat titik (0,0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    public void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }
    public void setAbsis(double x){
        absis = x;
    }
    public void setOrdinat(double y){
        ordinat = y;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    public static int getCounterTitik(){
        return counterTitik;
    }

    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(this.absis) + (this.ordinat);
    }

    public double getJarak(Titik T) {
        return Math.sqrt(((T.absis-absis) * (T.absis-absis)) + (T.ordinat-ordinat) * (T.ordinat-ordinat));
    }

    public void refleksiX() {
        this.ordinat = ordinat * - this.ordinat;
    }

    public void refleksiY() {
        this.absis = absis * - this.absis;
    }

    public Titik getRefleksiX() {
        Titik T3 = new Titik(this.absis, this.ordinat * - this.ordinat);
        return T3;
    }

    public Titik getRefleksiY() {
        Titik T3 = new Titik(this.absis * - this.absis, this.ordinat);
        return T3;
    }
    
}
