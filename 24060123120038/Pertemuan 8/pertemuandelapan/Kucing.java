package pertemuandelapan;

/*  Nama File   : Kucing.java
 *  Deskripsi   : Program untuk menunjukkan kelas Kucing yang mewarisi kelas Anabul.
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 07 Mei 2025
*/

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
