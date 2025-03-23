/*
    Nama File : Asersi2.java
    Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran bernilai nol
    Pembuat   : Patricia Gabrielle Yudianto
    Tanggal   : 9 Maret 2025
*/

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        assert (jariJari > 0) : "jari jari tidak boleh kurang dari atau sama dengan nol!!!"; // Assertion dikasih di
                                                                                             // konstruktor agar kondisi
                                                                                             // umumnya terpenuhi dari
                                                                                             // awal
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 5;
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling lingkaran = " + kelilingLingkaran);

    }
}

/*
 * Pertanyaan :
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan
 * pada lembar laporan praktikum!
 * 
 * Jawaban :
 * 1. Asersi seharusnya ada di dalam konstruktor, bukan di main()
 * 
 * Dalam program pada soal, asersi (assert(jariJari > 0)) diletakkan di main()
 * sebelum pembuatan objek Lingkaran, ini kurang tepat karena tujuan utama
 * asersi adalah memastikan setiap objek Lingkaran yang dibuat selalu valid,
 * bukan hanya saat pertama kali diberikan nilai di main()
 * Jika objek Lingkaran dibuat dari sumber lain (misalnya dari input pengguna),
 * maka asersi di main() tidak akan selalu menjamin jari-jari valid
 * 
 * 2. Kesalahan pada pesan asersi, seharusnya
 * "jari jari tidak boleh kurang dari atau sama dengan nol!!!"
 * 
 * Dalam kode pada soal, pesan asersinya "jari jari tidak boleh nol!!!"
 * Pesan ini seharusnya lebih jelas dan sesuai dengan ketentuan (kondisi diluar
 * jariJari > 0), yaitu
 * "jari jari tidak boleh kurang dari atau sama dengan nol!!!"
 */
