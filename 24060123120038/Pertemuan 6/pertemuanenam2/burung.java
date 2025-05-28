package pertemuanenam2;
/*  Nama File   : burung.java
 *  Deskripsi   : Program kelas burung yang merupakan turunan dari kelas anabul
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

public class burung extends anabul {
    public burung(String nama) {
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
