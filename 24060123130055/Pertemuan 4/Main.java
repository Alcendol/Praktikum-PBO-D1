/* Nama File    : Main.java
 * Deskripsi    : berisi program main
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 15 Maret 2025
 */

 public class Main {
    public static void main(String[] args) {
        // ===== Data Pegawai =====
        System.out.println("=== Data Pegawai ===\n");
        
        // Contoh Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap("123456", "987654", "Budi", "1-1-1960", "1-1-2000", 5000000, "Teknik");
        System.out.println(">> Dosen Tetap:");
        dosenTetap.printInfo();
        System.out.println();
        
        // Contoh Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu("654321", "112233", "Siti", "15-5-1970", "1-6-2010", 4000000, "Matematika", "31-12-2025");
        System.out.println(">> Dosen Tamu:");
        dosenTamu.printInfo();
        System.out.println();
        
        // Contoh Tendik
        Tendik tendik = new Tendik("789012", "Andi", "20-8-1980", "1-3-2015", 3000000, "Administrasi");
        System.out.println(">> Tendik:");
        tendik.printInfo();
        System.out.println();
        
        // ===== Data Bangun Datar =====
        System.out.println("=== Data Bangun Datar ===\n");
        
        // Contoh Persegi
        Persegi persegi = new Persegi(5, "Merah", "Garis Putus-putus");
        System.out.println(">> Persegi:");
        persegi.printInfo();
        System.out.println("Luas Persegi   : " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi.getDiagonal());
        System.out.println();
        
        // Contoh Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println(">> Lingkaran:");
        System.out.println("Jari-Jari       : " + lingkaran.getJari());
        System.out.println("Luas Lingkaran  : " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());
        System.out.println("Diameter Lingkaran: " + lingkaran.getDiameter());
    }
}
