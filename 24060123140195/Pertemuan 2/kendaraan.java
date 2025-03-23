/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut,method,selektor dan mutator
 * Pembuat : Nayaka Fauzan Prasetyo/24060123140195
 * Tanggal : Rabu, 26 Februari 2025
 */
package pertemuan2;

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