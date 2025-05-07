/* Nama File : Burung.java
 * Deskripsi : Berisi atribut dan method dalam class Burung
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan;

public class Burung extends Anabul {
    public Burung(String nama) {super(nama); 
    }

    @Override
    public void bersuara() {System.out.println("Burung " + nama + " berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {System.out.println("Burung " + nama + " bergerak dengan terbang.");
    }
}

