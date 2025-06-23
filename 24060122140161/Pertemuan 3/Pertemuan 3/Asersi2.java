/**
 * File : Asersi2.java
 * Deskripsi: program untuk demo asersi, yang akan menolak input
 *              jari - jari lingkaran yang bernilai nol
 * 
 */

//class Lingkaran 
class Lingkaran{
private double jariJari;
public Lingkaran(double jariJari){
this.jariJari = jariJari;
}
public double hitungKeliling(){
double keliling = 2*Math. PI*jariJari;
return keliling;
}
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 10;
        assert(jariJari>0):"jari jari tidak boleh nol !!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
        +kelilingLingkaran);
    }
}

//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 

//Jawaban Pertanyaan
/*Dalam kode , asersi digunakan untuk memastikan bahwa jariJari harus lebih besar dari 0. 
 Namun, saat asersi dieksekusi, nilai jariJari sebenarnya adalah 0. Di dalam code, asersi akan gagal
 dan program akan melempar AssertionError dengan pesan yang diberikan. */