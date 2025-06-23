/*
 * Nama File : MainCobaAnabul.java
 * Deskripsi : Program utama untuk mencoba langsung kelas Anabul dan subclass-nya
 * Pembuat   : Patricia Gabrielle Yudianto
 * Tanggal   : 6 Mei 2025
 */
public class MainCobaAnabul {
    public static void main(String[] args) {
        Anabul k = new Kucing("Mimi");
        Anabul a = new Anjing("Doggo");
        Anabul b = new Burung("Tweety");

        System.out.println("=== Coba Kelas Anabul Langsung ===");
        k.gerak();   // Mimi bergerak dengan melata
        k.bersuara(); // Mimi bersuara meong

        a.gerak();   // Doggo bergerak dengan melata
        a.bersuara(); // Doggo bersuara guk-guk

        b.gerak();   // Tweety bergerak dengan terbang
        b.bersuara(); // Tweety bersuara cuit
    }
}
