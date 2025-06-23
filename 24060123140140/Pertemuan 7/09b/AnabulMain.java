public class AnabulMain {
    public static void main(String[] args) {
        // Membuat array dari objek Anabul
        Anabul[] hewanPeliharaan = new Anabul[3];
        
        // Inisialisasi objek
        hewanPeliharaan[0] = new Kucing("Meong....");
        hewanPeliharaan[1] = new Anjing("WOPWOPPPPP");
        hewanPeliharaan[2] = new Burung("WIT WIT");
        
        // Memanggil method untuk semua objek
        System.out.println("=== SIMULASI ANABUL ===");
        for (Anabul hewan : hewanPeliharaan) {
            System.out.println("\nNama: " + hewan.getNama());
            hewan.gerak();
            hewan.bersuara();
        }
    }
}