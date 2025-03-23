/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut,method,selektor dan mutator
 * Pembuat : Muhammad Firzi Ryadi/24060123140202
 * Tanggal : Rabu, 26 Februari 2025
 */
package p1;

public class Kendaraan {
    //atribut
    private String noplat;
    private String jenis;

    //method
    public Kendaraan() {
        this.noplat = "";
        this.jenis = "";
    }

    public Kendaraan(String noplat,String jenis) {
        this.noplat = noplat;
        this.jenis = jenis;
    }
    public String getnoplat() {
        return this.noplat;
    }
    public String getjenis () {
        return this.jenis;
    }
    public void setnoplat(String noplat){
        this.noplat = noplat;
    }
    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
}
