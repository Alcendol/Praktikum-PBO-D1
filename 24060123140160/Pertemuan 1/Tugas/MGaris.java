/*
Nama File : MGaris.java
Deskripsi : Berisi program utama untuk menguji class Garis yang menggunakan class Titik
Pembuat : Pieter Mikha Pangondian Partogi Sihombing
Tanggal : 20 - Februari - 2025
*/


public class MGaris {
    public static void main(String[] args) {
        System.out.println("=== Testing Garis (Default Constructor) ===");
        Garis g1 = new Garis();
        g1.showLine();
        System.out.println("Persamaan garis: " + g1.getLineEquation());
        System.out.println("Panjang garis: " + g1.getLength());
        System.out.println("Gradien garis: " + g1.getSlope());
        System.out.print("Titik tengah: ");
        g1.getMidPoint().showPoint();
        System.out.println();

        System.out.println("=== Testing Garis (Parameterized Constructor) ===");
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g2 = new Garis(t1, t2);
        g2.showLine();
        System.out.println("Persamaan garis: " + g2.getLineEquation());
        System.out.println("Panjang garis: " + g2.getLength());
        System.out.println("Gradien garis: " + g2.getSlope());
        System.out.print("Titik tengah: ");
        g2.getMidPoint().showPoint();
        System.out.println();

        System.out.println("=== Testing Hubungan Antargaris ===");
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(3, 5);
        Garis g3 = new Garis(t3, t4);
        g3.showLine();
        System.out.println("Garis g2 dan g3 sejajar? " + g2.isParallel(g3));
        System.out.println("Garis g2 dan g3 tegak lurus? " + g2.isPerpendicular(g3));
        System.out.println();

        System.out.println("Jumlah objek Garis = " + Garis.getTotalLinesCreated());
    }
}
