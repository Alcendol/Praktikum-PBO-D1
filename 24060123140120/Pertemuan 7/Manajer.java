/* Nama File : Manajer.java
*  Deskripsi : Atribut dan Method class Manajer
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7a;

public class Manajer extends Pegawai {
    /*--------ATRIBUT--------*/
    private int tunjangan = 700000;

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Manajer(String nama) {
        super(nama);
    }

    // Selektor tunjangan
    public int getTunjangan(){
        return tunjangan;
    }

    // Overiding method tampilData() untuk menampilkan data Manajer
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + getTunjangan());
    }
}

