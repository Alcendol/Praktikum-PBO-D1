
/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Nadzif Silakhudin
 * Tanggal      : 2/19/2025
 */

public class Titik {
    /******* ATRIBUT *******/
    double absis, ordinat;
    static int counterTitik = 0;

    /******* METHOD *******/

    static int getCounterTitik(){
        return counterTitik;
    }

    // Konstruktor untuk membuat titik (0,0)

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

    // Mengembalikan nilai absis

    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat

    double getOrdinat(){
        return ordinat;
    }

    // Mengeset nilai absis dengan nilai baru x

    void setAbsis(double x){
        absis = x;
    }

    // Mengeset nilai ordinant dengan nilai baru y

    void setOrdinat(double x){
        ordinat = x;
    }

    // Menggeser titik sebesar nilai x dan y

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    // Mencetak nilai Titik

    void printTitik(){
        System.out.println("Titik : (" + absis + "," + ordinat +")");
    }
    
    void printCountertitik(){
        System.out.println("counter : " + Titik.getCounterTitik());
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0 ) {
            return 1;
        }else if(absis < 0 && ordinat > 0){
            return 2;
        }else if(absis < 0 && ordinat < 0){
            return 3;
        }else if (absis > 0 && ordinat < 0){  
            return 4;
        }else {
            return 0;
        }
    }

    double getJarak(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }
    
    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }


}
