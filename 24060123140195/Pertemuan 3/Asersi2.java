/* Nama File    : Arsesi2.java
 * Deskripsi    : Program ini menunjukkan penggunaan asersi yang berfungsi 
 *                untuk menolak input jari-jari lingkaran yang bernilai nol.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 5/3/2025
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
  
/*
 * Penggunaan asersi dalam program ini kurang tepat karena asersi lebih sesuai untuk mendeteksi kesalahan logika
 * yang tidak seharusnya terjadi selama pengembangan atau debugging. Dalam kasus ini, asersi digunakan untuk 
 * memeriksa apakah jari-jari lebih besar dari nol sebelum membuat objek lingkaran.
 *
 * Sebaiknya, validasi input dilakukan menggunakan struktur kontrol seperti if-else agar program tetap berjalan 
 * dengan aman, meskipun asersi dinonaktifkan saat runtime. Dengan begitu, jika terjadi kesalahan input, 
 * program dapat memberikan pesan yang lebih jelas kepada pengguna dan menangani kasus tersebut dengan baik.
 */
