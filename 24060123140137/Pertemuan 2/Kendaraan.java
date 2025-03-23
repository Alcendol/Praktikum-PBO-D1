// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : Kendaraan.java

package pertemuan2;

public class Kendaraan {
    private String noPlat;
    private String jenis; // motor atau mobil

    // Konstruktor
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Getter
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // Setter
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
