/**
* Nama File    : Asersi2.java
* Deskripsi    : Program untuk demo asersi, yang akan menolak input 
*                jari-jari lingkaran yang bernilai nol
*/
// class lingkaran
class Lingkaran {
  private double jariJari;
  public Lingkaran(double jariJari) {
    this.jariJari = jariJari;
  }
  public double hitungKeliling() {
    double keliling = 2 * Math.PI * jariJari;
    return keliling;
  }
}
// class Asersi2
public class Asersi2 {
  public static void main(String[] args) {
    double jariJari = 0;
    assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("Keliling lingkaran = " + kelilingLingkaran);
  }
}

/*
 Pertanyaan : Secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan!
 Jawaban : Asersi Seharusnya Tidak Menggantikan Validasi di Konstruktor.
           Kode diatas menggunakan asersi di dalam main, tetapi tidak ada validasi di dalam konstruktor Lingkaran, 
           yang bisa menyebabkan masalah jika class ini digunakan di tempat lain tanpa asersi.
           Seharusnya terdapat validasi yang terletak pada konstruktor, bukan hanya di main.
*/
