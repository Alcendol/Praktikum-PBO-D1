/* Nama File : Burung.java
 * Deskripsi : Berisi class Burung
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam(2);


public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println("bergerak dengan cara terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("bersuara: Cuit!");
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

