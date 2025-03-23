/* Nama File    : Kendaraan.java
 * Deskripsi    : Berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Patricia Gabrielle Yudianto
 * Tanggal      : 2 Maret 2025
 */

public class Kendaraan {
    // ATRIBUT
    private String noPlat;
    private String jenis;

    // METHOD

    // konstruktor
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // selektor
    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    // mutator
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
