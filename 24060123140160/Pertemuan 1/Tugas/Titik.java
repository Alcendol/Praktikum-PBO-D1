/*
Nama File : Titik.java
Deskripsi : Berisi atribut dan method dalam class Titik untuk operasi pada bidang koordinat
Pembuat : Pieter Mikha Pangondian Partogi Sihombing
Tanggal : 20 - Februari - 2025
*/

public class Titik {
    // ===== Atribut =====
    private double xCoord;     // menggantikan 'absis'
    private double yCoord;     // menggantikan 'ordinat'
    private static int totalPoints = 0;  // menggantikan 'counterTitik'

    // ===== Konstruktor =====
    // Konstruktor utama (parameter x dan y)
    public Titik(double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
        totalPoints++;
    }

    // Konstruktor tanpa parameter
    public Titik() {
        // Panggil konstruktor utama dengan (0,0)
        this(0, 0);
    }

    // ===== Metode Statis =====
    // Mengembalikan jumlah objek Titik yang sudah dibuat
    public static int getTotalPoints() {
        return totalPoints;
    }

    // ===== Getter dan Setter =====
    public double getXCoord() {
        return xCoord;
    }

    public void setXCoord(double x) {
        xCoord = x;
    }

    public double getYCoord() {
        return yCoord;
    }

    public void setYCoord(double y) {
        yCoord = y;
    }

    // ===== Metode Lain =====

    // Geser titik sejauh (deltaX, deltaY)
    public void shift(double deltaX, double deltaY) {
        xCoord += deltaX;
        yCoord += deltaY;
    }

    // Cetak koordinat titik
    public void showPoint() {
        System.out.println("Titik (" + xCoord + ", " + yCoord + ")");
    }

    // Mendapatkan kuadran titik
    public int getQuadrant() {
        if (xCoord > 0 && yCoord > 0) return 1;
        if (xCoord < 0 && yCoord > 0) return 2;
        if (xCoord < 0 && yCoord < 0) return 3;
        if (xCoord > 0 && yCoord < 0) return 4;
        return 0; // di sumbu X atau Y
    }

    // Jarak titik ini dari pusat (0,0)
    public double distanceFromOrigin() {
        return Math.sqrt((xCoord * xCoord) + (yCoord * yCoord));
    }

    // Jarak antara titik ini dengan titik lain
    public double distanceTo(Titik other) {
        double dx = xCoord - other.xCoord;
        double dy = yCoord - other.yCoord;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Merefleksikan titik ini terhadap sumbu X
    public void reflectOverX() {
        yCoord = -yCoord;
    }

    // Merefleksikan titik ini terhadap sumbu Y
    public void reflectOverY() {
        xCoord = -xCoord;
    }

    // Mengembalikan objek Titik baru hasil refleksi sumbu X
    public Titik getReflectedOverX() {
        return new Titik(xCoord, -yCoord);
    }

    // Mengembalikan objek Titik baru hasil refleksi sumbu Y
    public Titik getReflectedOverY() {
        return new Titik(-xCoord, yCoord);
    }
}
