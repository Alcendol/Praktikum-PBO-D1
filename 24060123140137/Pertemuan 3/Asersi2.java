/*
 * Nama File    : AngkaSial.java
 * Pembuat      : Noval Putra B / 24060123140137
 * Tanggal      : 10 Maret 2025
 */
package pertemuan3;

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
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeiling();

    System.out.println("Keliling lingkaran = " + kelilingLingkaran);
  }
}

/*
 * Pertanyaan : ditulis
 * Jawaban : assert lebih baik melekat pada konstruktor, dan penulisan pesan
 * error yang diperbaiki menjadi blalba
 */
