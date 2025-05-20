/*
 File         : Anjing.java 
 Deskripsi    : Kelas hewan peliharaan Anjing
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 6 Mei 2025 
*/
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara guk-guk!");
    }
}
