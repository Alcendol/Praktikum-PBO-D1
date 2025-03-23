/*Nama File  : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak jari-jari lingkaran yang bernilai 0
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : Rabu, 5 Maret 2025
 * */

 package pertemuanTiga;
//class lingkaran
class Lingkaran{
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
    public static void main(String[] args){
        double jariJari = 5;
        assert (jariJari > 0) : "jari jari tidak boleh kurang dari sama dengan nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
    
}

//4. secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan pada lembar laporan praktikum!
// Tidak ada validasi di konstruktor lingkaran
// Masalah: Asersi hanya dilakukan di main, tetapi tidak ada validasi langsung di konstruktor Lingkaran. Ini bisa menyebabkan objek dengan jariJari = 0 tetap dibuat jika assert dinonaktifkan.
// Solusi: Tambahkan validasi di dalam konstruktor:
// public Lingkaran(double jariJari){
//     if (jariJari <= 0) {
//         throw new IllegalArgumentException("Jari-jari harus lebih dari nol!");
//     }
//     this.jariJari = jariJari;
// }






