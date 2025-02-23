/*
Nama File : MTitik.java
Deskripsi : Berisi program utama untuk menguji class Titik dan metodenya
Pembuat : Pieter Mikha Pangondian Partogi Sihombing
Tanggal : 20 - Februari - 2025
*/

public class MTitik {
    public static void main(String[] args) {
        // Membuat titik pertama (3, 4)
        Titik coord1 = new Titik(3, 4);
        coord1.showPoint();

        // Uji kuadran
        System.out.println("coord1 berada di kuadran: " + coord1.getQuadrant());

        // Uji jarak dari pusat
        System.out.println("Jarak coord1 dari (0,0): " + coord1.distanceFromOrigin());

        // Membuat titik kedua (-3, -4)
        Titik coord2 = new Titik(-3, -4);
        coord2.showPoint();

        // Uji jarak antara dua titik
        System.out.println("Jarak antara coord1 dan coord2: " + coord1.distanceTo(coord2));

        // Uji refleksi terhadap sumbu X
        coord1.reflectOverX();
        System.out.println("coord1 setelah refleksi sumbu X:");
        coord1.showPoint();

        // Uji refleksi terhadap sumbu Y
        coord2.reflectOverY();
        System.out.println("coord2 setelah refleksi sumbu Y:");
        coord2.showPoint();

        // Membuat titik baru hasil refleksi X
        Titik coord3 = coord1.getReflectedOverX();
        System.out.println("coord3 adalah hasil refleksi coord1 terhadap sumbu X:");
        coord3.showPoint();

        // Membuat titik baru hasil refleksi Y
        Titik coord4 = coord2.getReflectedOverY();
        System.out.println("coord4 adalah hasil refleksi coord2 terhadap sumbu Y:");
        coord4.showPoint();

        // Tampilkan jumlah objek Titik
        System.out.println("Total objek Titik: " + Titik.getTotalPoints());
    }
}
