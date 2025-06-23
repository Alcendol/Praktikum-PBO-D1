/* Nama File : Anjing.java
*  Deskripsi : Atribut dan Method class Anjing
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7b;

public class Anjing extends Anabul {
    /*--------ATRIBUT--------*/

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Anjing(String Nama) {
       super(Nama);
    }

    // Overiding Method suara() untuk suara Anjing
    @Override
    public void suara() {
        System.out.println("Guk-guk...");
    }

    // Overiding Method gerakan() untuk gerakan Anjing
    @Override
    public void gerakan() {
        System.out.println("(Melata)");
    }
}
