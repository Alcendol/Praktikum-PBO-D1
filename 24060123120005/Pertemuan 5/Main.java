/*  
    Nama File : Main.java  
    Deskripsi : Program utama untuk menguji kelas BangunDatar, Persegi, dan Lingkaran, serta fitur dari interface IResize
    Pembuat   : Patricia Gabrielle Yudianto  
    NIM       : 24060123120005  
    Tanggal   : 22 Maret 2025  
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Uji BangunDatar =====");
        System.out.println("Jumlah Bangun Datar: " + BangunDatar.getCounterBangunDatar());

        // Uji Persegi tanpa warna dan border
        System.out.println("\n===== Uji Persegi =====");
        Persegi persegi1 = new Persegi(10);
        Persegi persegi2 = new Persegi(7);

        System.out.println("Luas Persegi 1: " + persegi1.getLuas());
        System.out.println("Keliling Persegi 1: " + persegi1.getKeliling());
        System.out.println("Luas Persegi 2: " + persegi2.getLuas());
        System.out.println("Keliling Persegi 2: " + persegi2.getKeliling());
        System.out.println("Apakah luas Persegi 1 sama dengan Persegi 2? " + persegi1.isEqualLuas(persegi2));

        System.out.println("Sisi Persegi 2 sebelum zoom in: " + persegi2.getSisi());
        persegi2.zoomIn();
        System.out.println("Sisi Persegi 2 setelah zoom in: " + persegi2.getSisi());

        System.out.println("\nInformasi Persegi 1:");
        persegi1.printInfo();

        System.out.println("\nInformasi Persegi 2:");
        persegi2.printInfo();

        // Uji Lingkaran tanpa warna dan border
        System.out.println("\n===== Uji Lingkaran =====");
        Lingkaran lingkaran1 = new Lingkaran(7);
        Lingkaran lingkaran2 = new Lingkaran(14);

        System.out.println("Luas Lingkaran 1: " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran 1: " + lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran 2: " + lingkaran2.getKeliling());
        System.out.println("Apakah luas Lingkaran 1 sama dengan Lingkaran 2? " + lingkaran1.isEqualLuas(lingkaran2));

        System.out.println("Jari-jari Lingkaran 1 sebelum zoom in: " + lingkaran1.getJari());
        lingkaran1.zoomIn();
        System.out.println("Jari-jari Lingkaran 1 setelah zoom in: " + lingkaran1.getJari());

        System.out.println("\nInformasi Lingkaran 1:");
        lingkaran1.printInfo();

        System.out.println("\nInformasi Lingkaran 2:");
        lingkaran2.printInfo();

        // Uji Perbandingan Bangun Datar Berbeda Jenis
        System.out.println("\n===== Perbandingan Bangun Datar Berbeda Jenis =====");
        System.out.println("Apakah luas Persegi 1 sama dengan Lingkaran 1? " + persegi1.isEqualLuas(lingkaran1));
        System.out
                .println("Apakah keliling Persegi 1 sama dengan Lingkaran 1? " + persegi1.isEqualKeliling(lingkaran1));

        System.out.println("\n===== Jumlah Objek BangunDatar =====");
        System.out.println("Jumlah Bangun Datar: " + BangunDatar.getCounterBangunDatar());
    }
}
