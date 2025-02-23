/*
Nama File : Garis.java
Deskripsi : Berisi atribut dan method dalam class Garis untuk pemrograman berorientasi objek
Pembuat : Pieter Mikha Pangondian Partogi Sihombing
Tanggal : 20 - Februari - 2025
*/


public class Garis {
    // Atribut: titik awal, titik akhir, dan counter statik untuk menghitung jumlah objek Garis
    private Titik titikStart;
    private Titik titikEnd;
    private static int totalLinesCreated = 0;

    // a. Konstruktor tanpa parameter:
    // Inisialisasi titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        this.titikStart = new Titik(0, 0);
        this.titikEnd = new Titik(1, 1);
        totalLinesCreated++;
    }

    // b. Konstruktor dengan parameter (titik awal dan titik akhir)
    public Garis(Titik tAwal, Titik tAkhir) {
        this.titikStart = tAwal;
        this.titikEnd = tAkhir;
        totalLinesCreated++;
    }

    // c. Getter dan Setter untuk titik awal dan titik akhir,
    //    serta getter statik untuk totalLinesCreated
    public Titik getTitikStart() {
        return titikStart;
    }

    public void setTitikStart(Titik tAwal) {
        this.titikStart = tAwal;
    }

    public Titik getTitikEnd() {
        return titikEnd;
    }

    public void setTitikEnd(Titik tAkhir) {
        this.titikEnd = tAkhir;
    }

    public static int getTotalLinesCreated() {
        return totalLinesCreated;
    }

    // d. Method untuk mendapatkan panjang garis
    public double getLength() {
        // Menggunakan metode distanceTo dari kelas Titik
        return titikStart.distanceTo(titikEnd);
    }

    // e. Method untuk mendapatkan gradien garis
    public double getSlope() {
        double deltaX = titikEnd.getXCoord() - titikStart.getXCoord();
        if (Math.abs(deltaX) < 1e-9) {
            return Double.POSITIVE_INFINITY;
        }
        double deltaY = titikEnd.getYCoord() - titikStart.getYCoord();
        return deltaY / deltaX;
    }

    // f. Method untuk mendapatkan titik tengah garis
    public Titik getMidPoint() {
        double midX = (titikStart.getXCoord() + titikEnd.getXCoord()) / 2.0;
        double midY = (titikStart.getYCoord() + titikEnd.getYCoord()) / 2.0;
        return new Titik(midX, midY);
    }

    // g. Method untuk mengecek apakah garis ini sejajar dengan garis lain
    public boolean isParallel(Garis other) {
        double slope1 = this.getSlope();
        double slope2 = other.getSlope();
        if (Double.isInfinite(slope1) && Double.isInfinite(slope2)) {
            return true;
        }
        return Math.abs(slope1 - slope2) < 1e-9;
    }

    // h. Method untuk mengecek apakah garis ini tegak lurus dengan garis lain
    public boolean isPerpendicular(Garis other) {
        double slope1 = this.getSlope();
        double slope2 = other.getSlope();
        if (Double.isInfinite(slope1) && Math.abs(slope2) < 1e-9) {
            return true;
        }
        if (Double.isInfinite(slope2) && Math.abs(slope1) < 1e-9) {
            return true;
        }
        if (Double.isInfinite(slope1) || Double.isInfinite(slope2)) {
            return false;
        }
        return Math.abs(slope1 * slope2 + 1) < 1e-9;
    }

    // i. Method untuk menampilkan titik awal dan titik akhir garis
    public void showLine() {
        System.out.print("Garis: ");
        titikStart.showPoint();
        System.out.print(" - ");
        titikEnd.showPoint();
    }

    // j. Method untuk menampilkan persamaan garis dalam bentuk "y = mx + c" atau "x = k" jika vertikal
    public String getLineEquation() {
        double deltaX = titikEnd.getXCoord() - titikStart.getXCoord();
        if (Math.abs(deltaX) < 1e-9) {
            return "x = " + titikStart.getXCoord();
        } else {
            double m = this.getSlope();
            double c = titikStart.getYCoord() - m * titikStart.getXCoord();
            String equation = "y = " + m + "x";
            if (c > 0) {
                equation += " + " + c;
            } else if (c < 0) {
                equation += " - " + (-c);
            }
            return equation;
        }
    }
}
