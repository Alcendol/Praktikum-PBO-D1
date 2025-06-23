/* Nama File    : Dosen.java
 * Deskripsi    : berisi program asersi menolak input Lingkaran
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 6 Maret 2025
 */

class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 5;
        assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}

// PETANYAAN : 
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas, jelaskan!

// JAWABAN : 
// ----Asersi Seharusnya Ditempatkan di Konstruktor----
// Asersi (assert) digunakan untuk memeriksa nilai yang tidak boleh terjadi dalam program.
// Dalam kode di atas, asersi hanya dilakukan dalam main() sebelum objek Lingkaran dibuat. 
// Namun, jika ada cara lain untuk membuat objek Lingkaran di tempat lain dalam program, asersi tersebut tidak akan berlaku. Perbaikan kode:

// class Lingkaran {
//     private double jariJari;

//     public Lingkaran(double jariJari) {
//         assert(jariJari > 0) : "Jari-jari tidak boleh nol atau negatif!!!";
//         this.jariJari = jariJari;
//     }

//     public double hitungKeliling() {
//         return 2 * Math.PI * jariJari;
//     }
// }
