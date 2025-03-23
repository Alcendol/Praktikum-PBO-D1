package pertemuan3;
// File : "Asersi2.java"
// deskripsi : "Program untuk demo asersi, yang akan menolak input jari2 lingkaran bernilai nol"
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }    
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 2;
        assert(jariJari > 0);
        Lingkaran l = new Lingkaran(0);
        double keliling = l.hitungKeliling();
        System.out.println("Keliling lingkaran : " + keliling );
    }
}

//Kesalahan pada program tersebut terletak pada peletakan asersi di psvm, seharusnya asersi diletakkan pada class lingkaran agar tidak ada celah bagi user untuk memasukkan input yang tdk sesuai dengan constraints