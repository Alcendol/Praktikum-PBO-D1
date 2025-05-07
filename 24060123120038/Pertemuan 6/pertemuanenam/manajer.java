package pertemuanenam;
/*  Nama File   : manajer.java
 *  Deskripsi   : Program kelas manajer yang merupakan turunan dari kelas pegawai
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

public class manajer extends pegawai {
    private int tunjangan = 700000;

    public manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}