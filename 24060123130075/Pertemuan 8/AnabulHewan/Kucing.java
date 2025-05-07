package AnabulHewan;

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(
            nama + " si Kucing bergerak dengan melata."
        );
    }

    @Override
    public void Bersuara() {
        System.out.println(
            nama + " si Kucing bersuara meong."
        );
    }
}