/* Nama File : Main.java
*  Deskripsi : Main program class Datum 
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 07 / 05 / 2025
*/

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> kucing = new Datum<>(new Kucing());
        Datum<Anjing> anjing = new Datum<>(new Anjing());
        Datum<Burung> burung = new Datum<>(new Burung());

        System.out.println("Kucing:");
        ContohMetodeGenerik.tampilkanPerilaku(kucing);
        
        System.out.println("\nAnjing:");
        ContohMetodeGenerik.tampilkanPerilaku(anjing);
        
        System.out.println("\nBurung:");
        ContohMetodeGenerik.tampilkanPerilaku(burung);
    }
}