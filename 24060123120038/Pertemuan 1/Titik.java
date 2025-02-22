package pertemuansatu;
//Nama: Nazla Azzahra Hermana
//NIM: 24060123120038
//Lab: PBO D1

public class Titik {
    double absis; 
    double ordinat;
    static int counterTitik = 0;

    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    static int getCounterTitik(){
        return counterTitik;
    }

    int getKuadran() {
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

    double getJarakPusat() {
        return Math.sqrt(this.absis) + (this.ordinat);
    }

    double getJarak(Titik T) {
        return Math.sqrt(((T.absis-absis) * (T.absis-absis)) + (T.ordinat-ordinat) * (T.ordinat-ordinat));
    }

    void refleksiX() {
        this.ordinat = ordinat * - this.ordinat;
    }

    void refleksiY() {
        this.absis = absis * - this.absis;
    }

    Titik getRefleksiX() {
        Titik T3 = new Titik(this.absis, this.ordinat * - this.ordinat);
        return T3;
    }

    Titik getRefleksiY() {
        Titik T3 = new Titik(this.absis * - this.absis, this.ordinat);
        return T3;
    }
    
}
