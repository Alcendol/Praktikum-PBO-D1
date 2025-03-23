/* 
 * Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol.
 * Pembuat      : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal      : Senin, 3 Februari 2025
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
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeiling();

    System.out.println("Keliling lingkaran = " + kelilingLingkaran);
  }
}


//   Pada Asersi2.java:
// - Di dalam konstruktor Lingkaran terdapat asersi (assert jariJari > 0) yang memastikan bahwa jari-jari harus lebih dari nol.
// - Karena nilai jariJari di main diset ke 0, asersi tersebut gagal. Akibatnya, AssertionError dilempar dengan pesan 
//   "jari-jari tidak boleh kurang dari sama dengan nol!!!".
// - dengan demikian, objek Lingkaran tidak berhasil dibuat dan eksekusi program akan terhenti pada asersi.
// - Secara konsep, asersi digunakan untuk mendeteksi kondisi yang dianggap tidak mungkin terjadi selama debugging, 
//   namun sebaiknya validasi juga dilakukan dengan if-else agar program tetap aman saat asersi dinonaktifkan.
// kesimpulan: pada Asersi2.java, penggunaan asersi menunjukkan bahwa nilai jari-jari yang tidak valid (0) mencegah 
// pembuatan objek Lingkaran, dan program akan mengeluarkan pesan error sesuai asersi.