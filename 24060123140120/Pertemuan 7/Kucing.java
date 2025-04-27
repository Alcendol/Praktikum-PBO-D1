/* Nama File : Kucing.java
*  Deskripsi : Atribut dan Method class Kucing
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7b;

public class Kucing extends Anabul {
    /*--------ATRIBUT--------*/

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Kucing(String Nama) {
        super(Nama);
    }

    // Overiding Method suara() untuk suara Kucing
    @Override
    public void suara() {
        System.out.println("Meong...");
    }

    // Overiding Method gerakan() untuk gerakan Kucing
    @Override
    public void gerakan() {
        System.out.println("(Melata)");
    }
}
