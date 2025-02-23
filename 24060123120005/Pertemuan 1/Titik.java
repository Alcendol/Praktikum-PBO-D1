/*  Nama File   : Titik.java
 *  Deskripsi   : Berisi atribut dan method dalam class Titik
 *  Pembuat     : Patricia Gabrielle Yudianto
 *  Tanggal     : 23 Februari 2025 
*/

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

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
        System.out.println("Titik (" + absis + "," + ordinat + ")");
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

    int getKuadran(){
        int i; 
        if (this.getAbsis() > 0 && this.getOrdinat() > 0){
            i = 1;
        }
        else if (this.getAbsis() < 0 && this.getOrdinat() > 0){
            i = 2;
        }
        else if (this.getAbsis() < 0 && this.getOrdinat() < 0){
            i = 3;
        }
        else if (this.getAbsis() > 0 && this.getOrdinat() < 0){
            i = 4;
        }
        else{
            i = 0;
        }
        return i;
    }

    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    double getJarak(Titik T){
        double dx = T.absis - this.absis;
        double dy = T.ordinat - this.ordinat;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    void refleksiX(){
        this.ordinat = -this.ordinat;    
    }

    void refleksiY(){
        this.absis = -this.absis;    
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}

