/* Nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam class Kucing
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan;

public class Kucing extends Anabul{
    public Kucing(String nama) {super(nama);
    }

    @Override
    public void bersuara() {System.out.println("Kucing " + nama + " berbunyi: Meong!");
    }

    @Override
    public void bergerak() {System.out.println("Kucing " + nama + " bergerak dengan melata.");
    }
}
