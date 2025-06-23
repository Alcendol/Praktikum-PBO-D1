/* Nama File : Burung.java
*  Deskripsi : Atribut dan Method class Burung
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7b;

public class Burung extends Anabul {
    /*--------ATRIBUT--------*/

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Burung(String Nama) {
        super(Nama);
    }

    // Overiding Method suara() untuk suara Burung
    @Override
    public void suara() {
        System.out.println("Cuit...");
    }

    // Overiding Method gerakan() untuk gerakan Burung
    @Override
    public void gerakan() {
        System.out.println("(Terbang)");
    }
}
