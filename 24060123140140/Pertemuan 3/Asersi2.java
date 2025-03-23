/*
 * Nama File    : Asersi2.java
 * Deskripsi    : Program untuk menunjukan asersi
 * Pembuat      : Raditya Saputra / 24060123140140
 * Tanggal      : 10 Maret 2025
 */

// class lingkaran
class Lingkaran {
  private double jariJari;

  public Lingkaran(double jariJari) {
    assert (jariJari > 0) : "jari-jari tidak boleh kurang dari sama dengan nol!!!";
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
    assert (jariJari> 0) : "jari-jari tidak boleh kurang dari sama dengan nol!!!";
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeiling();

    System.out.println("Keliling lingkaran = " + kelilingLingkaran);
  }
}

/*
 * Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
 * Jawaban : Asersi sebaiknya diletakkan pada method sehingga dapat mempermudah dalam melakukan debugging
 sehingga tidak perlu menulis asersi secara terus menerus saat melakukan pengecekan inputan.
 */
