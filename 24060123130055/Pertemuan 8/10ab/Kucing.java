/*
 File         : Kucing.java 
 Deskripsi    : Kelas hewan peliharaan Kucing
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 6 Mei 2025 
*/
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi meong!");
    }
}
