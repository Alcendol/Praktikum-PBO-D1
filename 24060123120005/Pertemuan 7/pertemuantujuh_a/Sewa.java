/*
 * Nama File : Sewa.java
 * Deskripsi : Main Class untuk percobaan Inclusion
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}

/*
 * Analisa keuntungan jika kita mempunyai method hitungSewa(Vehicle v) :
 * Dengan inclusion kita tidak perlu menulis banyak versi method khusus untuk
 * tiap jenis kendaraan, cukup satu
 * method yang menerima parameter bertipe Vehicle.
 * Keuntungannya :
 * - Semua pemanggilan sewa dengan ca
 * cukup kita perbarui di satu tempat
 * - Kalo nanti ada Truck atau lainnya, tinggal buat subclass baru dan hitung
 * ewa tidak perlu diub
 * - Tidak ada duplikasi kode atau overload dengan berbagai versi, cukup satu 
 * aris v.calRent(..
 - Kode yang memanggil sewa tidak perlu tau detail tiap kendaraan, cukup tau 
 */

 