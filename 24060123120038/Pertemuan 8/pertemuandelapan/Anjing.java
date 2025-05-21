package pertemuandelapan;

/*  Nama File   : Anjing.java
 *  Deskripsi   : Program untuk menunjukkan kelas Anjing yang mewarisi kelas Anabul.
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 07 Mei 2025
*/

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
