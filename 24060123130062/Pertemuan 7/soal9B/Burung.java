package soal9B;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
public class Burung extends Anabul{
    

    public Burung(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + ": bergerak dengan terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println(nama + ": bersuara cuit cuit ichiboss");
    }
}
