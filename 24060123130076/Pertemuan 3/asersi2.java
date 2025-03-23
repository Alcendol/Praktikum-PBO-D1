/*
 * Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 10 Maret 2025
 */

// class lingkaran
class Lingkaran {
    private double jariJari;
  
    public Lingkaran(double jariJari) {
      assert (jariJari > 0) : "jari-jari tidak boleh kurang dari sama dengan nol!!!";
      this.jariJari = jariJari;
    }
  
    public double hitungKeliling() {
      double keliling = 2 * Math.PI * jariJari;
      return keliling;
    }
  }
  
  public class asersi2 {
    public static void main(String[] args) {
      double jariJari = 0;
      Lingkaran l = new Lingkaran(jariJari);
      double kelilingLingkaran = l.hitungKeliling();
  
      System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
  }
  
  /*
   * Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
      Jelaskan pada lembar laporan praktikum! 
   * Jawaban : Penggunaan asersi digunakan untuk debugging sehingga kurang tepat apabila digunakan untuk validasi input. 
   * Dengan begitu, assert lebih baik melekat pada konstruktor
   */
  