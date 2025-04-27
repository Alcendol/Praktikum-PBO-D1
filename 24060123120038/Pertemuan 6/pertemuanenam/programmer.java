package pertemuanenam;
/*  Nama File   : programmer.java
 *  Deskripsi   : Program kelas programmer yang merupakan turunan dari kelas pegawai
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

public class programmer extends pegawai {
    private int bonus = 450000;

    public programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}