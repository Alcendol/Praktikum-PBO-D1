/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam class Anjing
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan;

public class Anjing extends Anabul {
    public Anjing(String nama) {super(nama); 
    }

    @Override
    public void bersuara() {System.out.println("Anjing " + nama + " berbunyi: Guk-guk!");
    }

    @Override
    public void bergerak() {System.out.println("Anjing " + nama + " bergerak dengan melata.");
    }
}
