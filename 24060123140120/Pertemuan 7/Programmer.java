/* Nama File : Programmer.java
*  Deskripsi : Atribut dan Method class Programmer
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7a;

public class Programmer extends Pegawai {
    /*--------ATRIBUT--------*/
    private int bonus = 450000;

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Programmer(String nama) {
        super(nama);
    }

    // Selektor bonus
    public int getBonus(){
        return bonus;
    }

    // Overiding method tampilData() untuk menampilkan data Programmer
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + getBonus());
    }
}

