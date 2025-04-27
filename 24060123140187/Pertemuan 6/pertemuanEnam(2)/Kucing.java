/* Nama File : Kucing.java
 * Deskripsi : Berisi class Kucing
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam(2);


public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println("bergerak dengan cara melata");
    }

    @Override
    public void bersuara() {
        System.out.println("bersuara: Meong!");
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
}

