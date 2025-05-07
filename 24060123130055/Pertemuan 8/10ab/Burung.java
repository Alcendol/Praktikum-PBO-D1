public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi cuit!");
    }
}
