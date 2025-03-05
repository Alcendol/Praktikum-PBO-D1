// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : Titik.java
public class Titik{
    double absis;
    double ordinat;
    int kuadran;
    static int counterTitik = 0;

    //Konstruktor default
    Titik(){
        absis = 0;
        ordinat = 0;
        kuadran = 0;
        counterTitik++;
    }

    //konstruktor with absis and ordinat
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        kuadran = 0;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return this.absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing2 sejauh x dan y
    void geser(double x, double y){
        this.absis += x;
        this.ordinat += y;
    }

    //mencetak titik
    void printTitik(){
        System.out.println("Titik ("+ getAbsis() +","+ getOrdinat() +")");
    };

    //mengembalikan jumlah counter titik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan kuadran titik
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            kuadran = 1;
        }else if(absis < 0 && ordinat > 0){
            kuadran = 2;
        }else if(absis < 0 && ordinat < 0){
            kuadran = 3;
        }else if(absis > 0 && ordinat < 0){
            kuadran = 4;
        }else{
            kuadran = 0;
        }
        return kuadran;
    }

    //mengembalikan jarak dari titik pusat
    double getJarakPusat(){
        return Math.floor(
            Math.sqrt(
                Math.pow(getAbsis(), 2) 
                + 
                Math.pow(getOrdinat(), 2)
            )
        );
    }

    //mengembalikan jarak antara 2 titik
    double getJarak(Titik T1){
        return Math.sqrt(
            Math.pow((T1.getAbsis() - absis), 2) 
            + 
            Math.pow((T1.getOrdinat() - ordinat), 2)
        );
    }

    //refleksi terhadap sumbu X
    void refleksiX(){
        this.ordinat = this.ordinat * -1;
    }

    //refleksi terhadap sumbu Y
    void refleksiY(){
        this.absis = this.absis * -1;
    }
}//end class titik