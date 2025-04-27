
public class Kucing extends Anabul {


    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + " Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + " Meong");
    }
    
}
