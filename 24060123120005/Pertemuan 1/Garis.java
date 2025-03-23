/*  Nama File   : Garis.java
 *  Deskripsi   : Berisi atribut dan method dalam class Garis
 *  Pembuat     : Patricia Gabrielle Yudianto
 *  Tanggal     : 23 Februari 2025 
*/

public class Garis {
    Titik titikawal;
    Titik titikakhir;
    static int counterGaris = 0;

    //Kontruktor tanpa parameter yang diinisialisasi titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        this.titikawal = new Titik(0,0);
        this.titikakhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik A, Titik B){
        this.titikawal = A;
        this.titikakhir = B;
        counterGaris++;
    }


    //Getter (selektor)
    Titik getTitikAwal(){
        return titikawal;
    }

    Titik getTitikAkhir(){
        return titikakhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    //Selektor (mutator)
    void setTitikAwal(Titik A){
        this.titikawal = A;
    }

    void setTitikAkhir(Titik B){
        this.titikakhir = B;
    }

    //Method untuk mendapatkan panjang sebuah garis
    double getPanjangGaris(){
        double dx = titikakhir.getAbsis() - titikawal.getAbsis();
        double dy = titikakhir.getOrdinat() - titikawal.getOrdinat();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy,2));

    }

    //Method untuk mendapatkan gradien garis
        double getGradien(){
            return(titikakhir.getOrdinat() - titikawal.getOrdinat())/(titikakhir.getAbsis() - titikawal.getAbsis());
        }

    //Method untuk mendapatkan titik tengah garis
        Titik getTitikTengah(){
            double a = (titikawal.getAbsis() + titikakhir.getAbsis())/2;
            double b = (titikawal.getOrdinat() + titikakhir.getOrdinat())/2;
            return new Titik(a,b);
        }

    //Method untuk mengecek apakah garis sejajar dengan garis lain
        boolean IsSejajar(Garis G){
            //Jika kedua garis vertikal
            if ((this.titikawal.absis == this.titikakhir.absis) && (G.titikawal.absis == G.titikakhir.absis)) {
                return true;
            }
            //Jika gradien kedua garis sama
            return this.getGradien() == G.getGradien();
        }
    
    //Method untuk mengecek apakah garis tegak lurus dengan garis lain
        boolean IsTegakLurus(Garis G){
            //Jika salah satu garis vertikal dan garis lain horizontal
            if (((this.titikawal.absis == this.titikakhir.absis) && (G.titikawal.ordinat == G.titikakhir.ordinat)) 
            || (this.titikawal.ordinat == this.titikakhir.ordinat && G.titikawal.absis == G.titikakhir.absis)){
                return true;
            }
            //Jika kedua gradien garis dikalikan hasilnya -1
                return this.getGradien() * G.getGradien() == -1;
            }


    //Method untuk menampilkan titik awal dan titik akhir garis
        void printGaris() {
        System.out.println("Titik (" + titikawal.getAbsis() + "," + titikawal.getOrdinat() + ") ke Titik (" + titikakhir.getAbsis() + "," + titikakhir.getOrdinat() + ")");
        }

    //Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c
        String getPersamaanGaris(){
            //Jika garis vertikal (absis titik awal = absis titik akhir)
            if (titikawal.getAbsis() == titikakhir.getAbsis()){
                return "x = " + titikawal.getAbsis();
            }
            
            //Jika garis tidak vertikal
            double m = getGradien();
            double c = titikawal.getOrdinat() - (m * titikawal.getAbsis());

            return "y = " + m + "x + " + c;
        }
}   
