/*
File         : Main.java
Deskripsi    : Main class untuk menguji Abstract Class BangunDatar dan Interface IResize
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 20 Maret 2025
*/

public class Main {
    public static void main(String[] args) {
        // Tidak dapat membuat objek langsung dari BangunDatar karena abstract
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);
        
        // Memanggil method getLuas dan getKeliling
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());
        
        // Menggunakan method pembanding
        System.out.println("P1 dan P2 memiliki luas sama? " + P1.isEqualLuas(P2));
        System.out.println("P1 dan L1 memiliki keliling sama? " + P1.isEqualKeliling(L1));
        
        // Mencoba method zoomIn() dan zoomOut() melalui interface IResize
        P2.zoomIn();
        L2.zoomOut();
        System.out.println("\nSetelah zoomIn pada P2:");
        P2.cetakInfo();
        System.out.println("\nSetelah zoomOut pada L2:");
        L2.cetakInfo();
    }
}
