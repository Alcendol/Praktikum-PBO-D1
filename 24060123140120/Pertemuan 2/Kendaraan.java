// Nama File : Kendaraan.java
// Deskripsi : Atribut dan Method class Kendaraan
// Pembuat : Muhammad Shafwan Raihan S
// Tanggal : 27 / 02 / 2025

public class Kendaraan {

    /*----------ATRIBUT----------*/
    private String noPlat;
    private String jenis;

    /*----------METHOD----------*/
    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor NoPlat
    public String getNoPlat() {
        return noPlat;
    }

    // Selektor Jenis
    public String getJenis() {
        return jenis;
    }

    // Mutator NoPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Mutator Jenis
    public void setJenis(String jenis) {
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.jenis = jenis;
        } else {
            System.out.println("Jenis kendaraan hanya bisa motor atau mobil.");
        }
    }

    public String toString() {
        return "Kendaraan: " + jenis + " (" + noPlat + ")";
    }
}
