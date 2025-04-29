/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Nasywa Alya Kamila
 * Tanggal      : 11/3/2025
 */ 

 class lingkaran {
    private double jarijari;

    public lingkaran (double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungKeliling () {
        double keliling = 2 + Math.PI * jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 5;
        assert (jarijari > 0) : "Jari-jari tidak boleh nol";
        lingkaran L = new lingkaran(jarijari);
        double kelilingLingkaran = L.hitungKeliling();

        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }    
}

/* 
 * Penggunaan asersi kurang tepat karena asersi 
 * seharusnya digunakan untuk mendeteksi kondisi yang tidak mungkin 
 * terjadi dalam keadaan normal selama debugging, bukan sebagai 
 * mekanisme utama untuk memvalidasi input, yang seharusnya 
 * ditangani dengan if-else agar program tetap dapat berjalan dengan aman
 */