/*Nama: Muhammad Helmi Abdulbaqi */
/*Nim: 24060123130076 */
/*Kelas-Lab: D-C1 */

public class garis {
    //atribut
    titik T1; 
    titik T2;
    static int counterGaris;
    

    //method
    garis(){
        this(new titik(0,0), new titik(1,1));
    }

    garis(titik T1, titik T2){
        this.T1=T1;
        this.T2=T2;
        counterGaris++;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getPanjangGaris(){
        return Math.sqrt(
            ((T1.getAbsis()-T2.getAbsis())*(T1.getAbsis()-T2.getAbsis()))+((T1.getOrdinat()-T2.getOrdinat())*(T1.getOrdinat()-T2.getOrdinat()))
        );
    }

    double getGradien(){
        return (T2.ordinat-T1.ordinat)/(T2.absis-T1.absis);
    }

    titik titikTengah(){
        double X=(T1.absis+T2.absis)/2;
        double Y=(T1.ordinat+T2.ordinat)/2;
        return new titik(X,Y);
    }

    boolean isSejajar(garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal: (" + T1.getAbsis() + ", " + T1.getOrdinat() + "), Titik Akhir (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    void printPersamaanGaris(){
        System.out.println("y = " + getGradien() + "x + " + (T1.getOrdinat() - getGradien() * T1.getAbsis()));
    }



}
