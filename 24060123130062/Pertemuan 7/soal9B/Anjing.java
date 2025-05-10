package soal9B;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
public class Anjing extends Anabul{

    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + ": bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(this.nama + ": bersuara GUKGUK");
    }
}
