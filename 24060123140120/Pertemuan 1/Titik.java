// Nama File : Garis.Java
// Deskripsi : Atribut dan method class Titik
// Pembuat : Muhammad Shafwan Raihan S_24060123140120
// Tanggal : 22/02/2025

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0; 
    
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" +absis + "," + ordinat +")");
    }

}

class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
    } 
}
