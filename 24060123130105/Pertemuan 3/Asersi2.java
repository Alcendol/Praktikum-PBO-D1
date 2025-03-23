/*
 * Nama File    : Asersi2.java
 * Deskripsi    : Program untuk menunjjukkan asersi
 * Pembuat      : Nadzif Silakhudin / 240601230105
 * Tanggal      : 10 Maret 2025
 */
// class lingkaran
class Lingkaran {
  private double jariJari;

  public Lingkaran(double jariJari) {
    
    this.jariJari = jariJari;
  }

  public double hitungKeiling() {
    double keliling = 2 * Math.PI * jariJari;
    return keliling;
  }
}

public class Asersi2 {
  public static void main(String[] args) {
    double jariJari = 0;
    assert (jariJari > 0) : "jari-jari tidak boleh kurang dari sama dengan nol!!!";
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeiling();

    System.out.println("Keliling lingkaran = " + kelilingLingkaran);
  }
}

/*
 PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
Jelaskan pada lembar laporan praktikum!
 JAWABAN : Asersi sebaiknya diletakkan pada method sehingga dapat mempermudah dalam melakukan debugging
 sehingga tidak perlu menulis asersi secara terus menerus saat melakukan pengecekan inputan.
 */
