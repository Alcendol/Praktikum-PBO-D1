package soal9B;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Anabul anjing = new Anjing("Gery");
        Anabul kucing = new Kucing("Blacky");
        Anabul burung = new Burung("Ichibos");
        
        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(burung);
        anabuls.add(kucing);
        anabuls.add(anjing);
        
        for(Anabul anabul : anabuls){
            anabul.Bersuara();
        }

    }
}
