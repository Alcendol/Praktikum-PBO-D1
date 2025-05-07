package pertemuandelapan;

/*  Nama File   : Burung.java
 *  Deskripsi   : Program untuk menunjukkan kelas Burung yang mewarisi kelas Anabul
 *                dan mengimplementasikan perilaku suara dan gerakan untuk Burung.
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 07 Mei 2025
*/

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
