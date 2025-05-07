package AnabulHewan;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(
            nama + " si Anjing bergerak dengan melata."
        );
    }

    @Override
    public void Bersuara() {
        System.out.println(
            nama + " si Anjing bersuara guk-guk."
        );
    }
}