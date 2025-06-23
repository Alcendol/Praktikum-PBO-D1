package soal9A;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Buntar");
        Pegawai pegawai2 = new Manajer("Anton");
        Manajer pegawai3 = new Manajer("Utop");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for(Pegawai emp : emps){
            emp.tampilData();
            System.err.println();
        }
    }
}
