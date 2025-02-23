/*Nama: Muhammad Helmi Abdulbaqi */
/*Nim: 24060123130076 */
/*Kelas-Lab: D-C1 */

public class titik {
    //atribut
    double absis;
    double ordinat;
    static int counterTitik=0;


    //method
    titik(double absis, double ordinat){
        this.absis=absis;
        this.ordinat=ordinat;
        counterTitik++;
    }

    titik(){
        this(0,0);
    }
    static int getCounterTitik(){
        return counterTitik;
    }


    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double X){
        absis=X;
    }

    void setOrdinat(double X){
        ordinat=X;
    }

    void geser(double X, double Y){
        absis=absis+X;
        ordinat=ordinat+Y;
    }

    void printTitik(){
        System.out.println("titik ("+ absis+","+ ordinat+")");
    }

    int getKuadran(){
        if(getAbsis()>0 && getOrdinat()>0){
            return 1;
        }
        else if(getAbsis()<0 && getOrdinat()>0){
            return 2;
        }
        else if(getAbsis()<0 && getOrdinat()<0){
            return 3;
        }
        else{
            return 4;
        }
    }
    double getJarakPusat(){
        return Math.sqrt((getAbsis()*getAbsis())+(getOrdinat()*getOrdinat()));
    }

    double getJarak(titik T){
        return Math.sqrt(
            ((T.getAbsis()-getAbsis())*(T.getAbsis()-getAbsis()))+((T.getOrdinat()-getOrdinat())*(T.getOrdinat()-getOrdinat()))
        );
    }

    void refleksiX(){
        ordinat=ordinat*-1;
    }
    void refleksiY(){
        absis=absis*-1;
    }

    titik getRefleksiX(){
        return new titik(this.absis, -this.ordinat);

    }

    titik getRefleksiY(){
        return new titik(-this.absis, this.ordinat);
    }

}
