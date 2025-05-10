package soal9B;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
public class Kucing extends Anabul{

    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + ": bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(nama + ": bersuara MEONGGG");
    }
}
