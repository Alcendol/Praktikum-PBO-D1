/* Nama File    : Asersi2.java
 * Deskripsi    : Program ini menunjukkan penggunaan asersi yang berfungsi 
 *                untuk menolak input jari-jari lingkaran yang bernilai nol.
 * Pembuat      : Muhammad Paruda Pradayan / 24060123140124
 * Tanggal      : 5/3/2025
 */ 

 class lingkaran {
    private double jarijari;

    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jarijari;
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
 * Penggunaan asersi dalam kode ini kurang sesuai, karena asersi 
 * lebih tepat digunakan untuk mendeteksi kondisi yang tidak seharusnya terjadi 
 * dalam situasi normal selama proses debugging. 
 * Sebagai gantinya, validasi input sebaiknya dilakukan menggunakan if-else, 
 * sehingga program tetap dapat berjalan dengan aman tanpa bergantung pada asersi.
 */
