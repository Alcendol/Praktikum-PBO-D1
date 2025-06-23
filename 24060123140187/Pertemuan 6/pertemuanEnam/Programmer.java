/* Nama File : Programmer.java
 * Deskripsi : Berisi class programmer
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String Nama) {
        super(Nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}

