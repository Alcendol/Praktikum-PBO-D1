/* Nama File : Manajer.java
 * Deskripsi : Berisi class Manajer
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam;

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String Nama) {
        super(Nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}

