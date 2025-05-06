/*
    Nama File : Main.java
    Deskripsi : Program utama untuk membuat objek BangunDatar, Persegi, dan Lingkaran serta menampilkan informasi dan jumlah objek yang dibuat.
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 17 Maret 2025
*/

public class Main {
    public static void main(String[] args) {

        // Membuat beberapa objek BangunDatar
        BangunDatar bd1 = new BangunDatar(4, "Merah", "Tebal");
        BangunDatar bd2 = new BangunDatar(3, "Biru", "Tipis");
        BangunDatar bd3 = new BangunDatar(0, "Hijau", "Sedang");

        // Menampilkan informasi masing-masing bangun datar
        System.out.println("Informasi Bangun Datar 1 :");
        bd1.printInfo();
        System.out.println();

        System.out.println("Informasi Bangun Datar 2 :");
        bd2.printInfo();
        System.out.println();

        System.out.println("Informasi Bangun Datar 3 :");
        bd3.printInfo();
        System.out.println();

        // Menampilkan jumlah total objek BangunDatar yang sudah dibuat
        System.out.println("Total Bangun Datar yang dibuat: " + BangunDatar.getCounterBangunDatar());

        System.out.println("\n====================\n");

        // Membuat objek persegi
        Persegi p1 = new Persegi(5, "merah", "tipis");
        Persegi p2 = new Persegi(7, "ungu", "tebal");

        // Menampilkan info persegi
        System.out.println("Luas Persegi P1 : " + p1.getLuas());
        System.out.println("Keliling Persegi P1 : " + p1.getKeliling());
        p1.printInfo();

        System.out.println();

        System.out.println("Luas Persegi P2 : " + p2.getLuas());
        System.out.println("Keliling Persegi P2 : " + p2.getKeliling());
        p2.printInfo();

        System.out.println("\n====================\n");

        // Membuat objek lingkaran
        Lingkaran L1 = new Lingkaran(10, "putih", "tebal");
        Lingkaran L2 = new Lingkaran(7, "pink", "tipis");

        // Menampilkan info lingkaran
        System.out.println("Luas Lingkaran L1 : " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1 : " + L1.getKeliling());
        L1.printInfo();

        System.out.println();

        System.out.println("Luas Lingkaran L2 : " + L2.getLuas());
        System.out.println("Keliling Lingkaran L2 : " + L2.getKeliling());
        L2.printInfo();

        System.out.println("\n====================\n");

    }
}
