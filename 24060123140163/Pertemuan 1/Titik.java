/*Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat : Nasywa Alya Kamila/24060123140163
 * Tanggal : Jumat, 21 Februari 2025
 * */

 public class Titik {
    /****************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /****************METHOD*****************/
    //Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Overloading
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //Mengembalikan nilai absis 
    double getAbsis() {
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru y
    void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }
    
    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengecek koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
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
