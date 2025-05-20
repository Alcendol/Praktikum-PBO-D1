/* Nama File : Pegawai.java
*  Deskripsi : Atribut dan Method class Pegawai
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7a;

public class Pegawai {
    /*--------ATRIBUT--------*/
    protected String nama;
    protected int gajiPokok = 5000000;

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Pegawai(String nama){
        this.nama = nama;
    }

    // Selektor nama
    public String getNama() {
        return nama;
    }

    // Selektor gajiPokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Mutator nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Abstract method tampilData() untuk menampilkan data pegawai
    public void tampilData() {
        System.out.println("Nama : " + getNama() + ", Gaji pokok : " + getGajiPokok());
    }
}