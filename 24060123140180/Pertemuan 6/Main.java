package Pertemuan6;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Anabul hewan = new Kucing("Ho'oh", "Kucing Bengal", "Coklat");
        Anabul hewan2 = new Burung("Bagor", "Jalak Suren", "Hitam Putih");
        Anabul hewan3 = new Anjing("Koko", "Dachshund", "Hytam");

        ArrayList<Anabul> emps = new ArrayList<>();
        emps.add(hewan);
        emps.add(hewan2);
        emps.add(hewan3);
        for (Anabul emp : emps) {
            emp.Gerak();
            emp.Suara();
            
        }


    }
    
}
